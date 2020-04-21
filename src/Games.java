import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Robby Ballard 
 * Creates a game object
 * Is populated by the LeagueReader class.
 * 
 */

public class Games {

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

}
