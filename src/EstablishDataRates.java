import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map.Entry;

/**
 * This class is to establish certain
 *  rates that can be used for comparison purposes. For example, to 
 *  determine whether the crime rate was higher on a certain day or not, we must first determine
 *  what the base crime rate is for any given day, on average, during our study period.
 * @author Robby Ballard
 *
 */
public class EstablishDataRates {

    CrimeReader cr = new CrimeReader();
    private final ArrayList<Crime> violentCrimeArray = cr.violentCrimeArray;
    private final ArrayList<Crime> genDisturbanceArray = cr.genDisturbanceArray;
    //public final double d18ViolentCrimeRate = district18ViolentCrimeRate();
    
    
    public EstablishDataRates() throws FileNotFoundException {
    }
   
    /**
     * This method calculates the average daily violent crime rate over the 
     * period studied. It establishes the number of unique dates that are being studied, 
     * uses that as a divisor for the total number of violent crimes committed.
     * The return is ****64****, meaning there were an average of 64 violent crimes committed each day
     * over the study period in the included police districts.
     * @return
     */
    public double establishDailyViolentCrimeRate(){
        ArrayList<LocalDate> dateArray = new ArrayList<LocalDate>();//Creates an ArrayList to hold all the unique dates of the period studied

        for(Crime crime : violentCrimeArray) {//An enhanced For Loop to iterate over all of the dates in the violentCrimeArray 
            LocalDate date = crime.getDate();//A variable to temporarily hold the date value form the Crime object
            if(!(dateArray.contains(date))) {//If the ArrayList does not already have the date...
                dateArray.add(date);//...add the date to the ArrayList
            }
        }
        
        double dailyCrimeRate = (violentCrimeArray.size() / dateArray.size()); //Divides the total number of violent crimes by the number of unique dates
        return dailyCrimeRate;//Returns the daily average number of violent crimes, ****64****
    }
    /**
     * This method calculates the average daily general disturbance crime rate over the 
     * period studied. It establishes the number of unique dates that are being studied, 
     * uses that as a divisor for the total number of general disturbance crimes committed.
     * The return is ****17****, meaning there were an average of 17 general disturbance crimes committed each day
     * over the study period in the included police districts.
     * @return
     */
    public double establishDailyGeneralDisturbanceCrimeRate() {
        ArrayList<LocalDate> dateArray = new ArrayList<LocalDate>();//Creates an ArrayList to hold all the unique dates of the period studied

        for(Crime crime : genDisturbanceArray) {//An enhanced For Loop to iterate over all of the dates in the genDisturbanceArray 
            LocalDate date = crime.getDate();//A variable to temporarily hold the date value form the Crime object
            if(!(dateArray.contains(date))) {//If the ArrayList does not already have the date...
                dateArray.add(date);//...add the date to the ArrayList
            }
        }
        
        double dailyCrimeRate = (genDisturbanceArray.size() / dateArray.size()); //Divides the total number of general disturbance crimes by the number of unique dates
        return dailyCrimeRate;//Returns the daily average number of general disturbance crimes, ****17****
    }
    /**
     * This helper method makes an ArrayList of all the crimes, depending on which crimeArray argument is passed into the method as a parameter,
     * that occurred in a specified district
     * @param crimeArray This parameter allows the method to iterate over either the Violent Crime Array or the general disturbance crime array, 
     * and return an ArrayList of any crimes in either of those ArrayLists that occurred in the specified district
     * @param districtNum This parameter allows the method to iterate over the crime objects in the crime array passed in as a parameter and select only
     * those crime objects that occurred in the specified district 
     * @return
     */
    public ArrayList<Crime> makeDistrictCrimeArray(int districtNum, ArrayList<Crime> crimeArray){
        ArrayList<Crime> districtCrimeArray = new ArrayList<Crime>();//Creates an ArrayList to hold all of the crime objects relevant to our query
        for(Crime crime : crimeArray) {//An enhanced for loop to iterate over all of the crime objects in our ArrayList of chosen crimes
            if(Integer.parseInt(crime.getDistrict()) == districtNum) { //If the crime objects district number matches our district number argument...
                districtCrimeArray.add(crime);//...Then add the crime object to the districtCrimeArray
            }
        }
        return districtCrimeArray;//Returns an ArrayList of all the crimes that occurred in the specified district.
    }
    /**
     * This helper method creates an ArrayList of all the dates on which a violent or general disturbance crime occurred in
     * a specific district. 
     * @param crimeArray This parameter is for either the general disturbance crime array or the violent crime array.
     * @param districtNum This parameter is for the specific district that we are compiling data for
     * @return The return value is an ARrayList of Dates, each one unique, representing all the days on which a 
     * violent crime or general disturbance crime occurred in the specified district 
     */
    public ArrayList<LocalDate> makeDistrictDateArray(int districtNum, ArrayList<Crime> crimeArray){
        ArrayList<LocalDate> districtDateArray = new ArrayList<LocalDate>(); //Creates an ArrayList to hold the LocalDate values
        for(Crime crime : crimeArray) {//An enhanced For loop to iterate over the crime objects in the crimeArray parameter
            if(!(districtDateArray.contains(crime.getDate())) //If the districtDateArray does not contain a specific date...
                    && (Integer.parseInt(crime.getDistrict()) == districtNum)) {//...and the crime's district matches the district we are searching for...
                districtDateArray.add(crime.getDate());//...then add the date to the districtDateArray
            }
        }
        return districtDateArray;//Returns an ArrayList of all the dates on which a crime occurred in the given district
    }
    /**
     * This method establishes the daily violent crime rate for a specified district, passed to the method as an argument when the method is called
     * @return The return value is the average number of violent crimes that occurred in our chosen district per day. Values are as follows:
     * District 1 = ****3.143****, with a total of 4774 violent crimes
     * District 3 = ****3.421****, with a total of 4838 violent crimes
     * District 6 = ****3.854****, with a total of 6132 violent crimes
     * District 9 = ****3.268****, with a total of 5030 violent crimes
     * District 12 = ****7.655****, with a total of 12546 violent crimes
     * District 16 = ****4.108****, with a total of 6511 violent crimes
     * District 17 = ****4.556****, with a total of 7313 violent crimes
     * District 18 = ****6.365****, with a total of 10400 violent crimes
     * District 22 = ****7.499****, with a total of 12291 violent crimes
     * District 24 = ****7.818****, with a total of 12840 violent crimes
     * District 25 = ****10.254****, with a total of 16837 violent crimes
     * District 26 = ****4.46****, with a total of 7176 violent crimes
     */
    public double calculateDistrictViolentCrimeRate(int districtNum) {
        
        ArrayList<Crime> districtCrimeArray =  makeDistrictCrimeArray(districtNum, violentCrimeArray); //Calls the makeDistrictCrimeArray method using the district and specified type of crime as arguments sow e can count the number of crimes that occurred in our chosen district.
        ArrayList<LocalDate> districtDateArray = makeDistrictDateArray(districtNum, violentCrimeArray);//Calls the makeDistrictDateArray method using the district and specified crime type as arguments so we can count how many days there were on which a crime occurred in our chosen district.
        
        double districtViolentCrimeRate = (double) districtCrimeArray.size() / (double) districtDateArray.size(); //Divides the number of violent crimes by the number of dates
        return districtViolentCrimeRate; //Returns the per day average number of violent crimes
    }
    /**
     * This method establishes the daily general disturbance crime rate for a specified district, passed to the method as an argument when the method is called
     * @return The return value is the average number of general disturbance crimes that occurred in our chosen district per day. Values are as follows:
     * District 1 = ****1.46****, with a total of 1142 general disturbance crimes
     * District 3 = ****2.134****, with a total of 2155 general disturbance crimes
     * District 6 = ****2.748****, with a total of 3627 general disturbance crimes
     * District 9 = ****1.857****, with a total of 1911 general disturbance crimes
     * District 12 = ****2.509****, with a total of 3448 general disturbance crimes
     * District 16 = ****1.596****, with a total of 1363 general disturbance crimes
     * District 17 = ****1.703****, with a total of 1521 general disturbance crimes
     * District 18 = ****2.12****, with a total of 2620 general disturbance crimes
     * District 22 = ****2.204****, with a total of 2612 general disturbance crimes
     * District 24 = ****2.682****, with a total of 3484 general disturbance crimes
     * District 25 = ****2.490****, with a total of 3260 general disturbance crimes
     * District 26 = ****1.924****, with a total of 2074 general disturbance crimes
     */
    public double calculateDistrictGeneralDisturbanceCrimeRate(int districtNum) { 
        ArrayList<Crime> districtCrimeArray =  makeDistrictCrimeArray(districtNum, genDisturbanceArray); //Calls the makeDistrictCrimeArray method using the district and specified type of crime as arguments so we can count the number of crimes that occurred in our chosen district.
        ArrayList<LocalDate> districtDateArray = makeDistrictDateArray(districtNum, genDisturbanceArray);//Calls the makeDistrictDateArray method using the district and specified crime type as arguments so we can count how many days there were on which a crime occurred in our chosen district.
        
        double districtGenDisturbanceCrimeRate = (double) districtCrimeArray.size() / (double) districtDateArray.size(); //Divides the number of general disturbance crimes by the number of dates
        return districtGenDisturbanceCrimeRate; //Returns the per day average number of general disturbance crimes
    }
    /**
     * This method returns the number of violent crimes that occurred on a given day in a given district, both of which are 
     * passed into the method as arguments.
     * @param districtNum The district Number we are searching for data on
     * @param date The date we are concerned with finding crime statistics for
     * @return The return value is a double representing the number of violent crimes that occurred in a given district on a given day
     */
    public double getViolentCrimesPerDayPerDistrict(int districtNum, LocalDate date) {
        double crimesPerDay = 0.0;//A variable that will represent the number of crimes per day that occurred in the district passed into the method as an argument
        for(Crime crime : violentCrimeArray) { //An enhanced for loop to iterate over all of the crime objects in the violentCrimeArray
            if(Integer.parseInt(crime.getDistrict()) == districtNum && crime.getDate().equals(date)) { //If the date of a given crime object matches the district number and the date arguments... 
                crimesPerDay++;//...then increase the crimeCount variable
            }
        }
        return crimesPerDay;//Return the number of crimes that occurred on a given day
    }
    /**
     * This number returns the number of general disturbance crimes that occurred on a given day in a given district, both of which are 
     * passed into the method as arguments.
     * @param districtNum The district Number we are searching for data on
     * @param date The date we are concerned with finding crime statistics for
     * @return The return value is a double representing the number of general disturbance crimes that occurred in a given district on a given day
     */
    public double getGenDisturbanceCrimesPerDayPerDistrict(int districtNum, LocalDate date) {
        double crimesPerDay = 0.0;//A variable that will represent the number of crimes per day that occurred in the district passed into the method as an argument
        for(Crime crime : genDisturbanceArray) {//An enhanced for loop to iterate over all of the crime objects in the genDisturbanceArray
            if(Integer.parseInt(crime.getDistrict()) == districtNum && crime.getDate().equals(date)) {//If the date of a given crime object matches the district number and the date arguments... 
                crimesPerDay++;//...then increase the crimeCount variable
            }
        }
        return crimesPerDay;//Return the number of crimes that occurred on a given day
    }
    /**
     * This method calculates the average number of crimes of a given crime code that occurred in each 
     * district per day. The results are:
     * 
     *                                      **** See "Crime" class for code descriptions.****
     * 
     * District 1: Code 100 -> .019, Code 200 -> .045, Code 300 -> .577, Code 400 -> .638, Code 800 -> 1.743, Code 900 -> .030, Code 1500 -> .090 
     * District 3: Code 100 -> .017, Code 200 -> .043, Code 300 -> .826, Code 400 -> .617, Code 800 -> 1.771, Code 900 -> .022, Code 1500 -> .125 
     * District 6: Code 100 -> .018, Code 200 -> .067, Code 300 -> .901, Code 400 -> .621, Code 800 -> 2.146, Code 900 -> .019, Code 1500 -> .080 
     * District 9: Code 100 -> .006, Code 200 -> .051, Code 300 -> .882, Code 400 -> .381, Code 800 -> 1.842, Code 900 -> .025, Code 1500 -> .081 
     * District 12: Code 100 -> .08, Code 200 -> .182, Code 300 -> 1.381, Code 400 -> 1.895, Code 800 -> 3.702, Code 900 -> .07, Code 1500 -> .346 
     * District 16: Code 100 -> .047, Code 200 -> .114, Code 300 -> .738, Code 400 -> 1.011, Code 800 -> 1.964, Code 900 -> .06, Code 1500 -> .175 
     * District 17: Code 100 -> .047, Code 200 -> .085, Code 300 -> .812, Code 400 -> 1.06, Code 800 -> 2.34, Code 900 -> .037, Code 1500 -> .175 
     * District 18: Code 100 -> .043, Code 200 -> .134, Code 300 -> 1.487, Code 400 -> 1.332, Code 800 -> 3.029, Code 900 -> .068, Code 1500 -> .271 
     * District 22: Code 100 -> .090, Code 200 -> .171, Code 300 -> 1.466, Code 400 -> 1.642, Code 800 -> 3.657, Code 900 -> .084, Code 1500 -> .389 
     * District 24: Code 100 -> .051, Code 200 -> .203, Code 300 -> 1.663, Code 400 -> 1.531, Code 800 -> 4.027, Code 900 -> .116, Code 1500 -> .229 
     * District 25: Code 100 -> .083, Code 200 -> .208, Code 300 -> 1.826, Code 400 -> 1.895, Code 800 -> 5.627, Code 900 -> .153, Code 1500 -> .462 
     * District 26: Code 100 -> .041, Code 200 -> .121, Code 300 -> .904, Code 400 -> .936, Code 800 -> 2.198, Code 900 -> .090, Code 1500 -> .171 
     * 
     *                          
     * 
     * @param crimeCode  The crime code we are searching for the number of occurrences of
     * @param districtNum The district we are searching in where the crime code occurred
     * @return Returns the probability that a supplied crime code occurred in a supplied district on a given day
     */
    public double dailyProbabilityOfCrimeCodeInADistrict(int crimeCode, int districtNum) {
        double crimeCodeCount = 0.0; //A variable to hold the number of times a crime code occurs in a given district
        double crimeCodeRate = 0.0;//A variable to hold the result of dividing the crimecodecount by the number of days being studied in the given district
        ArrayList<LocalDate> districtDateArray = makeDistrictDateArray(districtNum, violentCrimeArray); //Calls on the districtDateArray() helper method to create an array of all the dates being studied for the specified district
        for(Crime crime : violentCrimeArray) {//An enhanced for loop to iterate over all of the crime objects in the violentCrimeArray
            if((Integer.parseInt(crime.getDistrict()) == districtNum) && (Integer.parseInt(crime.getCrimeCode()) == crimeCode)) {//If the district and the crime code of the current crime object match the parameters supplied...
                crimeCodeCount++;//...then increment the crimecodecount variable
            }
        }
        crimeCodeRate = (crimeCodeCount / (double) districtDateArray.size());//Divide the crimeCodeCount by the number of days being studied
        return crimeCodeRate;//Returns the probability that a given crime code occurred on a given day in the supplied district
    }
}

