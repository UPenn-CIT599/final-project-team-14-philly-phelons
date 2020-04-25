import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Robby Ballard
 *
 *The purpose of this class is to establish whether there was a change in the crime rate on a day when a team
 *either won or lost their home game. The class uses the established crime rate from the EstablishDataRates class
 *of ****64**** violent crimes per day, on average, in the districts studied over the time period included.
 */
public class GameWinLossVSCrimeRate {
    LeagueReader lr = new LeagueReader();//Creates an instance of the LeagueReader class
    CrimeReader cr = new CrimeReader();//Creates an instance of the CrimeReader class
    ArrayList<Games> totalMLBArray = lr.MLBArray;//Calls the LeagueReader Class to create an ArrayList of all MLB games
    ArrayList<Games> totalNBAArray = lr.NBAArray;//Calls the LeagueReader Class to create an ArrayList of all NBA games
    ArrayList<Games> totalNFLArray = lr.NFLArray;//Calls the LeagueReader Class to create an ArrayList of all NFL games
    ArrayList<Games> totalNHLArray = lr.getNHLArray();//Calls the LeagueReader Class to create an ArrayList of all NHL games
    ArrayList<Games> gameLosses = new ArrayList<Games>();//Creates a variable to hold the game losses for a given team
    ArrayList<Games> gameWins = new ArrayList<Games>();//Creates a variable to hold the game wins for a given team
    ArrayList<Crime> violentCrimeArray = CrimeReader.violentCrimeArray;//Calls the CrimeReader class to create an ArrayList of all violent crimes
    ArrayList<Crime> genDisturbanceArray = CrimeReader.genDisturbanceArray;//Calls the CrimeReader class to create an ArrayList of all general disturbance crimes
    
    public GameWinLossVSCrimeRate() throws IOException{
        
    }
    
    private LocalDate stringToLocalDate(String stringDate) {
        DateTimeFormatter dmy  = DateTimeFormatter.ofPattern("dd-MM-yy"); //Code to parse a String into LocalDate format.
        LocalDate ld = LocalDate.parse(stringDate, dmy);//Code to parse a String into LocalDate format
        return ld;
    }
    
    private String localDateToString(LocalDate localDate) {
        return localDate.toString();
    }
    
    /*
     * This class needs to make an arraylist of games that the team either 
     * won or lost. It then needs to use the dates from the games objects
     * and fins the number of violent crimes that occurred on that day. It then needs to 
     * divide the number of violent crimes by ****64****, which is the 
     * average number of violent crimes that occurred per day over the 
     * study period. It then need to return a result that shows how much the crime 
     * rate increased or decreased
     */
    /**
     * This method creates an ArrayList of Games objects composed only of the games that the supplied team won
     * (team supplied as a parameter). 
     * @param league The league of the team we are compiling data for. 
     * @return Returns an ArrayList of Games objects composed only of games that the supplied team won
     * @throws FileNotFoundException
     * @throws IOException
     */
    private ArrayList<Games> createGameWins(String league) throws FileNotFoundException, IOException{
       
       ArrayList<Games> totalArray = new ArrayList<Games>();//Creates a variable to hold the Games objects of all of the teams' wins

           if(league.equals("NHL")) {//If the supplied parameter is "NHL"...
               totalArray = totalNHLArray;//...then the ArrayList will be composed of Flyers games.
           }
           if(league.equals("NFL")) {//If the supplied parameter is "NFL"...
               totalArray = totalNFLArray;//...then the ARrayList will be composed of Eagles games
           }
           if(league.equals("NBA")) {//If the supplied parameter is "NBA"...
               totalArray = totalNBAArray;//...then the ArrayList will be composed only of 76ers games.
           }
           if(league.equals("MLB")) {//If the supplied parameter is "MLB...
               totalArray = totalMLBArray;//...Then the ArrayList will be composed only of Phillies games.
           }
           else if(!(league.equals("MLB") || league.equals("NBA") || league.equals("NFL") || league.equals("NHL"))) {//If the supplied parameter equals none of the above...
               System.out.println("Invalid entry.");//...then an error message will be returned.
           }
           for(Games game : totalArray) {//An enhanced for loop to iterate over all of the games in the ArrayList
               if(Integer.parseInt(game.getHomeScore()) > Integer.parseInt(game.getAwayScore())) {//If the HomeScore (Philadelphia) is more than the AwayScore (visiting team)...
                   gameWins.add(game);//...then add the game to the ArrayList composed only of the team's wins
               }
           }
           return gameWins;//Return the ARrayList of only the team's wins
    }
    
    /**
     * This method creates an ArrayList of Games objects composed only of the games that the supplied team lost
     * (team supplied as a parameter). 
     * @param league The league of the team we are compiling data for. 
     * @return Returns an ArrayList of Games objects composed only of games that the supplied team lost
     * @throws FileNotFoundException
     * @throws IOException
     */
    private ArrayList<Games> createGameLosses(String league) throws FileNotFoundException, IOException{
        
        ArrayList<Games> totalArray = new ArrayList<Games>();//Creates a variable to hold the Games objects of all of the teams' wins

        if(league.equals("NHL")) {//If the supplied parameter is "NHL"...
            totalArray = totalNHLArray;//...then the ArrayList will be composed of Flyers games.
        }
        if(league.equals("NFL")) {//If the supplied parameter is "NFL"...
            totalArray = totalNFLArray;//...then the ARrayList will be composed of Eagles games
        }
        if(league.equals("NBA")) {//If the supplied parameter is "NBA"...
            totalArray = totalNBAArray;//...then the ArrayList will be composed only of 76ers games.
        }
        if(league.equals("MLB")) {//If the supplied parameter is "MLB...
            totalArray = totalMLBArray;//...Then the ArrayList will be composed only of Phillies games.
        }
        else if(!(league.equals("MLB") || league.equals("NBA") || league.equals("NFL") || league.equals("NHL"))) {//If the supplied parameter equals none of the above...
            System.out.println("Invalid entry.");//...then an error message will be returned.
        }
        
            
            for(Games game : totalArray) {//An enhanced for loop to iterate over all of the games in the ArrayList
                if(Integer.parseInt(game.getHomeScore()) < Integer.parseInt(game.getAwayScore())) {//If the HomeScore (Philadelphia) is less than the AwayScore (visiting team)...
                    gameLosses.add(game);//Return the ARrayList of only the team's losses
                }
            }
            return gameLosses;//Return the ARrayList of only the team's losses
     }
   
    /**
     * This method's function is to make an ArrayList of all the crimes that occurred on a given day, as defined
     * by the method's sole parameter, LocalDate date. This method is a helper method for the makeLeagueWinLossVsCrimeMap() method
     * @param LocalDate A date in dd-MM-yy format passed, taken from a .getDate() method applied to a Games object, into the method 
     * @return Returns an ArrayList of crime objects, all of which occurred on the same day
     */
    private ArrayList<Crime> makeArrayListOfDaysCrimes(LocalDate date) {
        ArrayList<Crime> daysCrimesArray = new ArrayList<Crime>();
        for(Crime crime : violentCrimeArray) {
            if(crime.getDate().equals(date)) {
                daysCrimesArray.add(crime);
            }
        }
        return daysCrimesArray;//Return an ArrayList holding all of the violent crimes that occurred ona given date
    }
    /**
     * This method serves to count the number of violent crimes that occurred on a supplied date. The method takes a 
     * LocalDate argument and counts the number of violent crimes in the violentCrimeArray that occurred on that date
     * @param date The date for which we are searching for violent crimes.
     * @return The method returns a Double representing the # of violent crimes. 
     */
    private Double winLoseDayCrimeCount(LocalDate date) {
        Double crimeCount = 0.0;//Establishes a variable to hold the total crime count for a given day
        for(Crime crime : violentCrimeArray) {//An enhanced for loop to iterate over all of the crimes in the violentCrimeArray
            if(crime.getDate().equals(date)) {//If the parameter date matches the date of the crime...
                crimeCount++;//...then increment the counter
            }
        }
        return crimeCount;//Returns the total number of crimes on the given date
    }
    /**
     * This method calculates the change in crime rate on a given day from the established baseline of 64 violent crimes per day.
     * The result is returned as a percent in Double format. ((crimeCount / 64) - 1.0) * 100 
     * @param Date The date for which we are calculating the change in crime rate
     * @return The method returns a Double representing the percent change in violent crime for the given day.
     */
    private Double calculateCrimeRateChange(LocalDate Date) {
        Double crimeCount = winLoseDayCrimeCount(Date); //Establishes a variable to hold the crime count returned from the winLoseDayCrimeCount() method
        Double change = (double) (((crimeCount / 64.0) - 1.0) * 100.0);//Calculates the change in crime rate.
        return change;//Returns a percent representing the change in crime rate for the given day
    }

    /**
     *  This method is to map the Date(String) of the game win or game loss to the number of crimes that
     * occurred on that day. The HashMap the method returns should only be of 
     * wins or losses, but not both. Might be necessary, might not be. It takes a good bit of time to process (~1 minute),
     * but may be useful. 
     * @param league A parameter to determine which league we are dealing with. Supplied to the method as an argument passed from the makeCrimeRateChangeMap() method 
     * @param winOrLose A parameter passed into the method that tells the method whether we are creating a HashMap of the team's losses or their wins
     * @return Returns a HashMap of String keys that represent a date, and integer values that represent the number of games won or lost on that date
     * @throws FileNotFoundException
     * @throws IOException
     */
    public HashMap<String, Double> makeLeagueWinVsCrimeMap(String league) throws FileNotFoundException, IOException{
        //ArrayList<Games> winList = createGameWins(league);//Calls the createGameWins() method to make an ArrayList of all of the team's wins
        //ArrayList<Games> loseList = createGameLosses(league);//Calls the createGameLosses() method to make an ArrayList of all of the team's losses
        HashMap<String, Double> winVsCrimeMap = new HashMap<String, Double>();//Creates a variable to hold a HashMap of key, value pairs. Keys are the dates, values are the number of wins or losses on that date
            ArrayList<Games> winList = createGameWins(league);//Calls the createGameLosses() method to make an ArrayList of all of the team's losses
            for(Games game : winList) {//...then we iterate over all of the games in the winList ArrayList
                Double winDayCrimeCount = winLoseDayCrimeCount(game.getGameDate());
                winVsCrimeMap.put(game.getGameDate().toString(), winDayCrimeCount);
            }
            return winVsCrimeMap;
    }
    
    public HashMap<String, Double> makeLeagueLossVsCrimeMap(String league) throws FileNotFoundException, IOException{
        HashMap<String, Double> lossVsCrimeMap = new HashMap<String, Double>();
        ArrayList<Games> loseList = createGameLosses(league);//Calls the createGameLosses() method to make an ArrayList of all of the team's losses
            for(Games game : loseList) {//...then we iterate over all of the games in the loseList ArrayList
                Double loseDayCrimeCount = winLoseDayCrimeCount(game.getGameDate());
                lossVsCrimeMap.put(game.getGameDate().toString(), loseDayCrimeCount);
            }
            return lossVsCrimeMap;
    }
    
    /**
     * This method makes a HashMap of values representing the change in the crime rate on a given day matched to that day's key.
     * Might be necessary, might not be. It takes a good bit of time to process (~1 minute),
     * but may be useful.
     * @param league A parameter representing the league we are seeking data for
     * @param winOrLose A parameter representing whether or not we want to know whether a team's wins affected the crime rate or their losses
     * @return Returns a HashMap of key value pairs, keys being dates, and values being the change int he crime rate on the date, relative to the established base crime rate of ****64**** violent crimes per day, on average, as computed in the EstablishDataRates class
     * @throws FileNotFoundException
     * @throws IOException
     */
    public HashMap<String, Double> makeCrimeRateChangeMapForWins(String league) throws FileNotFoundException, IOException {
        HashMap<String, Double> winLossVsCrimeMap = makeLeagueWinVsCrimeMap(league);//Calls the makeLeagueWinLossVsCrimeMap() method to make a HashMap
        HashMap<String, Double> crimeRateChangeMap = new HashMap<String, Double>();//Creates a HashMap variable to hold the HashMap as defined in the method description above
        for(Entry<String, Double> mapEntry : winLossVsCrimeMap.entrySet()) {//An enhanced for loope to iterate over all of the entries in the winLossVsCrimeMap HashMap
                Double compareValue = (double) mapEntry.getValue() / 64;//A Double variable that holds the value corresponding to the change in violent crime rate on a given date. Computed by using the compareTo() method to compare the number of violent crimes in the winLossVsCrimeMap to the base crime rate of ****64**** violent crimes per day, on average
                crimeRateChangeMap.put(mapEntry.getKey(), compareValue);//Populates the crimeRateChangeMap with dates as the key, and the change in crime rate as the value
        }
        return crimeRateChangeMap;//Returns the crimeRateChangeMap HashMap
    }
    
    /**
     * This method uses the HashMap created in the makeCrimeRateChangeMap() method and allows for 
     * one value representing the change in the crime rate on one given day to be extracted from the map.
     * Using the calculateCrimeRateChange() method is more functional requires far less processing time. 
     * @param date A parameter that represents what exact date we are looking for the crime rate change one
     * @param league A parameter that determines what team's win or loss we are seeking to correlate to a change in the crime rate
     * @param winOrLose A parameter that indicates whether we are seeking to establish whether or not the given team's win or loss had an effect on the crime rate
     * @return Returns a Double variable that represents the change in the crime rate on a given date
     * @throws FileNotFoundException
     * @throws IOException
     */
    public Double getIndividualCrimeRateChange(String date, String league, String winOrLose) throws FileNotFoundException, IOException {
        HashMap<String, Double> crimeRateChangeMap = makeCrimeRateChangeMap(league, winOrLose);//Calls the makeCrimeRateChange() map to make a HashMap using the league and winOrLoss arguments as parameters
        Double crimeRateChange = 0.0;//Creates a variable to hold the value that this method will return
        for(Entry<String, Double> entry : crimeRateChangeMap.entrySet()) {//An enhanced for loop to iterate over all of the entries in the crimeRateChangeMap entry set
            if(date.equals(entry.getKey())) {//If the key value (date) is equal to the date supplied to this method as a parameter argument...
                crimeRateChange = entry.getValue();//...then get the value associated with that key and assign its value to the crimeRateChange variable
            }
        }
        return crimeRateChange;//Returns the crimeRateChange variable that represents the change in crime rate ona  given day
    }
}
    //                                                            //
   //Main method to test functionality of above methods.         //
  // Kept, but removed from build path, in case further testing //
 //  is necessary.                                             //
//                                                            //

    
/**   
public static void main(String[] args) throws IOException {
    GameWinLossVSCrimeRate GWLCR = new GameWinLossVSCrimeRate();
    ArrayList<Games> losses = new ArrayList<Games>();
    losses = GWLCR.createGameWins("NHL");
    DateTimeFormatter dmy = DateTimeFormatter.ofPattern("dd-MM-yy");
    //ArrayList<Crime> crimeDayArray = GWLCR.makeArrayListOfDaysCrimes("08-08-08");
    System.out.println("NHL " + GWLCR.totalNHLArray.size());
    System.out.println("NBA " +GWLCR.totalNBAArray.size());
    System.out.println("MLB " + GWLCR.totalMLBArray.size());
    System.out.println("NFL "+ GWLCR.totalNFLArray.size());
    System.out.println(losses.size());
    System.out.println(GWLCR.violentCrimeArray.size());
    System.out.println(GWLCR.genDisturbanceArray.size());
    System.out.println(GWLCR.makeArrayListOfDaysCrimes(LocalDate.parse("08-08-08", dmy)).size());//This works
    System.out.println(GWLCR.winLoseDayCrimeCount(LocalDate.parse("08-08-08", dmy)));//This works
    System.out.println(GWLCR.calculateCrimeRateChange(LocalDate.parse("08-08-08", dmy)));
    //System.out.println(GWLCR.makeLeagueWinLossVsCrimeMap("MLB", "Lose").size());//Here's where the processing is taking forever
//Instead of the above method, why don't I just get the date of the game, iterate over all of the crime objects, and count how many times the date pops up
}
*/



