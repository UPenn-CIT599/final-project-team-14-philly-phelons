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

    private String season;//Season is listed as startYearEndYear, 8 digits total
    private String type;//P for playoff game, R for regular season game
    private String date;//Listed as DD-MM-YY
    private String dateTime;//Listed as YYYY-MM-DDTHH:MM. Only the last 4 digits, HH:MM, are of consequence. Time is listed as GMT
    private String awayCode;//Away team code. See file NHL teams for key.
    private String homeCode;//Home team code. See file NHL teams for key
    private String awayGoals;//Number of goals scored by away team
    private String homeGoals;//Number of goals scored by home team
    private String outcome;//Listed as home/away win OT/REG/SO (overtime, regular, shoot-out)
    private String venueTime;//Venue time zone. Listed as -X. Time zone is GMT-X.


    public nhl(String season, String type, String date, String dateTime, String awayCode,
            String homeCode, String awayGoals, String homeGoals, String outcome, 
            String venueTime) {
        
        this.season = season;
        this.type = type;
        this.date = date;
        this.dateTime = dateTime;
        this.awayCode = awayCode;
        this.homeCode = homeCode;
        this.awayGoals = awayGoals;
        this.homeGoals = homeGoals;
        this.outcome = outcome;
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
