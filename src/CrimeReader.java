import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
public class CrimeReader {

    private int count;
    
public void readCrimes(){
    try {
    Reader reader = Files.newBufferedReader(Paths.get("crime.csv"));
    
    CsvToBean<Crime> csvToBean = new CsvToBeanBuilder<Crime>(reader)
            .withType(Crime.class)
            .withIgnoreLeadingWhiteSpace(true)
            .build();
    
    for(Crime crime : (Iterable<Crime>) csvToBean) {
        if (crime.getGeneralCode().equals("DRIVING UNDER THE INFLUENCE")){
            System.out.println(crime.getDistrict() + ", " + crime.getDispatchDate());
            count++;
        }
    }

reader.close();

System.out.println("There were " + Integer.toString(count) + " DUIs");

    } catch (IOException e) {
        e.printStackTrace();
    }
}
    //public static void main(String[] args) {
      //  CrimeReader cr = new CrimeReader();
//cr.readCrimes();    }
}