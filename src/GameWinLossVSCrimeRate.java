import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

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

    public static ArrayList<Games> totalMLBArray = LeagueReader.MLBArray;//Calls the LeagueReader Class to create an ArrayList of all MLB games
    public static ArrayList<Games> totalMLBLosses = makeTotalLosses(totalMLBArray);
    public static ArrayList<Games> totalMLBWins = makeTotalWins(totalMLBArray);
    public static ArrayList<Games> totalNBAArray = LeagueReader.NBAArray;//Calls the LeagueReader Class to create an ArrayList of all NBA games
    public static ArrayList<Games> totalNBALosses = makeTotalLosses(totalNBAArray);
    public static ArrayList<Games> totalNBAWins = makeTotalWins(totalNBAArray);
    public static ArrayList<Games> totalNFLArray = LeagueReader.NFLArray;//Calls the LeagueReader Class to create an ArrayList of all NFL games
    public static ArrayList<Games> totalNFLLosses =makeTotalLosses(totalNFLArray);
    public static ArrayList<Games> totalNFLWins = makeTotalWins(totalNFLArray);
    public static ArrayList<Games> totalNHLArray = LeagueReader.NHLArray;//Calls the LeagueReader Class to create an ArrayList of all NHL games
    public static ArrayList<Games> totalNHLLosses = makeTotalLosses(totalNHLArray);//Creates a variable to hold the game losses for a given team
    public static ArrayList<Games> totalNHLWins = makeTotalWins(totalNHLArray);//Creates a variable to hold the game wins for a given team
     //
    // The following HashMaps return maps that set a team's win or loss date      //
   //  as a key and the total number of crimes for the date of that win/loss     //
  //   as a value. Maps are ordered as violent crimes first, followed by        //
 //    General Disturbance, and finally All crimes                             //
//                                                                            //
    public static HashMap<String, Double> NHLLossVsViolentCrimeMap;
    public static HashMap<String, Double> NHLWinVsViolentCrimeMap;
    public static HashMap<String, Double> NFLLossVsViolentCrimeMap;
    public static HashMap<String, Double> NFLWinVsViolentCrimeMap;
    public static HashMap<String, Double> NBALossVsViolentCrimeMap;
    public static HashMap<String, Double> NBAWinVsViolentCrimeMap;
    public static HashMap<String, Double> MLBLossVsViolentCrimeMap;
    public static HashMap<String, Double> MLBWinVsViolentCrimeMap;
    public static HashMap<String, Double> NHLLossVsGDCrimeMap;
    public static HashMap<String, Double> NHLWinVsGDCrimeMap;
    public static HashMap<String, Double> NFLLossVsGDCrimeMap;
    public static HashMap<String, Double> NFLWinVsGDCrimeMap;
    public static HashMap<String, Double> NBALossVsGDCrimeMap;
    public static HashMap<String, Double> NBAWinVsGDCrimeMap;
    public static HashMap<String, Double> MLBLossVsGDCrimeMap;
    public static HashMap<String, Double> MLBWinVsGDCrimeMap;    
    public static HashMap<String, Double> NHLLossVsAllCrimeMap;
    public static HashMap<String, Double> NHLWinVsAllCrimeMap;
    public static HashMap<String, Double> NFLLossVsAllCrimeMap;
    public static HashMap<String, Double> NFLWinVsAllCrimeMap;
    public static HashMap<String, Double> NBALossVsAllCrimeMap;
    public static HashMap<String, Double> NBAWinVsAllCrimeMap;
    public static HashMap<String, Double> MLBLossVsAllCrimeMap;
    public static HashMap<String, Double> MLBWinVsAllCrimeMap;
    //
   // The following HashMaps return maps that set a team's win or loss date      //
  //  as a key and the change in crime rate for the date of that win/loss       //
 //   as a value. Crime rate changes are represented as percentages (e.g.18.75)//
//                                                                            //
    public static HashMap<String, Double> NHLWinVsVCrimeRateChangeMap;
    public static HashMap<String, Double> NHLLossVsVCrimeRateChangeMap;
    public static HashMap<String, Double> NFLWinVsVCrimeRateChangeMap;
    public static HashMap<String, Double> NFLLossVsVCrimeRateChangeMap;
    public static HashMap<String, Double> NBAWinVsVCrimeRateChangeMap;
    public static HashMap<String, Double> NBALossVsVCrimeRateChangeMap;
    public static HashMap<String, Double> MLBWinVsVCrimeRateChangeMap;
    public static HashMap<String, Double> MLBLossVsVCrimeRateChangeMap;
    public static HashMap<String, Double> NHLWinVsGDCrimeRateChangeMap;
    public static HashMap<String, Double> NHLLossVsGDCrimeRateChangeMap;
    public static HashMap<String, Double> NFLWinVsGDCrimeRateChangeMap;
    public static HashMap<String, Double> NFLLossVsGDCrimeRateChangeMap;
    public static HashMap<String, Double> NBAWinVsGDCrimeRateChangeMap;
    public static HashMap<String, Double> NBALossVsGDCrimeRateChangeMap;
    public static HashMap<String, Double> MLBWinVsGDCrimeRateChangeMap;
    public static HashMap<String, Double> MLBLossVsGDCrimeRateChangeMap;
    public static HashMap<String, Double> NHLWinVsAllCrimeRateChangeMap;
    public static HashMap<String, Double> NHLLossVsAllCrimeRateChangeMap;
    public static HashMap<String, Double> NFLWinVsAllCrimeRateChangeMap;
    public static HashMap<String, Double> NFLLossVsAllCrimeRateChangeMap;
    public static HashMap<String, Double> NBAWinVsAllCrimeRateChangeMap;
    public static HashMap<String, Double> NBALossVsAllCrimeRateChangeMap;
    public static HashMap<String, Double> MLBWinVsAllCrimeRateChangeMap;
    public static HashMap<String, Double> MLBLossVsAllCrimeRateChangeMap;
    ArrayList<Crime> violentCrimeArray = CrimeReader.violentCrimeArray;//Calls the CrimeReader class to create an ArrayList of all violent crimes
    ArrayList<Crime> genDisturbanceArray = CrimeReader.genDisturbanceArray;//Calls the CrimeReader class to create an ArrayList of all general disturbance crimes
    ArrayList<Crime> allCrimeArray = CrimeReader.allCrimeArray;
  
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
    

   
    /**
     * This method's function is to make an ArrayList of all the crimes that occurred on a given day, as defined
     * by the method's sole parameter, LocalDate date. This method is a helper method for the makeLeagueWinLossVsCrimeMap() method
     * @param LocalDate A date in dd-MM-yy format passed, taken from a .getDate() method applied to a Games object, into the method 
     * @return Returns an ArrayList of crime objects, all of which occurred on the same day
     */
    private ArrayList<Crime> makeArrayListOfDaysCrimes(LocalDate date) {
        ArrayList<Crime> daysCrimesArray = new ArrayList<Crime>();//Creates an Arraylist variable to hold all of the crime objects
        for(Crime crime : violentCrimeArray) {//An enhanced for loop to iterate over all fo the crime objects in the violentCrimeArray as created by the makeViolentCrimeArray method in the CrimeReader class
            if(crime.getDate().equals(date)) {//If the Crime object's date matches the date supplied to the method as an argument...
                daysCrimesArray.add(crime);//...then add the crime to the ArrayList of all the crimes that occurred on the given date
            }
        }
        return daysCrimesArray;//Return an ArrayList holding all of the violent crimes that occurred ona given date
    }


    private static ArrayList<Games> makeTotalWins(ArrayList<Games> leagueGames){
        ArrayList<Games> totalLeagueWins = new ArrayList<Games>();
        for(Games game : leagueGames) {
            if(Integer.parseInt(game.getHomeScore()) > Integer.parseInt(game.getAwayScore())) {
                totalLeagueWins.add(game);
            }
        }
        return totalLeagueWins;
    }

    private static ArrayList<Games> makeTotalLosses(ArrayList<Games> leagueGames){
        ArrayList<Games> totalLeagueLosses = new ArrayList<Games>();
        for(Games game : leagueGames) {
            if(Integer.parseInt(game.getHomeScore()) < Integer.parseInt(game.getAwayScore())) {
                totalLeagueLosses.add(game);
            }
        }
        return totalLeagueLosses;
    }
                                                         //
    private Double winLoseDayCrimeCount(LocalDate date, ArrayList<Crime> crimeArray) {
        Double crimeCount = 0.0;
        for(Crime crime : crimeArray) {
            if(crime.getDate().equals(date)) {
                crimeCount++;
            }
        }
        return crimeCount;
    }


    public HashMap<String, Double> makeLeagueWinLossVsCrimeMap(ArrayList<Games> winLossArray, ArrayList<Crime> crimeArray) throws FileNotFoundException, IOException{
        HashMap<String, Double> winLossVsCrimeMap = new HashMap<String, Double>();//Creates a variable to hold a HashMap of key, value pairs. Keys are the dates, values are the number of wins or losses on that date
            for(Games game : winLossArray) {//...then we iterate over all of the games in the winList ArrayList
                Double winDayCrimeCount = winLoseDayCrimeCount(game.getGameDate(), crimeArray);
                winLossVsCrimeMap.put(game.getGameDate().toString(), winDayCrimeCount);
            }
            return winLossVsCrimeMap;
    }
   
    public HashMap<String, Double> getNHLLossVsViolentCrimeMap() throws FileNotFoundException, IOException{
        NHLLossVsViolentCrimeMap = makeLeagueWinLossVsCrimeMap(totalNHLLosses, violentCrimeArray);
        return NHLLossVsViolentCrimeMap;
    }

    public HashMap<String, Double> getNHLWinVsViolentCrimeMap() throws FileNotFoundException, IOException{
        NHLWinVsViolentCrimeMap = makeLeagueWinLossVsCrimeMap(totalNHLWins, violentCrimeArray);
        return NHLWinVsViolentCrimeMap;
    }
    
    public HashMap<String, Double> getNFLLossVsViolentCrimeMap() throws FileNotFoundException, IOException{
        NFLLossVsViolentCrimeMap = makeLeagueWinLossVsCrimeMap(totalNFLLosses, violentCrimeArray);
        return NFLLossVsViolentCrimeMap;
    }
    
    public HashMap<String, Double> getNFLWinVsViolentCrimeMap() throws FileNotFoundException, IOException{
         NFLWinVsViolentCrimeMap = makeLeagueWinLossVsCrimeMap(totalNFLWins, violentCrimeArray);
         return NFLWinVsViolentCrimeMap;
    }

    public HashMap<String, Double> getNBALossVsViolentCrimeMap() throws FileNotFoundException, IOException{
        NBALossVsViolentCrimeMap = makeLeagueWinLossVsCrimeMap(totalNBALosses, violentCrimeArray);
        return NBAWinVsViolentCrimeMap;
    }
    
    public HashMap<String, Double> getNBAWinVsViolentCrimeMap() throws FileNotFoundException, IOException{
        NBAWinVsViolentCrimeMap = makeLeagueWinLossVsCrimeMap(totalNBAWins, violentCrimeArray);
        return NBAWinVsViolentCrimeMap;
    }
   
    public HashMap<String, Double> getMLBLossVsViolentCrimeMap() throws FileNotFoundException, IOException{
        MLBLossVsViolentCrimeMap = makeLeagueWinLossVsCrimeMap(totalMLBLosses, violentCrimeArray);
        return MLBLossVsViolentCrimeMap;
    }
    
    public HashMap<String, Double> getMLBWinVsViolentCrimeMap() throws FileNotFoundException, IOException{
        MLBWinVsViolentCrimeMap = makeLeagueWinLossVsCrimeMap(totalMLBWins, violentCrimeArray);
        return MLBWinVsViolentCrimeMap;
    }
   
    public HashMap<String, Double> getNHLLossVsGDCrimeMap() throws FileNotFoundException, IOException{
        NHLLossVsGDCrimeMap = makeLeagueWinLossVsCrimeMap(totalNHLLosses, genDisturbanceArray);
        return NHLLossVsViolentCrimeMap;
    }

    public HashMap<String, Double> getNHLWinVsGDCrimeMap() throws FileNotFoundException, IOException{
        NHLWinVsGDCrimeMap = makeLeagueWinLossVsCrimeMap(totalNHLWins, genDisturbanceArray);
        return NHLWinVsViolentCrimeMap;
    }
    
    public HashMap<String, Double> getNFLLossVsGDCrimeMap() throws FileNotFoundException, IOException{
        NFLLossVsGDCrimeMap = makeLeagueWinLossVsCrimeMap(totalNFLLosses, genDisturbanceArray);
        return NFLLossVsGDCrimeMap;
    }
    
    public HashMap<String, Double> getNFLWinVsGDCrimeMap() throws FileNotFoundException, IOException{
         NFLWinVsGDCrimeMap = makeLeagueWinLossVsCrimeMap(totalNFLWins, genDisturbanceArray);
         return NFLWinVsGDCrimeMap;
    }

    public HashMap<String, Double> getNBALossVsGDCrimeMap() throws FileNotFoundException, IOException{
        NBALossVsGDCrimeMap = makeLeagueWinLossVsCrimeMap(totalNBALosses, genDisturbanceArray);
        return NBAWinVsGDCrimeMap;
    }
    
    public HashMap<String, Double> getNBAWinVsGDCrimeMap() throws FileNotFoundException, IOException{
        NBAWinVsGDCrimeMap = makeLeagueWinLossVsCrimeMap(totalNBAWins, genDisturbanceArray);
        return NBAWinVsGDCrimeMap;
    }
   
    public HashMap<String, Double> getMLBLossVsGDCrimeMap() throws FileNotFoundException, IOException{
        MLBLossVsGDCrimeMap = makeLeagueWinLossVsCrimeMap(totalMLBLosses, genDisturbanceArray);
        return MLBLossVsGDCrimeMap;
    }
    
    public HashMap<String, Double> getMLBWinVsGDCrimeMap() throws FileNotFoundException, IOException{
        MLBWinVsViolentCrimeMap = makeLeagueWinLossVsCrimeMap(totalMLBWins, genDisturbanceArray);
        return MLBWinVsViolentCrimeMap;
    }    
    
    public HashMap<String, Double> getNHLLossVsAllCrimeMap() throws FileNotFoundException, IOException{
        NHLLossVsAllCrimeMap = makeLeagueWinLossVsCrimeMap(totalNHLLosses, allCrimeArray);
        return NHLLossVsAllCrimeMap;
    }
    
    public HashMap<String, Double> getNHLWinVsAllCrimeMap() throws FileNotFoundException, IOException{
        NHLWinVsAllCrimeMap = makeLeagueWinLossVsCrimeMap(totalNHLWins, allCrimeArray);
        return NHLWinVsAllCrimeMap;
    }
    public HashMap<String, Double> getNFLLossVsAllCrimeMap() throws FileNotFoundException, IOException{
        NFLLossVsAllCrimeMap = makeLeagueWinLossVsCrimeMap(totalNFLLosses, allCrimeArray);
        return NFLLossVsAllCrimeMap;
    }
    
    public HashMap<String, Double> getNFLWinVsAllCrimeMap() throws FileNotFoundException, IOException{
        NFLWinVsAllCrimeMap = makeLeagueWinLossVsCrimeMap(totalNFLWins, allCrimeArray);
        return NFLWinVsAllCrimeMap;
    }
    public HashMap<String, Double> getNBALossVsAllCrimeMap() throws FileNotFoundException, IOException{
        NBALossVsAllCrimeMap = makeLeagueWinLossVsCrimeMap(totalNBALosses, allCrimeArray);
        return NBALossVsAllCrimeMap;
    }
    
    public HashMap<String, Double> getNBAWinVsAllCrimeMap() throws FileNotFoundException, IOException{
        NBAWinVsAllCrimeMap = makeLeagueWinLossVsCrimeMap(totalNBAWins, allCrimeArray);
        return NBAWinVsAllCrimeMap;
    }
    public HashMap<String, Double> getMLBLossVsAllCrimeMap() throws FileNotFoundException, IOException{
        MLBLossVsAllCrimeMap = makeLeagueWinLossVsCrimeMap(totalMLBLosses, allCrimeArray);
        return MLBLossVsAllCrimeMap;
    }
    
    public HashMap<String, Double> getMLBWinVsAllCrimeMap() throws FileNotFoundException, IOException{
        MLBWinVsAllCrimeMap = makeLeagueWinLossVsCrimeMap(totalMLBWins, allCrimeArray);
        return MLBWinVsAllCrimeMap;
    }
    private Double calculateVCrimeRateChange(LocalDate Date) {
        Double crimeCount = winLoseDayCrimeCount(Date, violentCrimeArray); 
        Double change = (double) (((crimeCount / 64.0) - 1.0) * 100.0);
        return change;
    }
    
    private Double calculateGDCrimeRateChange(LocalDate Date) {
        Double crimeCount = winLoseDayCrimeCount(Date, genDisturbanceArray); 
        Double change = (double) (((crimeCount / 17.0) - 1.0) * 100.0);
        return change;
    }
    
    private Double calculateAllCrimeRateChange(LocalDate Date) {
        Double crimeCount = winLoseDayCrimeCount(Date, allCrimeArray); 
        Double change = (double) (((crimeCount / 81.0) - 1.0) * 100.0);
        return change;
    }
  
    private HashMap<String, Double> makeWinLossDayVsVCrimeRateChangeMap(HashMap<String, Double> leagueWinDayVsVCrimeCountMap){
        HashMap<String, Double> leagueWinDayVsVCrimeRateChangeMap = new HashMap<String, Double>();
        for(Entry<String, Double> entry: leagueWinDayVsVCrimeCountMap.entrySet()) {
            leagueWinDayVsVCrimeRateChangeMap.put(entry.getKey(), calculateVCrimeRateChange(stringToLocalDate(entry.getKey())));
        }
        return leagueWinDayVsVCrimeRateChangeMap;
    }
    
    private HashMap<String, Double> makeWinLossDayVsGDCrimeRateChangeMap(HashMap<String, Double> leagueWinLossDayVsGDCrimeCountMap){
        HashMap<String, Double> leagueLossDayVsGDCrimeRateChangeMap = new HashMap<String, Double>();
        for(Entry<String, Double> entry: leagueWinLossDayVsGDCrimeCountMap.entrySet()) {
            leagueLossDayVsGDCrimeRateChangeMap.put(entry.getKey(), calculateGDCrimeRateChange(stringToLocalDate(entry.getKey())));
        }
        return leagueLossDayVsGDCrimeRateChangeMap;
    }
    
    private HashMap<String, Double> makeWinLossDayVsAllCrimeRateChangeMap(HashMap<String, Double> leagueWinLossDayVsAllCrimeCountMap){
        HashMap<String, Double> leagueLossDayVsAllCrimeRateChangeMap = new HashMap<String, Double>();
        for(Entry<String, Double> entry: leagueWinLossDayVsAllCrimeCountMap.entrySet()) {
            leagueLossDayVsAllCrimeRateChangeMap.put(entry.getKey(), calculateAllCrimeRateChange(stringToLocalDate(entry.getKey())));
        }
        return leagueLossDayVsAllCrimeRateChangeMap;
    }  

    public HashMap<String, Double> getNHLWinVsVCrimeRateChangeMap(){
        NHLWinVsVCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(NHLWinVsViolentCrimeMap);
        return NHLWinVsVCrimeRateChangeMap;
    }

    public HashMap<String, Double> getNHLLossVsVCrimeRateChangeMap(){
        NHLLossVsVCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(NHLLossVsViolentCrimeMap);
        return NHLLossVsVCrimeRateChangeMap;
    }
    public HashMap<String, Double> getNFLWinVsVCrimeRateChangeMap(){
        NFLWinVsVCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(NFLWinVsViolentCrimeMap);
        return NFLWinVsVCrimeRateChangeMap;
    }

    public HashMap<String, Double> getNFLLossVsVCrimeRateChangeMap(){
        NFLLossVsVCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(NFLLossVsViolentCrimeMap);
        return NFLLossVsVCrimeRateChangeMap;
    }
    public HashMap<String, Double> getNBAWinVsVCrimeRateChangeMap(){
        NBAWinVsVCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(NBAWinVsViolentCrimeMap);
        return NBAWinVsVCrimeRateChangeMap;
    }

    public HashMap<String, Double> getNBALossVsVCrimeRateChangeMap(){
        NBALossVsVCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(NBALossVsViolentCrimeMap);
        return NBALossVsVCrimeRateChangeMap;
    }
    public HashMap<String, Double> getMLBWinVsVCrimeRateChangeMap(){
        MLBWinVsVCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(MLBWinVsViolentCrimeMap);
        return MLBWinVsVCrimeRateChangeMap;
    }

    public HashMap<String, Double> getMLBLossVsVCrimeRateChangeMap(){
        MLBLossVsVCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(MLBLossVsViolentCrimeMap);
        return MLBLossVsVCrimeRateChangeMap;
    }
    public HashMap<String, Double> getNHLWinVsGDCrimeRateChangeMap(){
        NHLWinVsGDCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(NHLWinVsGDCrimeMap);
        return NHLWinVsGDCrimeRateChangeMap;
    }

    public HashMap<String, Double> getNHLLossVsGDCrimeRateChangeMap(){
        NHLLossVsGDCrimeRateChangeMap = makeWinLossDayVsGDCrimeRateChangeMap(NHLLossVsGDCrimeMap);
        return NHLLossVsGDCrimeRateChangeMap;
    }
    public HashMap<String, Double> getNFLWinVsGDCrimeRateChangeMap(){
        NFLWinVsGDCrimeRateChangeMap = makeWinLossDayVsGDCrimeRateChangeMap(NFLWinVsGDCrimeMap);
        return NFLWinVsGDCrimeRateChangeMap;
    }

    public HashMap<String, Double> getNFLLossVsGDCrimeRateChangeMap(){
        NFLLossVsGDCrimeRateChangeMap = makeWinLossDayVsGDCrimeRateChangeMap(NFLLossVsGDCrimeMap);
        return NFLLossVsGDCrimeRateChangeMap;
    }
    public HashMap<String, Double> getNBAWinVsGDCrimeRateChangeMap(){
        NBAWinVsGDCrimeRateChangeMap = makeWinLossDayVsGDCrimeRateChangeMap(NBAWinVsGDCrimeMap);
        return NBAWinVsGDCrimeRateChangeMap;
    }

    public HashMap<String, Double> getNBALossVsGDCrimeRateChangeMap(){
        NBALossVsGDCrimeRateChangeMap = makeWinLossDayVsGDCrimeRateChangeMap(NBALossVsGDCrimeMap);
        return NBALossVsGDCrimeRateChangeMap;
    }
    public HashMap<String, Double> getMLBWinVsGDCrimeRateChangeMap(){
        MLBWinVsGDCrimeRateChangeMap = makeWinLossDayVsGDCrimeRateChangeMap(MLBWinVsGDCrimeMap);
        return MLBWinVsGDCrimeRateChangeMap;
    }

    public HashMap<String, Double> getMLBLossVsGDCrimeRateChangeMap(){
        MLBLossVsGDCrimeRateChangeMap = makeWinLossDayVsGDCrimeRateChangeMap(MLBLossVsGDCrimeMap);
        return MLBLossVsGDCrimeRateChangeMap;
    }
    public HashMap<String, Double> getNHLWinVsAllCrimeRateChangeMap(){
        NHLWinVsVCrimeRateChangeMap = makeWinLossDayVsAllCrimeRateChangeMap(NHLWinVsAllCrimeMap);
        return NHLWinVsVCrimeRateChangeMap;
    }

    public HashMap<String, Double> getNHLLossVsAllCrimeRateChangeMap(){
        NHLLossVsAllCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(NHLLossVsViolentCrimeMap);
        return NHLLossVsAllCrimeRateChangeMap;
    }
    public HashMap<String, Double> getNFLWinVsAllCrimeRateChangeMap(){
        NFLWinVsAllCrimeRateChangeMap = makeWinLossDayVsAllCrimeRateChangeMap(NFLWinVsAllCrimeMap);
        return NFLWinVsAllCrimeRateChangeMap;
    }

    public HashMap<String, Double> getNFLLossVsAllCrimeRateChangeMap(){
        NFLLossVsVCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(NFLLossVsViolentCrimeMap);
        return NFLLossVsVCrimeRateChangeMap;
    }
    public HashMap<String, Double> getNBAWinVsAllCrimeRateChangeMap(){
        NBAWinVsAllCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(NBAWinVsAllCrimeMap);
        return NBAWinVsAllCrimeRateChangeMap;
    }

    public HashMap<String, Double> getNBALossVsAllCrimeRateChangeMap(){
        NBALossVsVCrimeRateChangeMap = makeWinLossDayVsVCrimeRateChangeMap(NBALossVsViolentCrimeMap);
        return NBALossVsVCrimeRateChangeMap;
    }
    public HashMap<String, Double> getMLBWinVsAllCrimeRateChangeMap(){
        MLBWinVsAllCrimeRateChangeMap = makeWinLossDayVsAllCrimeRateChangeMap(MLBWinVsAllCrimeMap);
        return MLBWinVsVCrimeRateChangeMap;
    }

    public HashMap<String, Double> getMLBLossVsAllCrimeRateChangeMap(){
        MLBLossVsAllCrimeRateChangeMap = makeWinLossDayVsAllCrimeRateChangeMap(MLBLossVsAllCrimeMap);
        return MLBLossVsAllCrimeRateChangeMap;
    }
}