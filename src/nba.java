import com.opencsv.bean.CsvBindByPosition;

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
    
    @CsvBindByPosition(position = 5)
    private String date;// Date the game was played. Listed as DD-MM-YY
    
    @CsvBindByPosition(position = 4)
    private String season;//YYYY representing the year the season began in 
    
    @CsvBindByPosition(position = 19)
    private String gameLoc;//Location of the game. H if yes, A if Away
    
    @CsvBindByPosition(position = 7)
    private String playoff;//Was the game a playoff game? 1=yes, 0=no 
    
    @CsvBindByPosition(position = 8)
    private String team1;//3 letter code of the home team
    
    @CsvBindByPosition(position = 14)
    private String team2;//3 letter code of the away team
    
    @CsvBindByPosition(position = 20)
    private String result;//L if loss for home team (team1), W if win for home team (team1)
    
    @CsvBindByPosition(position = 10)
    private String score1;//Home team score
    
    @CsvBindByPosition(position = 16)
    private String score2;//Away team score
    
    public nba() {
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setGameLoc(String gameLoc) {
        this.gameLoc = gameLoc;
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

    public void setResult(String result) {
        this.result = result;
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
