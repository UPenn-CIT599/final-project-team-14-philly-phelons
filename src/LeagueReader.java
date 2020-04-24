import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Robby Ballard
 * 
 * Leagues class reads the csv file for the requested team and returns an ArrayList of 
 * Game objects based on the Games class. Data from the csv file is parsed into the different
 * values required in a Game object. Each league's csv has the data listed in a different manner,
 * therefore each league has a different method to retrieve its data.
 *         Leagues class reads the csv file for the requested team returns an
 *         ArrayList of Game objects
 * 
 */
public class LeagueReader {

	public final ArrayList<Games> MLBArray;
	public final ArrayList<Games> NBAArray;
	public final ArrayList<Games> NHLArray;
	public final ArrayList<Games> NFLArray;

	/**
	 * Constructor
	 * 
	 * @param league Parameter determines the league for which data is being
	 *               requested. NHL, NFL, MLB, or NBA.
	 * @throws FileNotFoundException
	 */
	public LeagueReader() throws FileNotFoundException, IOException {
		MLBArray = readMLBGame();
		NBAArray = readNBAGame();
		NHLArray = readNHLGame();
		NFLArray = readNFLGame();
	}

	public ArrayList<Games> getMLBArray() {
		return MLBArray;
	}

	public ArrayList<Games> getNBAArray() {
		return NBAArray;
	}

	public ArrayList<Games> getNHLArray() {
		return NHLArray;
	}

	public ArrayList<Games> getNFLArray() {
		return NFLArray;
	}

	/**
	 * compileLeagueData will open appropriate csv and add data to String ArrayList
	 * 
	 * @param fileName The file name for the csv file of the specific league, as
	 *                 determined and assigned in the readLeagueData() method.
	 * @return Returns an ArrayList of String[]'s. Each String[] in the ArrayList is
	 *         composed of the data from one line of the league's csv, with each
	 *         column of the csv represented by its respective index in the
	 *         String[].
	 * @throws FileNotFoundException
	 */
	private ArrayList<String[]> compileLeagueData(String fileName) throws IOException {

		ArrayList<String[]> leagueData = new ArrayList<String[]>();
		File file = new File(fileName);

		try {
			Scanner fileReader = new Scanner(file);
			fileReader.nextLine();
			while (fileReader.hasNextLine()) {
				String line = fileReader.nextLine();
				String[] columnData = line.split(",");
				leagueData.add(columnData);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
		return leagueData;
	}

	/**
	 * readNFLGame method returns an ArrayList of Game objects, specifically
	 * composed of NFL games.
	 * 
	 * @param fileName Takes in the fileName argument from the readLeagueData()
	 *                 method and passes it to the compileLeagueData() method to
	 *                 create the data necessary for this method parse into objects.
	 * @return Returns an ArrayList of NFL game objects.
	 * @throws IOException
	 */
	private ArrayList<Games> readNFLGame() throws IOException {
		ArrayList<String[]> leagueData = compileLeagueData("NFL Games.csv");

		ArrayList<Games> NFLGameArray = new ArrayList<Games>();

		for (String[] gameData : leagueData) {

			String gameDate = gameData[0]; // gameDate value.
			String season = gameData[1]; // season value.
			String gameType = gameData[3]; // gameType value.
			String awayTeam = gameData[5]; // awayTeam value.
			String homeTeam = gameData[4]; // homeTeam value.
			String awayScore = gameData[29]; // awayScore value.
			String homeScore = gameData[28]; // homeScore value.

			Games game = new Games(season, gameType, gameDate, awayTeam, homeTeam, awayScore, homeScore);
			NFLGameArray.add(game);
		}
		return NFLGameArray;
	}

	/**
	 * This method returns an ArrayList of Game objects, specifically composed of
	 * NHL games.
	 * 
	 * @param fileName Takes in the fileName argument from the readLeagueData()
	 *                 method and passes it to the compileLeagueData() method to
	 *                 create the data necessary for this method parse into objects.
	 * @return Returns an ArrayList of NHL game objects.
	 * @throws FileNotFoundException NHL Data is listed in the following manner in
	 *                               the csv: gameDate: DD-MM-YY Season: YYYYYYYY
	 *                               (Start year, end year. Ex: 20112012, 20182019,
	 *                               etc.) GameType: R if regular season game; P if
	 *                               post-season AwayTeam: Single digit code
	 *                               representing the team. HomeTeam: Only 4,
	 *                               Philadelphia's code, is included in the
	 *                               dataset. AwayScore: Listed as an int HomeScore:
	 *                               Listed as an int
	 */
	private ArrayList<Games> readNHLGame() throws FileNotFoundException, IOException {
		ArrayList<String[]> leagueData = compileLeagueData("NHL Games.csv");

		ArrayList<Games> NHLGameArray = new ArrayList<Games>();

		for (String[] gameData : leagueData) {

			String gameDate = gameData[3]; // gameDate value.
			String season = gameData[1];// season value.
			String gameType = gameData[2]; // gameType value.
			String awayTeam = gameData[5]; // awayTeam value.
			String homeTeam = gameData[6]; // homeTeam value.
			String awayScore = gameData[7]; // awayScore value.
			String homeScore = gameData[8]; // homeScore value.

			Games game = new Games(season, gameType, gameDate, awayTeam, homeTeam, awayScore, homeScore);
			NHLGameArray.add(game);
		}
		return NHLGameArray;
	}

	/**
	 * This method returns an ArrayList of Game objects, specifically composed of
	 * NBA games.
	 * 
	 * @param fileName Takes in the fileName argument from the readLeagueData()
	 *                 method and passes it to the compileLeagueData() method to
	 *                 create the data necessary for this method parse into objects.
	 * @return Returns an ArrayList of NBA game objects.
	 * @throws IOException
	 */
	private ArrayList<Games> readNBAGame() throws IOException {
		ArrayList<String[]> leagueData = compileLeagueData("NBA Games.csv");
		ArrayList<Games> NBAGameArray = new ArrayList<Games>();
		for (String[] gameData : leagueData) {

			String gameDate = gameData[5]; // gameDate value.
			String season = gameData[4]; // season value.
			String gameType = gameData[7]; // gameType value
			String awayTeam = gameData[14]; // awayTeam value.
			String homeTeam = gameData[8]; // homeTeam value.
			String awayScore = gameData[16]; // awayScore value.
			String homeScore = gameData[10]; // homeScore value.

			Games game = new Games(season, gameType, gameDate, awayTeam, homeTeam, awayScore, homeScore);
			NBAGameArray.add(game);
		}
		return NBAGameArray;
	}

	/**
	 * This method returns an ArrayList of Game objects, specifically composed of
	 * MLB games.
	 * 
	 * @param fileName Takes in the fileName argument from the readLeagueData()
	 *                 method and passes it to the compileLeagueData() method to
	 *                 create the data necessary for this method parse into objects.
	 * @return Returns an ArrayList of MLB game objects.
	 * @throws IOException
	 */
	private ArrayList<Games> readMLBGame() throws IOException {
		ArrayList<String[]> leagueData = compileLeagueData("MLB Games.csv");
		ArrayList<Games> MLBGameArray = new ArrayList<Games>();

		for (String[] gameData : leagueData) {
			String gameDate = gameData[0];// gameDate value.
			String season = gameData[1];// season value.
			String gameType = gameData[3];// gameType value
			String awayTeam = gameData[5];// awayTeam value.
			String homeTeam = gameData[4];// homeTeam value.
			String awayScore = gameData[25];// awayScore value.
			String homeScore = gameData[24];// homeScore value.

			Games game = new Games(season, gameType, gameDate, awayTeam, homeTeam, awayScore, homeScore);
			MLBGameArray.add(game);
		}
		return MLBGameArray;
	}
}