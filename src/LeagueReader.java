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
 * 
 */
public class LeagueReader {
<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream

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
=======
>>>>>>> Stashed changes
    
    public final ArrayList<Games> MLBArray;
    public final ArrayList<Games> NBAArray;
    public final ArrayList<Games> NHLArray;
    public final ArrayList<Games> NFLArray;

    /**
     * Constructor for the class. Creates an ArrayList of Games objects for the desired league.
     * @param league Parameter determines the league for which data is being requested. NHL, NFL, MLB, or NBA.
     * @throws FileNotFoundException
     */
    public LeagueReader() throws FileNotFoundException, IOException {
        MLBArray = readMLBGame();
        NBAArray = readNBAGame();
        NHLArray = readNHLGame();
        NFLArray = readNFLGame();
    }
    
    /**
     * This class takes the requested league and associates it with the appropriate csv file. It then calls on the appropriate reader.
     * @param league This parameter represents the league for which data is desired. Argument is initially passed in the class constructor.
     * @return After calling on the league's appropriate reader method, this method returns an ArrayList of Games objects for said league.
     * @throws FileNotFoundException
     */
    private ArrayList<Games> readLeagueData(String league) throws FileNotFoundException, IOException{
        ArrayList<Games> leagueData = new ArrayList<Games>();//Creates an ArrayList that will hold all of the Game objects for the requested league.
        String fileName = ""; //Creates a String variable that will take the value of the csv file associated with the requested league.
        if(league.equals("NHL")) { //Determines if the league variable passed into the method is "NHL"
            fileName = "NHL Games.csv"; //Assigns the NHL csv file to the variable fileName.
            leagueData = readNHLGame(fileName); //Assigns the NHL game data, compiled in the readNHLGame() method, to the leagueData variable.
        }
        if(league.equals("NFL")) { //Determines if the league variable passed into the method is "NFL"
            fileName = "NFL Games.csv"; //Assigns the NFL csv file to the variable fileName.
            leagueData = readNFLGame(fileName); //Assigns the NFL game data, compiled in the readNFLGame() method, to the leagueData variable.
        }
        if(league.equals("NBA")) { //Determines if the league variable passed into the method is "NBA"
            fileName = "NBA Games.csv"; //Assigns the NBA csv file to the variable fileName.
            leagueData = readNBAGame(fileName); //Assigns the NBA game data, compiled in the readNBAGame() method, to the leagueData variable.
        }
        if(league.contentEquals("MLB")) { //Determines if the league variable passed into the method is "MLB"
            fileName = "MLB Games.csv"; //Assigns the MLB csv file to the variable fileName.
            leagueData = readMLBGame(fileName); //Assigns the MLB game data, compiled in the readMLBGame() method, to the leagueData variable.
        }
        else {//Returns an error message if the parameter "league" is none of the leagues.
            System.out.println("Error. Please enter a valid league search term: NBA, NFL, MLB, or NHL.");//Error message for invalid argument.
        }
            return leagueData;//Returns an ArrayList of Game objects for the requested league.
        }
    /**
     * This method is called by each of the league reader methods. This method, as its name suggests, compiles the data for the requested league
     * into an ArrayList of String[]'s by scanning the csv indicated by the readLeagueData() method and passed to the specific league reader method
     * and splitting each comma delimited line into a String[] composed of each line's specific data components.
     * 
     * @param fileName The file name for the csv file of the specific league, as determined and assigned in the readLeagueData() method. 
     * @return Returns an ArrayList of String[]'s. Each String[] in the ArrayList is composed of the data from one line of the league's csv, with each
     * column of the csv represented by its respective index in the String[].
     * @throws FileNotFoundException
     */
    private ArrayList<String[]> compileLeagueData(String fileName) throws IOException{
        ArrayList<String[]> leagueData = new ArrayList<String[]>(); //Creates and ArrayList of String[]'s that will be populated by the following functions.
        File file = new File(fileName);//Uses the fileName argument to create a File object to be read by the Scanner.
        try {
        Scanner fileReader = new Scanner(file); //Creates a new Scanner to read the File object.
        fileReader.nextLine();
        while(fileReader.hasNextLine()) { //A while loop to iterate through the csv, returning each line of data as a String. Loop will run unto there are no lines left to read.
            String line = fileReader.nextLine();//Creates a variable to hold each line of data as one String.
            String[] columnData = line.split(",");//Creates a String[] to hold the components of each line after they are split by their comma delimited values using the .split() function.
            leagueData.add(columnData);//Adds each String[] of game data to the ArrayList leagueData. 
        }
        fileReader.close(); //Closes the fileReader to avoid memory leaks.
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
        return leagueData; //Returns an ArrayList of String[]'s, each of which is the separated data for an individual game.
    }
    /**
     * This method is called in the readLeagueData() method if the league requested is the NFL (for the Philadelphia Eagles). The method calls the 
     * compileLeagueData() method and uses the ArrayList of String[]'s from said method to create Game objects by assigning parameters of the Game 
     * object to specific data in each individual String[]. The method returns an ArrayList of Game objects, specifically composed of NFL games. 
     * @param fileName Takes in the fileName argument from the readLeagueData() method and passes it to the compileLeagueData() method to create the 
     * data necessary for this method parse into objects.
     * @return Returns an ArrayList of NFL game objects.
     * @throws IOException 
     */
    private ArrayList<Games> readNFLGame() throws IOException{
        ArrayList<String[]> leagueData = compileLeagueData("NFL Games.csv"); //Creates an ArrayList of String[]'s populated by the compileLeagueData() method and passing the csv fileName as an argument.
        ArrayList<Games> NFLArray = new ArrayList<Games>();//Creates an ArrayList of Game objects that will be populated by the following functions.
        for(String[] gameData : leagueData) { //Enhanced for loop to iterate through each String[] of data in the leagueData ArrayList 
            String gameDate = gameData[0]; //Assigns the Game object's gameDate value.
            String season = gameData[1]; //Assigns the Game object's season value.
            String gameType = gameData[3]; //Assigns the Game object's gameType value.
            String awayTeam = gameData[5]; //Assigns the Game object's awayTeam value.
            String homeTeam = gameData[4]; //Assigns the Game object's homeTeam value.
            String awayScore = gameData[29]; //Assigns the Game object's awayScore value.
            String homeScore = gameData[28]; //Assigns the Game object's homeScore value.
            
            Games game = new Games(season, gameType, gameDate, awayTeam, homeTeam, 
                    awayScore, homeScore); //Populates an object of the Games class with the above values as parameters.
            NFLArray.add(game); //Adds the Game object to the NFLArray ArrayList.
        }
        return NFLArray; //Returns the NFLArray ArrayList.
    }
    /**
     * This method is called in the readLeagueData() method if the league requested is the NHL (for the Philadelphia Flyers). The method calls the 
     * compileLeagueData() method and uses the ArrayList of String[]'s from said method to create Game objects by assigning parameters of the Game 
     * object to specific data in each individual String[]. The method returns an ArrayList of Game objects, specifically composed of NHL games. 
     * @param fileName Takes in the fileName argument from the readLeagueData() method and passes it to the compileLeagueData() method to create the 
     * data necessary for this method parse into objects.
     * @return Returns an ArrayList of NHL game objects.
     * @throws FileNotFoundException
     * NHL Data is listed in the following manner in the csv:
     * gameDate: DD-MM-YY
     * Season: YYYYYYYY (Start year, end year. Ex: 20112012, 20182019, etc.)
     * GameType: R if regular season game; P if post-season
     * AwayTeam: Single digit code representing the team.
     * HomeTeam: Only 4, Philadelphia's code, is included in the dataset.
     * AwayScore: Listed as an int
     * HomeScore: Listed as an int
     */
    private ArrayList<Games> readNHLGame() throws FileNotFoundException, IOException{
        ArrayList<String[]> leagueData = compileLeagueData("NHL Games.csv");//Creates an ArrayList of String[]'s populated by the compileLeagueData() method and passing the csv fileName as an argument.
        ArrayList<Games> NHLArray = new ArrayList<Games>();//Creates an ArrayList of Game objects that will be populated by the following functions.
        for(String[] gameData : leagueData) {//Enhanced for loop to iterate through each String[] of data in the leagueData ArrayList 
<<<<<<< Updated upstream
            String gameDate = gameData[3]; //Assigns the Game objects gameDate value.
            String season = gameData[1];//Assigns the Game object's season value.
            String gameType = gameData[2]; //Assigns the Game object's gameType value.
            String awayTeam = gameData[5]; //Assigns the Game object's awayTeam value.
            String homeTeam = gameData[6]; //Assigns the Game object's homeTeam value.
            String awayScore = gameData[7]; //Assigns the Game object's awayScore value.
            String homeScore = gameData[8]; //Assigns the Game object's homeScore value.
=======
            String gameDate = gameData[1]; //Assigns the Game objects gameDate value.
            String season = gameData[13];//Assigns the Game object's season value.
            String gameType = gameData[12]; //Assigns the Game object's gameType value.
            String awayTeam = gameData[3]; //Assigns the Game object's awayTeam value.
            String homeTeam = "Philadelphia"; //Assigns the Game object's homeTeam value.
            String awayScore = gameData[5]; //Assigns the Game object's awayScore value.
            String homeScore = gameData[4]; //Assigns the Game object's homeScore value.
>>>>>>> Stashed changes
            
            Games game = new Games(season, gameType, gameDate, awayTeam, homeTeam, 
                    awayScore, homeScore); //Populates an object of the Games class with the above values as parameters.
            NHLArray.add(game); //Adds the Game object to the NHLArray ArrayList.
        }
        return NHLArray; //Returns the NHLArray ArrayList.
    }
    /**
     * This method is called in the readLeagueData() method if the league requested is the NBA (for the Philadelphia '76ers). The method calls the 
     * compileLeagueData() method and uses the ArrayList of String[]'s from said method to create Game objects by assigning parameters of the Game 
     * object to specific data in each individual String[]. The method returns an ArrayList of Game objects, specifically composed of NBA games. 
     * @param fileName Takes in the fileName argument from the readLeagueData() method and passes it to the compileLeagueData() method to create the 
     * data necessary for this method parse into objects.
     * @return Returns an ArrayList of NBA game objects.
     * @throws IOException 
     */
    private ArrayList<Games> readNBAGame() throws IOException{
        ArrayList<String[]> leagueData = compileLeagueData("NBA Games.csv"); //Creates an ArrayList of String[]'s populated by the compileLeagueData() method and passing the csv fileName as an argument.
        ArrayList<Games> NBAArray = new ArrayList<Games>(); //Creates an ArrayList of Game objects that will be populated by the following functions.
        for(String[] gameData : leagueData) { //Enhanced for loop to iterate through each String[] of data in the leagueData ArrayList 
            String gameDate = gameData[5]; //Assigns the Game object's gameDate value.
            String season = gameData[4]; //Assigns the Game object's season value.
            String gameType = gameData[7]; //Assigns the Game object's gameType value
            String awayTeam = gameData[14]; //Assigns the Game object's awayTeam value.
            String homeTeam = gameData[8]; //Assigns the Game object's homeTeam value.
            String awayScore = gameData[16]; //Assigns the Game object's awayScore value.
            String homeScore = gameData[10]; //Assigns the Game object's homeScore value.
            
            Games game = new Games(season, gameType, gameDate, awayTeam, homeTeam, 
                    awayScore, homeScore);  //Populates an object of the Games class with the above values as parameters.
            NBAArray.add(game);//Adds the Game object to the NBAArray ArrayList.
        }
        return NBAArray;//Returns the NBAArray ArrayList.
    }
    /**
     * This method is called in the readLeagueData() method if the league requested is the MLB (for the Philadelphia Phillies). The method calls the 
     * compileLeagueData() method and uses the ArrayList of String[]'s from said method to create Game objects by assigning parameters of the Game 
     * object to specific data in each individual String[]. The method returns an ArrayList of Game objects, specifically composed of MLB games. 
     * @param fileName Takes in the fileName argument from the readLeagueData() method and passes it to the compileLeagueData() method to create the 
     * data necessary for this method parse into objects.
     * @return Returns an ArrayList of MLB game objects.
     * @throws IOException 
     */
    private ArrayList<Games> readMLBGame() throws IOException{
        ArrayList<String[]> leagueData = compileLeagueData("MLB Games.csv");//Creates an ArrayList of String[]'s populated by the compileLeagueData() method and passing the csv fileName as an argument.
        ArrayList<Games> MLBArray = new ArrayList<Games>();//Creates an ArrayList of Game objects that will be populated by the following functions.
        for(String[] gameData : leagueData) {//Enhanced for loop to iterate through each String[] of data in the leagueData ArrayList 
            String gameDate = gameData[0];//Assigns the Game object's gameDate value.
            String season = gameData[1];//Assigns the Game object's season value.
            String gameType = gameData[3];//Assigns the Game object's gameType value
            String awayTeam = gameData[5];//Assigns the Game object's awayTeam value.
            String homeTeam = gameData[4];//Assigns the Game object's homeTeam value.
            String awayScore = gameData[25];//Assigns the Game object's awayScore value.
            String homeScore = gameData[24];//Assigns the Game object's homeScore value.
            
            Games game = new Games(season, gameType, gameDate, awayTeam, homeTeam, 
                    awayScore, homeScore);//Populates an object of the Games class with the above values as parameters.
            MLBArray.add(game);//Adds the Game object to the NBAArray ArrayList.
        }
        return MLBArray;//Returns the NBAArray ArrayList.
    }
<<<<<<< Updated upstream
    }
=======
    }
>>>>>>> Stashed changes
>>>>>>> Stashed changes
