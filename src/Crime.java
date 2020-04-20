import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 * 
 * @author Robby Ballard
 *Class to create a Crime object. for the Crime.csv data. Only certain districts are included in the analysis, 
 *only certain codes are included in analysis, and only certain 
 *years are included in the analysis.
 *
 *Of particular note, the getDispatchDate returns an object of LocalDate type, which it 
 *parses from a String representation of the date.
 *This is so that a getDispatchDate().getMonthValue || .getYear() || .getDayOfMonth() 
 *method can be applied to the date to suss out specific information form the date.
 *
 */
public class Crime {

    /*
     * The district in which the crime was reported. 
     * Only districts 1, 3, 6, 9, 12, 16, 17, 18, 22, 24, 25, and 26 are included in the study.
     * Districts selected for study chosen due to their proximity to the team's venues as well as their various
     * entertainment and nightlife venues.
     */
    private String district;
    
    /*
     * DispatchDate is entered as a String but returned as a LocalDate. This is to enhance the
     * functionality of the Date value by allowing for getMonthValue(), getDayOfMonth(), and getYear() methods to
     * be applied.
     */
    private String dispatchDate; //The date on which police were dispatched to the scene
    /*
     * 3 or 4 digit code representing the type of offense. Codes 100, 200, 300, 400, 800, 900, 1500 
     * considered violent offenses. Codes 1400, 2100, 2300, 2400 considered public disturbances.
     * Codes correspond to the following descriptions:
     * ****Violent****
     * 100-Homicide
     * 200-Rape
     * 300-Robbery Firearm
     * 400-Aggravated Assault Firearm/Aggravated Assault No Firearm
     * 800-Other Assaults
     * 900-Arson
     * 1500- Weapon Violations
     * ****General Disturbances****
     * 1400-Vandalism/Criminal Mischief
     * 2100- Driving Under the Influence
     * 2300-Public Drunkenness
     * 2400-Disorderly Conduct
     * 
     */
    private String crimeCode;
    
    
    public Crime(String district, String dispatchDate, String crimeCode) {
        this.district = district;
        
        this.dispatchDate = dispatchDate;
        
        this.crimeCode = crimeCode;
    }


    public String getDistrict() {
        return district;
    }


    public LocalDate getDate() {
        DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd-MM-yy");
        LocalDate date = LocalDate.parse(dispatchDate, dmy);
        return date;
    }


    public String getCrimeCode() {
        return crimeCode;
    }
}
