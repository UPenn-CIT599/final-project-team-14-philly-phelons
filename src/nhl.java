import com.opencsv.bean.CsvBindByPosition;

/**
 * 
 * @author Robby Ballard
 *
 * Class to create an NHL game object. For use with file "NHL games.csv" Seasons included range from 2010
 * t0 2019. All column data that (initially) seems useful to group project concerns is included, but there is much more data
 * contained in the file. Also, data listed below may not be in the order in which it is arranged in the csv file.
 * 
 * There is more relevant data, such as game time and OT/REG/SO, in this file than in other league files, so there are 
 * more parameters included here. Also, hockey is known for its particularly aggressive athlete and fanbase, so there is, 
 * perhaps, more opportunity for "proof of concept" here.
 */
public class nhl {

    @CsvBindByPosition(position = 1)
    private String season;//Season is listed as startYearEndYear, 8 digits total
    
    @CsvBindByPosition(position = 2)
    private String type;//P for playoff game, R for regular season game
    
    @CsvBindByPosition(position = 3)
    private String date;//Listed as DD-MM-YY
    
    @CsvBindByPosition(position = 4)
    private String dateTime;//Listed as YYYY-MM-DDTHH:MM. Only the last 4 digits, HH:MM, are of consequence. Time is listed as GMT
    
    @CsvBindByPosition(position = 5)
    private String awayCode;//Away team code. See file NHL teams for key.
    
    @CsvBindByPosition(position = 6)
    private String homeCode;//Home team code. See file NHL teams for key
    
    @CsvBindByPosition(position = 7)
    private String awayGoals;//Number of goals scored by away team
    
    @CsvBindByPosition(position = 8)
    private String homeGoals;//Number of goals scored by home team
    
    @CsvBindByPosition(position = 9)
    private String outcome;//Listed as home/away win OT/REG/SO (overtime, regular, shoot-out)
    
    @CsvBindByPosition(position = 14)
    private String venueTime;//Venue time zone. Listed as -X. Time zone is GMT-X.


    public nhl() {
        
    
    }


    public void setSeason(String season) {
        this.season = season;
    }


    public void setType(String type) {
        this.type = type;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


    public void setAwayCode(String awayCode) {
        this.awayCode = awayCode;
    }


    public void setHomeCode(String homeCode) {
        this.homeCode = homeCode;
    }


    public void setAwayGoals(String awayGoals) {
        this.awayGoals = awayGoals;
    }


    public void setHomeGoals(String homeGoals) {
        this.homeGoals = homeGoals;
    }


    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }


    public void setVenueTime(String venueTime) {
        this.venueTime = venueTime;
    }


    public String getSeason() {
        return season;
    }


    public String getType() {
        return type;
    }


    public String getDate() {
        return date;
    }


    public String getDateTime() {
        return dateTime;
    }


    public String getAwayCode() {
        return awayCode;
    }


    public String getHomeCode() {
        return homeCode;
    }


    public String getAwayGoals() {
        return awayGoals;
    }


    public String getHomeGoals() {
        return homeGoals;
    }


    public String getOutcome() {
        return outcome;
    }


    public String getVenueTime() {
        return venueTime;
    }










}
