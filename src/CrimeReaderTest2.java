import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.zip.GZIPInputStream;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CrimeReaderTest2 {

    
    
    
    public Stream<Crime> readCrimes(){
        ArrayList<Crime> crimeArray = new ArrayList<>();
        CsvToBean<Crime> csvToBean = new CsvToBean<Crime>();
        try {

            FileInputStream fis = new FileInputStream("crime.gz.gz");
            GZIPInputStream gis = new GZIPInputStream(fis);
            InputStreamReader isr = new InputStreamReader(gis);
            BufferedReader br = new BufferedReader(isr);
            CSVReader reader = new CSVReader(br);
    
            csvToBean = new CsvToBeanBuilder<Crime>(reader)//Reads each line of a CSV and parses it into JavaBeans
                    .withType(Crime.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();//Converts rows of csv data to JavaBeans
            //Stream<Crime> crimeStream = StreamSupport.stream(csvToBean.spliterator(), false);            
            
            
            
        } catch (IOException e) {
        e.printStackTrace();
    
        } catch (Exception e) {
            System.err.println("Invoke() failed: " + e);
        }
        return csvToBean.stream();
    }
    public void useStream() throws ParseException{
        Stream<Crime> crimeStream = readCrimes();
        ArrayList<Crime> crimeArray = new ArrayList<Crime>();
        crimeStream = crimeStream.filter(c -> c.getGeneralCode().equals("Arson") && c.getMonth().equals("11"));
        crimeStream.sequential().collect(Collectors.toCollection(() -> crimeArray));
        System.out.println("There were " +crimeArray.size() + " code 100s");
    }
    //public static void main(String[] args) throws ParseException {
      //  CrimeReaderTest2 CRT2 = new CrimeReaderTest2();
        //CRT2.useStream();
   // }
    }

