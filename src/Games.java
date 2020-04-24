import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
<<<<<<< HEAD
 * @author Robby Ballard
 * Class to create a a game object to be populated by the LeagueReader class.All column data that (initially) seems useful to group project 
 * concerns is included, but there is much more data contained in the file. Also, data listed below may not be in the order in 
 * which it is arranged in the csv file.
=======
 * @author Robby Ballard 
 * Creates a game object
 * Is populated by the LeagueReader class.
 * 
>>>>>>> master
 */

public class Games {

<<<<<<< HEAD
    private String season; //YYYY representing the year the season began in (i.e. the 2020 Super Bowl game is in the 2019 season because the season began in 2019)
    private String gameType; //Was the game a playoff game? Different types of games are listed differently in the various leagues
    private String gameDate; // Date the game was played. Listed as DD-MM-YY
    private String awayTeam; //2 or 3 letter code of the away team. Represented as a number in the NHL
    private String homeTeam;//3 letter code of the home team. Philadelphia is represented by "4" in the NHL.
    private String awayScore;//Away team score
    private String homeScore;//Home team score
    
    /**
     * Constructor for the class. Creates an object of the Game. 
     * @param season
     * @param gameType
     * @param gameDate
     * @param awayTeam
     * @param homeTeam
     * @param awayScore
     * @param homeScore
     */
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
/*
 * Getter methods below return the indicated value for each Game object.
 */

    public String getSeason() {
        return season;
    }


    public String getGameType() {
        return gameType;
    }


    public LocalDate getGameDate() {
        DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd-MM-yy");
        LocalDate date = LocalDate.parse(gameDate, dmy);
        return date;
        
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
    
=======
	private String season; // YYYY representing the calendar year the season began
	private String gameType; // Different types of games are listed differently in the various leagues
	private String gameDate; // Date the game was played. Format DD-MM-YY
	private String awayTeam; // 2 or 3 letter code of the away team. Represented as a number in the NHL
	private String homeTeam;// 3 letter code of the home team. Philadelphia is represented by "4" in the
							// NHL.
	private String awayScore;// Away team score
	private String homeScore;// Home team score

	/**
	 * Constructor
	 * 
	 * @param season
	 * @param gameType
	 * @param gameDate
	 * @param awayTeam
	 * @param homeTeam
	 * @param awayScore
	 * @param homeScore
	 */
	public Games(String season, String gameType, String gameDate, String awayTeam, String homeTeam, String awayScore,
			String homeScore) {
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

	public LocalDate getGameDate() {
		DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd-MM-yy");
		LocalDate date = LocalDate.parse(gameDate, dmy);
		return date;

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

>>>>>>> master
}
