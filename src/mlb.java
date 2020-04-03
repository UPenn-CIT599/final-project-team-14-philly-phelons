import com.opencsv.bean.CsvBindByPosition;







/**
 * 
 * @author Robby Ballard
 * Class to create an MLB game object. For use with file "MLB Games.csv" Seasons included range from 1871
 * t0 2019. All column data that (initially) seems useful to group project concerns is included, but there is much more data
 * contained in the file. Also, data listed below may not be in the order in which it is arranged in the csv file.
 *
 */
public class mlb {
    
    @CsvBindByPosition(position = 0)
    private String date;// Date the game was played. Listed as DD-MM-YY
    
    @CsvBindByPosition(position = 1)
    private String season;//YYYY representing the year the season began in 
    
    @CsvBindByPosition(position = 2)
    private String neutral;//Was the game played at a neutral field? 1=yes, 0=no
    
    @CsvBindByPosition(position = 3)
    private String playoff;//Was the game a playoff game? Listed, in order of importance, as: " " for reg season,"c" for wildcard, "d" for division (AL East/West, NL East/West), "l" for league (NL or AL), "w" for World Series 
    
    @CsvBindByPosition(position = 4)
    private String team1;//3 letter code of the home team
    
    @CsvBindByPosition(position = 5)
    private String team2;//3 letter code of the away team
    
    @CsvBindByPosition(position = 24)
    private String score1;//Home team score
    
    @CsvBindByPosition(position = 25)
    private String score2;//Away team score
    
    public mlb() {
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setNeutral(String neutral) {
        this.neutral = neutral;
    }

    public void setPlayoff(String playoff) {
        this.playoff = playoff;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public void setScore1(String score1) {
        this.score1 = score1;
    }

    public void setScore2(String score2) {
        this.score2 = score2;
    }

    public String getDate() {
        return date;
    }

    public String getSeason() {
        return season;
    }

    public String getNeutral() {
        return neutral;
    }

    public String getPlayoff() {
        return playoff;
    }

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public String getScore1() {
        return score1;
    }

    public String getScore2() {
        return score2;
    }
}

