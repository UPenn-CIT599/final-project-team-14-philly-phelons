import java.io.*;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

import com.opencsv.CSVReader;
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

    private int count;//Used if making a tally or finding the size of an ArrayList
   
    /*
     * Method that takes in 2 item search parameters and 2 corresponding method parameters and makes an array list of all crimes match those parameters. 
     */
public ArrayList<Crime> readCrimes(String request1, String request2, String methodName1, String methodName2){
    ArrayList<Crime> crimeArray = new ArrayList<>();
    try {

        FileInputStream fis = new FileInputStream("crime.gz.gz");
        GZIPInputStream gis = new GZIPInputStream(fis);
        InputStreamReader isr = new InputStreamReader(gis);
        BufferedReader br = new BufferedReader(isr);
        CSVReader reader = new CSVReader(br);
    //Reader reader = Files.newBufferedReader(Paths.get("crime.csv"));
    
    CsvToBean<Crime> csvToBean = new CsvToBeanBuilder<Crime>(reader)
            .withType(Crime.class)
            .withIgnoreLeadingWhiteSpace(true)
            .build();//Converts rows of csv data to JavaBeans
    
    for(Crime crime : (Iterable<Crime>) csvToBean) { 
        
        if (crime.getMethodName(methodName1).equals(request1) &&
                crime.getMethodName(methodName2).equals(request2)){
            
            crimeArray.add(crime);//Fills crimeArray ArrayList with Crime objects that match the search criteria
        }
    }

reader.close();
    
System.out.println("There were " + crimeArray.size() + " Thefts in District " + request2);

    } catch (IOException e) {
        e.printStackTrace();
    
    } catch (Exception e) {
    System.err.println("Invoke() failed: " + e);
    }
    return crimeArray;
    
}



    //                                              //
   // Code used for testing aspects of CrimeReader // 
  //                                              //


/* 
public Object getMethodName(String className, String methodName) {
    try {
    Class<?> C = Class.forName(className); //Uses parameter to call on Class name (Crime, MLB, NHL, NBA, etc.)
    
    Method worker = C.getMethod(methodName); //Creates a method variable using methodName as the name and will pass parameters to the method through argTypes array

    worker.invoke(C);
    } catch (Exception e) {
        System.err.println("Invoke() failed: " + e);
    }
   return getMethodName(className, methodName);
    
}
*/
public static void main(String[] args) {
    CrimeReader cr = new CrimeReader();
    cr.readCrimes("Thefts", "17", "getGeneralCode", "getDistrict");
}

}

