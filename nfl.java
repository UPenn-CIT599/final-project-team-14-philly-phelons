/**
 * 
 * @author Robby Ballard
 * Class to create an NFL game object. For use with file "nfl_elo.csv" Seasons included range from 1920
 * t0 2019. All column data that (initially) seems useful to group project concerns is included, but there is much more data
 * contained in the file. Also, data listed below may not be in the order in which it is arranged in the csv file.
 *
 */
public class nfl {

    private String date;// Date the game was played. Listed as DD-MM-YY
    private String season;//YYYY representing the year the season began in (i.e. the 2020 Super Bowl game is in the 2019 season because the season began in 2019)
    private String neutral;//Was the game played at a neutral field? 1=yes, 0=no
    private String playoff;//Was the game a playoff game? Listed, in order of importance, as: " " for reg season, "W", "D", "C", and "S"
    private String team1;//3 letter code of the home team
    private String team2;//3 letter code of the away team
    private String score1;//Home team score
    private String score2;//Away team score
    
    public nfl(String date, String season, String neutral, String playoff, String team1,
            String team2, String score1, String score2) {
        this.date = date;
        this.season = season;
        this.neutral = neutral;
        this.playoff = playoff;
        this.team1 = team1;
        this.team2 = team2;
        this.score1 = score1;
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
