
public class Games {

    private String season;
    private String gameType;
    private String gameDate;
    private String awayTeam;
    private String homeTeam;
    private String awayScore;
    private String homeScore;
    
    
    public Games(String season, String gameType, String gameDate, String awayTeam, 
            String homeTeam, String awayScore, String homeScore) {
        this.season = season;
        this.gameType = gameType;
        this.gameDate = gameDate;
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.awayScore = awayScore;
        this.homeScore = homeScore;
    }


    public String getSeason() {
        return season;
    }


    public String getGameType() {
        return gameType;
    }


    public String getGameDate() {
        return gameDate;
    }


    public String getAwayTeam() {
        return awayTeam;
    }


    public String getHomeTeam() {
        return homeTeam;
    }


    public String getAwayScore() {
        return awayScore;
    }


    public String getHomeScore() {
        return homeScore;
    }
    
}
