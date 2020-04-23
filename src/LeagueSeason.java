import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * 		   This class iterates through an ArrayList of games
 *         created by the LeagueReader class and matches a parameterized season
 *         value to the season in which a game was played, adding the game to an
 *         ArrayList, thus creating an ArrayList composed entirely of the
 *         specified season's games for the specified league.
 */

public class LeagueSeason {
	private static ArrayList<Games> MLBSeason;
	private static ArrayList<Games> NHLSeason;
	private static ArrayList<Games> NFLSeason;
	private static ArrayList<Games> NBASeason;

	private LeagueReader lr = new LeagueReader();

	private ArrayList<Games> MLBGameArray = lr.MLBArray;
	private ArrayList<Games> NHLGameArray = lr.NHLArray;
	private ArrayList<Games> NFLGameArray = lr.NFLArray;
	private ArrayList<Games> NBAGameArray = lr.NBAArray;

	/**
	 * Constructor will load League's Season Array Lists
	 * @param season (year for the season, 2007-2011)
	 * @throws FileNotFoundException
	 * @throws IOException
	 */

	public LeagueSeason(String season) throws FileNotFoundException, IOException {
		MLBSeason = LoadSeasonArrays(season, MLBGameArray, "MLB");
		NHLSeason = LoadSeasonArrays(season, NHLGameArray, "NHL");
		NFLSeason = LoadSeasonArrays(season, NFLGameArray, "NFL");
		NBASeason = LoadSeasonArrays(season, NBAGameArray, "NBA");
	}

	/**
	 * getters
	 * @return ArrayList of Games for each league's season
	 */
	
	public static ArrayList<Games> getMLBSeason() {
		return MLBSeason;
	}


	public static ArrayList<Games> getNHLSeason() {
		return NHLSeason;
	}


	public static ArrayList<Games> getNFLSeason() {
		return NFLSeason;
	}


	public static ArrayList<Games> getNBASeason() {
		return NBASeason;
	}


	/**
	 * LoadSeasonArrays will check for the league's season's parameters to build an arraylist of Games
	 * @param season
	 * @param LeagueGameArray
	 * @param league
	 * @return ArrayList of Games for the season for the league
	 */

	private ArrayList<Games> LoadSeasonArrays(String season, ArrayList<Games> LeagueGameArray, String league) {
		ArrayList<Games> returnArray = new ArrayList<Games>();
		int seasonYear = 2011;

		if (season.equals("2007")) {
			seasonYear = 2007;
		} else if (season.equals("2008")) {
			seasonYear = 2008;
		} else if (season.equals("2009")) {
			seasonYear = 2009;
		} else if (season.equals("2010")) {
			seasonYear = 2010;
		}

		for (Games game : LeagueGameArray) {
			int gameYear = game.getGameDate().getYear();
			int gameMonth = game.getGameDate().getMonthValue();

			if (gameYear == seasonYear)
				if (league.equals("MLB")) {
					returnArray.add(game);
				} else if (isInSeason(league, seasonYear, gameYear, gameMonth)) {
					returnArray.add(game);
				}
		}
		return returnArray;
	}

	/**
	 * isInSeason will check to see if a particular game matches league's season parameters to be added
	 * @param league
	 * @param seasonYear
	 * @param gameYear
	 * @param gameMonth
	 * @return true if all parameters match
	 */
	
	private boolean isInSeason(String league, int seasonYear, int gameYear, int gameMonth) {
		boolean isInSeasonValue = false;
		// NHL Season Dates
		if (league.equals("NHL")) {
			if ((gameYear == seasonYear && gameMonth > 8) || (gameYear == (seasonYear + 1) && gameMonth < 5)) {
				isInSeasonValue = true;
			}
		}
		// NFL Season Dates
		else if (league.equals("NFL")) {
			if ((gameYear == seasonYear && gameMonth > 8) || (gameYear == (seasonYear + 1) && gameMonth < 3)) {
				isInSeasonValue = true;
			}

		}
		// NBA Season Dates
		else if (league.equals("NBA")) {
			if ((gameYear == seasonYear && gameMonth > 9) || (gameYear == (seasonYear + 1) && gameMonth < 7)) {
				isInSeasonValue = true;
			}

		}
		return isInSeasonValue;
	}
}
