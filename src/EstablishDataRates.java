import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class is to establish certain
 *  rates that can be used for comparison purposes. For example, to 
 *  determine whether the crime rate was higher on a certain or not, we must first determine
 *  what the base crime rate is.
 * @author Robby Ballard
 *
 */
public class EstablishDataRates {

    
    private void establishViolentCrimeRate() throws ParseException {
        CrimeReader cr = new CrimeReader();
        
        HashMap<String, Integer> vCrimeMap = new HashMap<String, Integer>();
        Integer tally = 0;
        ArrayList<Crime> crimeArray = new ArrayList<Crime>();
        //crimeArray = cr.readCrimes(request1, request2, methodName1, methodName2);
        String[] violentCodes = new String[] {"100", "200", "300", "400", "800", "900", "1500"};
        
        for(String code : violentCodes) {
                for(int i = 1; i < 13; i++) {
                    tally = cr.readCrimes(Integer.toString(i), "getMonth", code, "getUcrGeneral");
                    
                        
                    
                    vCrimeMap.put(Integer.toString(i), tally);
                }
            }
    
        for(String key : vCrimeMap.keySet()) {
            System.out.println(key + " " + vCrimeMap.get(key));

        }
    }
  //public static void main(String[] args) throws ParseException {
    //    EstablishDataRates EDR = new EstablishDataRates();
      //  EDR.establishViolentCrimeRate();
    //}
}

