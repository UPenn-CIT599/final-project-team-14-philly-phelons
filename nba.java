/**
 * 
 * @author Robby Ballard
 * 
 * Class to create an NBA game object. For use with file "NBA Games.csv" Seasons included range from 1947
 * t0 2015. All column data that (initially) seems useful to group project concerns is included, but there is much more data
 * contained in the file. Also, data listed below may not be in the order in which it is arranged in the csv file.
 *
 */
public class nba {
    private String date;// Date the game was played. Listed as DD-MM-YY
    private String season;//YYYY representing the year the season began in 
    private String gameLoc;//Location of the game. H if yes, A if Away
    private String playoff;//Was the game a playoff game? 1=yes, 0=no 
    private String team1;//3 letter code of the home team
    private String team2;//3 letter code of the away team
    private String result;//L if loss for home team (team1), W if win for home team (team1)
    private String score1;//Home team score
    private String score2;//Away team score
    
    public nba(String date, String season, String gameLoc, String playoff, String team1,
            String team2, String result, String score1, String score2) {
        this.date = date;
        this.season = season;
        this.gameLoc = gameLoc;
        this.playoff = playoff;
        this.team1 = team1;
        this.team2 = team2;
        this.result = result;
        this.score1 = score1;
        this.score2 = score2;
    }

    public String getDate() {
        return date;
    }

    public String getSeason() {
        return season;
    }

    public String getGameLoc() {
        return gameLoc;
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
    
    public String getResult() {
        return result;
    }

    public String getScore1() {
        return score1;
    }

    public String getScore2() {
        return score2;
    }
}
