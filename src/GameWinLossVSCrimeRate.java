import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author Robby Ballard
 *
 */
public class GameWinLossVSCrimeRate {
    
    private ArrayList<Games> createGameWins(String league) throws FileNotFoundException, IOException{
        LeagueReader lr = new LeagueReader();
        ArrayList<Games> leagueData = lr.readLeagueData(league);
        ArrayList<Games> gameWins = new ArrayList<Games>();
        for(Games game : leagueData) {
            if(Integer.parseInt(game.getHomeScore()) > Integer.parseInt(game.getAwayScore())){
                gameWins.add(game);
            }
        }
        return gameWins;
    }
    
//    private ArrayList<Crime> makeViolentCrimeArray(){
//        ArrayList<Crime> crimeArray = getCrime();
//        ArrayList<Crime> violentCrimeArray = new ArrayList<Crime>();
//        String[] violentCodes = new String[] {"100", "200", "300", "400", "800", "900", "1500"};
//        
//        for(String code : violentCodes) {
//            for(Crime crime : crimeArray) {
//                if(code.equals(crime.getUcrGeneral())) {
//                    violentCrimeArray.add(crime);
//                }
//            }
//        }
//        return violentCrimeArray;
//    }
    
//    private int NHLWinVSViolentCrime() throws FileNotFoundException, IOException {
//        ArrayList<Games> NHLWins = createGameWins("NHL");
//        ArrayList<Crime> violentCrimeArray = makeViolentCrimeArray();
//        int count = 0;
//        for(Games game : NHLWins) {
//            for(Crime crime : violentCrimeArray) {
//                if(game.getGameDate().equals(crime.getDispatchDate())) {
//                    count++;
//                }
//            }
//        }
//        return count;
//        
//    }
    

// private ArrayList<Crime> getCrime() {
//     CrimeReader cr = new CrimeReader();
////     ArrayList<Crime> testArray = cr.readCrimes();
//    return testArray;
// }
   // public static void main(String[] args) throws FileNotFoundException, IOException {
     //   GameWinLossVSCrimeRate GWLVWR = new GameWinLossVSCrimeRate();
       // System.out.println(Integer.toString(GWLVWR.NHLWinVSViolentCrime()));
    //}

    
}
