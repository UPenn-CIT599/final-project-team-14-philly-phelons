import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * 
 * @author Robby Ballard
 *Class to create a Crime object. for the Crime.csv data. Only certain districts are included in the analysis, 
 *only certain codes are included in analysis, and only certain 
 *years are included in the analysis.
 *
 *Of particular note, the getDispatchDate returns an object of LocalDateTime type, which it 
 *parses from a String representation of the date.
 *This is so that a getDispatchDate().getMonthValue || .getYear() || .getDay() 
 *method can be applied to the date to suss out specific information form the date.
 *
 */
public class Crime {

    private String district;//The district in which the crime was reported. Must be input as 2 digits (i.e. District 1 = "01", District 12 = "12")
    
    private String dispatchDate; //The date on which police were dispatched to the scene
    
    private String crimeCode; //3 digit code representing the type of offense. Codes 100, 200, 300, 400, 800, 900, 1500 considered violent offenses. Codes 1400, 2100, 2300, 2400 considered public disturbances.
    
    
    public Crime(String district, String dispatchDate, String crimeCode) {
        this.district = district;
        
        this.dispatchDate = dispatchDate;
        
        this.crimeCode = crimeCode;
    }


    public String getDistrict() {
        return district;
    }


    public LocalDateTime getDate() {
        DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime date = LocalDateTime.parse(dispatchDate, dmy);
        return date;
    }


    public String getCrimeCode() {
        return crimeCode;
    }
}
