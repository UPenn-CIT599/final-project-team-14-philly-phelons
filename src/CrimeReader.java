
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 
 * @author Robby Ballard
 * 
 * Class to read "Crime.csv" file and input data into 2 usable ArrayLists.
 * ViolentCrimeArray includes only crimes deemed "violent" (See Crime class for specific code enumeration).
 * General Social Disturbances, non-violent in nature, are included in the genDisturbanceArray.
 *
 */
public class CrimeReader {
private ArrayList<Crime> allCrimeArray = new ArrayList<Crime>();

public ArrayList<Crime> violentCrimeArray = new ArrayList<Crime>();

public ArrayList<Crime> genDisturbanceArray = new ArrayList<Crime>();




public CrimeReader() throws FileNotFoundException {
    allCrimeArray = makeAllCrimeArray();
    violentCrimeArray = makeViolentArray(allCrimeArray);
    genDisturbanceArray = makeGenDisturbanceArray(allCrimeArray);
}

private ArrayList<Crime> makeAllCrimeArray() throws FileNotFoundException{
    FileInputStream fis = new FileInputStream("Crime.csv");
    InputStreamReader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr);
    
    String dataLine;
    try {
        while((dataLine = br.readLine()) != null) {
           String[] dataLineSplit = dataLine.split(",");
           String district = dataLineSplit[0];
           String date = dataLineSplit[1];
           String crimeCode = dataLineSplit[2];
           
           Crime crime = new Crime(district, date, crimeCode);
           
           allCrimeArray.add(crime);
        }
        br.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    return allCrimeArray;
    
    
    
}
private ArrayList<Crime> makeViolentArray(ArrayList<Crime> crimeArray){
    for(Crime crime : crimeArray) {
        if(crime.getCrimeCode().equals("100") || crime.getCrimeCode().equals("200") ||
                crime.getCrimeCode().equals("300") || crime.getCrimeCode().equals("400") ||
                crime.getCrimeCode().equals("800") || crime.getCrimeCode().equals("900") ||
                crime.getCrimeCode().equals("1500")) {//Filters Crime objects for only those containing Violent Crime codes
            violentCrimeArray.add(crime);
        }
    }
    return this.violentCrimeArray;
}
private ArrayList<Crime> makeGenDisturbanceArray(ArrayList<Crime> crimeArray){//General disturbances include public drunkenness, vandalism, and other crimes that could be associated with reckless celebration or dejection fueled debauchery brought about by either an important win or loss, respectively
    for(Crime crime : crimeArray) {
        if(crime.getCrimeCode().equals("1400") || crime.getCrimeCode().equals("2100") ||
                crime.getCrimeCode().equals("2300") || crime.getCrimeCode().equals("2400")) {
            genDisturbanceArray.add(crime);//Filters crimes for only those containing general disturbance codes
        }
    }
    return this.genDisturbanceArray;

}
}
