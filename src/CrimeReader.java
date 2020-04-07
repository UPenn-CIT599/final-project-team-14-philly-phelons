import java.io.*;

import java.nio.file.Files;
import java.nio.file.Paths;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
/**
 * 
 * @author Robby Ballard
 * 
 * This class reads the crime.csv file and returns Crime objects using the OpenCsv library. 
 *
 */
public class CrimeReader {

    private int count;
    /**
     * Reads the CSV. Return statement not added yet. Finalizing using a Stream of objects as an output.
     */
public void readCrimes(){
    try {
    Reader reader = Files.newBufferedReader(Paths.get("crime.csv"));
    
    CsvToBean<Crime> csvToBean = new CsvToBeanBuilder<Crime>(reader)
            .withType(Crime.class)
            .withIgnoreLeadingWhiteSpace(true)
            .build();//Converts rows of csv data to JavaBeans
    
    for(Crime crime : (Iterable<Crime>) csvToBean) { // A test for each loop tod etermine if the reader is actually reading the file
        if (crime.getGeneralCode().equals("DRIVING UNDER THE INFLUENCE")){
            System.out.println(crime.getDistrict() + ", " + crime.getDispatchDate());
            count++;//Tally of all the DUIs in the data
        }
    }

reader.close();

System.out.println("There were " + Integer.toString(count) + " DUIs");

    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
