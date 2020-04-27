import java.util.HashMap;
import java.util.Map.Entry;

public class CrimeRateChangePerTeamCalculationOutput {

    //Question 7 for all Crime Rate Types//
    public static Double getNHLWinVsAllCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NHLWinVsAllCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NHLWinVsAllCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNHLWinVsGDCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NHLWinVsGDCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NHLWinVsGDCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNHLWinVsViolentCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NHLWinVsVCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NHLWinVsVCrimeRateChangeMap.keySet().size();
    }  
    
    public static Double getMLBWinVsAllCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.MLBWinVsAllCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.MLBWinVsAllCrimeRateChangeMap.keySet().size();
    }  
    public static Double getMLBWinVsGDCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.MLBWinVsGDCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.MLBWinVsGDCrimeRateChangeMap.keySet().size();
    }  
    public static Double getMLBWinVsViolentCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.MLBWinVsVCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.MLBWinVsVCrimeRateChangeMap.keySet().size();
    }
    
    
    public static Double getNFLWinVsAllCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NFLWinVsAllCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NFLWinVsAllCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNFLWinVsGDCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NFLWinVsGDCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NFLWinVsGDCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNFLWinVsViolentCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NFLWinVsVCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NFLWinVsVCrimeRateChangeMap.keySet().size();
    }
    
    
    public static Double getNBAWinVsAllCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NBAWinVsAllCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NBAWinVsAllCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNBAWinVsGDCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NBAWinVsGDCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NBAWinVsGDCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNBAWinVsViolentCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NBAWinVsVCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NBAWinVsVCrimeRateChangeMap.keySet().size();
    }
    
    public static Double getNHLLossVsAllCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NHLLossVsAllCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NHLLossVsAllCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNHLLossVsGDCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NHLLossVsGDCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NHLLossVsGDCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNHLLossVsViolentCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NHLLossVsVCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NHLLossVsVCrimeRateChangeMap.keySet().size();
    }  
    
    public static Double getMLBLossVsAllCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.MLBLossVsAllCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.MLBLossVsAllCrimeRateChangeMap.keySet().size();
    }  
    public static Double getMLBLossVsGDCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.MLBLossVsGDCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.MLBLossVsGDCrimeRateChangeMap.keySet().size();
    }  
    public static Double getMLBLossVsViolentCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.MLBLossVsVCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.MLBLossVsVCrimeRateChangeMap.keySet().size();
    }
    
    
    public static Double getNFLLossVsAllCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NFLLossVsAllCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NFLLossVsAllCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNFLLossVsGDCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NFLLossVsGDCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NFLLossVsGDCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNFLLossVsViolentCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NFLLossVsVCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NFLLossVsVCrimeRateChangeMap.keySet().size();
    }
    
    
    public static Double getNBALossVsAllCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NBALossVsAllCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NBALossVsAllCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNBALossVsGDCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NBALossVsGDCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NBALossVsGDCrimeRateChangeMap.keySet().size();
    }  
    public static Double getNBALossVsViolentCrimeRateCumulative() {
        Double crimeRateChangeSum = 0.0;

        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NBALossVsVCrimeRateChangeMap.entrySet()) {
            crimeRateChangeSum += entry.getValue();
        }
        return crimeRateChangeSum / GameWinLossVSCrimeRate.NBALossVsVCrimeRateChangeMap.keySet().size();
    }
    
    
    //Question 8 for all 3 Different Crime Rate Types and for Both Wins and losses//
    
    public static String whichSportHasHighestAllCrimeRateForWins() {
        String teamWithHighestAllCrimeRate = "";
        if(getNBAWinVsAllCrimeRateCumulative() > getNHLWinVsAllCrimeRateCumulative() && 
                getNBAWinVsAllCrimeRateCumulative() > getNFLWinVsAllCrimeRateCumulative() &&
                getNBAWinVsAllCrimeRateCumulative() > getMLBWinVsAllCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "NBA";
        }
        if(getNFLWinVsAllCrimeRateCumulative() > getNHLWinVsAllCrimeRateCumulative() && 
                getNFLWinVsAllCrimeRateCumulative() > getNBAWinVsAllCrimeRateCumulative() &&
                getNFLWinVsAllCrimeRateCumulative() > getMLBWinVsAllCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "NFL";
        }
        if(getNHLWinVsAllCrimeRateCumulative() > getNBAWinVsAllCrimeRateCumulative() && 
                getNHLWinVsAllCrimeRateCumulative() > getNFLWinVsAllCrimeRateCumulative() &&
                getNHLWinVsAllCrimeRateCumulative() > getMLBWinVsAllCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "NHL";
        }
        if(getMLBWinVsAllCrimeRateCumulative() > getNHLWinVsAllCrimeRateCumulative() && 
                getMLBWinVsAllCrimeRateCumulative() > getNFLWinVsAllCrimeRateCumulative() &&
                getNBAWinVsAllCrimeRateCumulative() > getNBAWinVsAllCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "MLB";
        }
        return teamWithHighestAllCrimeRate;
    }
    public static String whichSportHasHighestAllCrimeRateForLosses() {
        String teamWithHighestAllCrimeRate = "";
        if(getNBALossVsAllCrimeRateCumulative() > getNHLLossVsAllCrimeRateCumulative() && 
                getNBALossVsAllCrimeRateCumulative() > getNFLLossVsAllCrimeRateCumulative() &&
                getNBALossVsAllCrimeRateCumulative() > getMLBLossVsAllCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "NBA";
        }
        if(getNFLLossVsAllCrimeRateCumulative() > getNHLLossVsAllCrimeRateCumulative() && 
                getNFLLossVsAllCrimeRateCumulative() > getNBALossVsAllCrimeRateCumulative() &&
                getNFLLossVsAllCrimeRateCumulative() > getMLBLossVsAllCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "NFL";
        }
        if(getNHLLossVsAllCrimeRateCumulative() > getNBALossVsAllCrimeRateCumulative() && 
                getNHLLossVsAllCrimeRateCumulative() > getNFLLossVsAllCrimeRateCumulative() &&
                getNHLWinVsAllCrimeRateCumulative() > getMLBLossVsAllCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "NHL";
        }
        if(getMLBLossVsAllCrimeRateCumulative() > getNHLLossVsAllCrimeRateCumulative() && 
                getMLBLossVsAllCrimeRateCumulative() > getNFLLossVsAllCrimeRateCumulative() &&
                getNBALossVsAllCrimeRateCumulative() > getNBALossVsAllCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "MLB";
        }
        return teamWithHighestAllCrimeRate;
    }
    
    public static String whichSportHasHighestViolentCrimeRateForWins() {
        String teamWithHighestViolentCrimeRate = "";
        if(getNBAWinVsViolentCrimeRateCumulative() > getNHLWinVsViolentCrimeRateCumulative() && 
                getNBAWinVsViolentCrimeRateCumulative() > getNFLWinVsViolentCrimeRateCumulative() &&
                getNBAWinVsViolentCrimeRateCumulative() > getMLBWinVsViolentCrimeRateCumulative()) {
            teamWithHighestViolentCrimeRate = "NBA";
        }
        if(getNFLWinVsViolentCrimeRateCumulative() > getNHLWinVsViolentCrimeRateCumulative() && 
                getNFLWinVsViolentCrimeRateCumulative() > getNBAWinVsViolentCrimeRateCumulative() &&
                getNFLWinVsViolentCrimeRateCumulative() > getMLBWinVsViolentCrimeRateCumulative()) {
            teamWithHighestViolentCrimeRate = "NFL";
        }
        if(getNHLWinVsViolentCrimeRateCumulative() > getNBAWinVsViolentCrimeRateCumulative() && 
                getNHLWinVsViolentCrimeRateCumulative() > getNFLWinVsViolentCrimeRateCumulative() &&
                getNHLWinVsViolentCrimeRateCumulative() > getMLBWinVsViolentCrimeRateCumulative()) {
            teamWithHighestViolentCrimeRate = "NHL";
        }
        if(getMLBWinVsViolentCrimeRateCumulative() > getNHLWinVsViolentCrimeRateCumulative() && 
                getMLBWinVsAllCrimeRateCumulative() > getNFLWinVsViolentCrimeRateCumulative() &&
                getNBAWinVsViolentCrimeRateCumulative() > getNBAWinVsViolentCrimeRateCumulative()) {
            teamWithHighestViolentCrimeRate = "MLB";
        }
        return teamWithHighestViolentCrimeRate;
    }
    public static String whichSportHasHighestViolentCrimeRateForLosses() {
        String teamWithHighestAllCrimeRate = "";
        if(getNBALossVsViolentCrimeRateCumulative() > getNHLLossVsViolentCrimeRateCumulative() && 
                getNBALossVsViolentCrimeRateCumulative() > getNFLLossVsViolentCrimeRateCumulative() &&
                getNBALossVsViolentCrimeRateCumulative() > getMLBLossVsViolentCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "NBA";
        }
        if(getNFLLossVsViolentCrimeRateCumulative() > getNHLLossVsAllCrimeRateCumulative() && 
                getNFLLossVsViolentCrimeRateCumulative() > getNBALossVsViolentCrimeRateCumulative() &&
                getNFLLossVsViolentCrimeRateCumulative() > getMLBLossVsViolentCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "NFL";
        }
        if(getNHLLossVsViolentCrimeRateCumulative() > getNBALossVsViolentCrimeRateCumulative() && 
                getNHLLossVsViolentCrimeRateCumulative() > getNFLLossVsViolentCrimeRateCumulative() &&
                getNHLWinVsViolentCrimeRateCumulative() > getMLBLossVsViolentCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "NHL";
        }
        if(getMLBLossVsAllCrimeRateCumulative() > getNHLLossVsViolentCrimeRateCumulative() && 
                getMLBLossVsViolentCrimeRateCumulative() > getNFLLossVsViolentCrimeRateCumulative() &&
                getNBALossVsViolentCrimeRateCumulative() > getNBALossVsViolentCrimeRateCumulative()) {
            teamWithHighestAllCrimeRate = "MLB";
        }
        return teamWithHighestAllCrimeRate;
    }
    
    public static String whichSportHasHighestGDCrimeRateForWins() {
        String teamWithHighestGDCrimeRate = "";
        if(getNBAWinVsAllCrimeRateCumulative() > getNHLWinVsGDCrimeRateCumulative() && 
                getNBAWinVsGDCrimeRateCumulative() > getNFLWinVsGDCrimeRateCumulative() &&
                getNBAWinVsGDCrimeRateCumulative() > getMLBWinVsGDCrimeRateCumulative()) {
            teamWithHighestGDCrimeRate = "NBA";
        }
        if(getNFLWinVsGDCrimeRateCumulative() > getNHLWinVsGDCrimeRateCumulative() && 
                getNFLWinVsGDCrimeRateCumulative() > getNBAWinVsGDCrimeRateCumulative() &&
                getNFLWinVsGDCrimeRateCumulative() > getMLBWinVsGDCrimeRateCumulative()) {
            teamWithHighestGDCrimeRate = "NFL";
        }
        if(getNHLWinVsGDCrimeRateCumulative() > getNBAWinVsGDCrimeRateCumulative() && 
                getNHLWinVsGDCrimeRateCumulative() > getNFLWinVsGDCrimeRateCumulative() &&
                getNHLWinVsGDCrimeRateCumulative() > getMLBWinVsGDCrimeRateCumulative()) {
            teamWithHighestGDCrimeRate = "NHL";
        }
        if(getMLBWinVsGDCrimeRateCumulative() > getNHLWinVsGDCrimeRateCumulative() && 
                getMLBWinVsAllCrimeRateCumulative() > getNFLWinVsGDCrimeRateCumulative() &&
                getNBAWinVsGDCrimeRateCumulative() > getNBAWinVsGDCrimeRateCumulative()) {
            teamWithHighestGDCrimeRate = "MLB";
        }
        return teamWithHighestGDCrimeRate;
    }
    public static String whichSportHasHighestGDCrimeRateForLosses() {
        String teamWithHighestGDCrimeRate = "";
        if(getNBALossVsGDCrimeRateCumulative() > getNHLLossVsGDCrimeRateCumulative() && 
                getNBALossVsGDCrimeRateCumulative() > getNFLLossVsGDCrimeRateCumulative() &&
                getNBALossVsGDCrimeRateCumulative() > getMLBLossVsGDCrimeRateCumulative()) {
            teamWithHighestGDCrimeRate = "NBA";
        }
        if(getNFLLossVsGDCrimeRateCumulative() > getNHLLossVsGDCrimeRateCumulative() && 
                getNFLLossVsGDCrimeRateCumulative() > getNBALossVsGDCrimeRateCumulative() &&
                getNFLLossVsGDCrimeRateCumulative() > getMLBLossVsGDCrimeRateCumulative()) {
            teamWithHighestGDCrimeRate = "NFL";
        }
        if(getNHLLossVsGDCrimeRateCumulative() > getNBALossVsGDCrimeRateCumulative() && 
                getNHLLossVsGDCrimeRateCumulative() > getNFLLossVsGDCrimeRateCumulative() &&
                getNHLWinVsGDCrimeRateCumulative() > getMLBLossVsGDCrimeRateCumulative()) {
            teamWithHighestGDCrimeRate = "NHL";
        }
        if(getMLBLossVsGDCrimeRateCumulative() > getNHLLossVsGDCrimeRateCumulative() && 
                getMLBLossVsGDCrimeRateCumulative() > getNFLLossVsGDCrimeRateCumulative() &&
                getNBALossVsGDCrimeRateCumulative() > getNBALossVsGDCrimeRateCumulative()) {
            teamWithHighestGDCrimeRate = "MLB";
        }
        return teamWithHighestGDCrimeRate;
    }
    
    //Question 9//
    public static String NFLOpponentWithHighestCrimeRateforLoss() {
        Entry<String, Double> maxEntry = null;
        String opponentWithHighestCrimeRate = "";
        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NFLLossVsAllCrimeRateChangeMap.entrySet()) {
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        for(Games game : LeagueReader.NFLArray) {
            if(maxEntry.getKey().equals(game.getGameDate().toString())){
                opponentWithHighestCrimeRate = game.getAwayTeam();
            }
        }
        return opponentWithHighestCrimeRate;
    }
    public static String NHLOpponentWithHighestCrimeRateForLoss() {
        Entry<String, Double> maxEntry = null;
        String opponentWithHighestCrimeRate = "";
        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NHLLossVsAllCrimeRateChangeMap.entrySet()) {
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        for(Games game : LeagueReader.NHLArray) {
            if(maxEntry.getKey().equals(game.getGameDate().toString())){
                opponentWithHighestCrimeRate = game.getAwayTeam();
            }
        }
        return opponentWithHighestCrimeRate;
    }
    public static String NBAOpponentWithHighestCrimeRateForLoss() {
        Entry<String, Double> maxEntry = null;
        String opponentWithHighestCrimeRate = "";
        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NBALossVsAllCrimeRateChangeMap.entrySet()) {
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        for(Games game : LeagueReader.NBAArray) {
            if(maxEntry.getKey().equals(game.getGameDate().toString())){
                opponentWithHighestCrimeRate = game.getAwayTeam();
            }
        }
        return opponentWithHighestCrimeRate;
    }
    public static String MLBOpponentWithHighestCrimeRateForLoss() {
        Entry<String, Double> maxEntry = null;
        String opponentWithHighestCrimeRate = "";
        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.MLBLossVsAllCrimeRateChangeMap.entrySet()) {
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        for(Games game : LeagueReader.MLBArray) {
            if(maxEntry.getKey().equals(game.getGameDate().toString())){
                opponentWithHighestCrimeRate = game.getAwayTeam();
            }
        }
        return opponentWithHighestCrimeRate;
    }
    public static String NFLOpponentWithHighestCrimeRateForWin() {
        Entry<String, Double> maxEntry = null;
        String opponentWithHighestCrimeRate = "";
        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NFLWinVsAllCrimeRateChangeMap.entrySet()) {
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        for(Games game : LeagueReader.NFLArray) {
            if(maxEntry.getKey().equals(game.getGameDate().toString())){
                opponentWithHighestCrimeRate = game.getAwayTeam();
            }
        }
        return opponentWithHighestCrimeRate;
    }
    public static String NHLOpponentWithHighestCrimeRateForWin() {
        Entry<String, Double> maxEntry = null;
        String opponentWithHighestCrimeRate = "";
        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NHLWinVsAllCrimeRateChangeMap.entrySet()) {
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        for(Games game : LeagueReader.NHLArray) {
            if(maxEntry.getKey().equals(game.getGameDate().toString())){
                opponentWithHighestCrimeRate = game.getAwayTeam();
            }
        }
        return opponentWithHighestCrimeRate;
    }
    public static String NBAOpponentWithHighestCrimeRateForWin() {
        Entry<String, Double> maxEntry = null;
        String opponentWithHighestCrimeRate = "";
        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.NBAWinVsAllCrimeRateChangeMap.entrySet()) {
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        for(Games game : LeagueReader.NBAArray) {
            if(maxEntry.getKey().equals(game.getGameDate().toString())){
                opponentWithHighestCrimeRate = game.getAwayTeam();
            }
        }
        return opponentWithHighestCrimeRate;
    }
    public static String MLBOpponentWithHighestCrimeRateForWin() {
        Entry<String, Double> maxEntry = null;
        String opponentWithHighestCrimeRate = "";
        for(Entry<String, Double> entry : GameWinLossVSCrimeRate.MLBWinVsAllCrimeRateChangeMap.entrySet()) {
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        for(Games game : LeagueReader.MLBArray) {
            if(maxEntry.getKey().equals(game.getGameDate().toString())){
                opponentWithHighestCrimeRate = game.getAwayTeam();
            }
        }
        return opponentWithHighestCrimeRate;
    }
    
    public static void printQuestion7() {
        System.out.println("When the Phillies won, the TOTAL crime rate changed, on average, by " + getMLBWinVsAllCrimeRateCumulative() + "%");
        System.out.println("When the Phillies lost, the TOTAL crime rate changed, on average, by " + getMLBLossVsAllCrimeRateCumulative() + "%");
        System.out.println("When the Eagles won, the TOTAL crime rate changed, on average, by " + getNFLWinVsAllCrimeRateCumulative() + "%");
        System.out.println("When the Eagles lost, the TOTAL crime rate changed, on average, by " + getNFLLossVsAllCrimeRateCumulative() + "%");
        System.out.println("When the 76ers won, the TOTAL crime rate changed, on average, by " + getNBAWinVsAllCrimeRateCumulative() + "%");
        System.out.println("When the 76ers lost, the TOTAL crime rate changed, on average, by " + getNBALossVsAllCrimeRateCumulative() + "%");
        System.out.println("When the Flyers won, the TOTAL crime rate changed, on average, by " + getNHLWinVsAllCrimeRateCumulative() + "%");
        System.out.println("When the Flyers lost, the TOTAL crime rate changed, on average, by " + getNHLLossVsAllCrimeRateCumulative() + "%");
        System.out.println("When the Phillies won, the VIOLENT crime rate changed, on average, by " + getMLBWinVsViolentCrimeRateCumulative() + "%");
        System.out.println("When the Phillies lost, the VIOLENT crime rate changed, on average, by " + getMLBLossVsViolentCrimeRateCumulative() + "%");
        System.out.println("When the Eagles won, the VIOLENT crime rate changed, on average, by " + getNFLWinVsViolentCrimeRateCumulative() + "%");
        System.out.println("When the Eagles lost, the VIOLENT crime rate changed, on average, by " + getNFLLossVsViolentCrimeRateCumulative() + "%");
        System.out.println("When the 76ers won, the VIOLENT crime rate changed, on average, by " + getNBAWinVsViolentCrimeRateCumulative() + "%");
        System.out.println("When the 76ers lost, the VIOLENT crime rate changed, on average, by " + getNBALossVsViolentCrimeRateCumulative() + "%");
        System.out.println("When the Flyers won, the VIOLENT crime rate changed, on average, by " + getNHLWinVsViolentCrimeRateCumulative() + "%");
        System.out.println("When the Flyers lost, the VIOLENT crime rate changed, on average, by " + getNHLLossVsViolentCrimeRateCumulative() + "%");
        System.out.println("When the Phillies won, the GENERAL DISTURBANCE crime rate changed, on average, by " + getMLBWinVsGDCrimeRateCumulative() + "%");
        System.out.println("When the Phillies lost, the GENERAL DISTURBANCE crime rate changed, on average, by " + getMLBLossVsGDCrimeRateCumulative() + "%");
        System.out.println("When the Eagles won, the GENERAL DISTURBANCE crime rate changed, on average, by " + getNFLWinVsGDCrimeRateCumulative() + "%");
        System.out.println("When the Eagles lost, the GENERAL DISTURBANCE crime rate changed, on average, by " + getNFLLossVsGDCrimeRateCumulative() + "%");
        System.out.println("When the 76ers won, the GENERAL DISTURBANCE crime rate changed, on average, by " + getNBAWinVsGDCrimeRateCumulative() + "%");
        System.out.println("When the 76ers lost, the GENERAL DISTURBANCE crime rate changed, on average, by " + getNBALossVsGDCrimeRateCumulative() + "%");
        System.out.println("When the Flyers won, the GENERAL DISTURBANCE crime rate changed, on average, by " + getNHLWinVsGDCrimeRateCumulative() + "%");
        System.out.println("When the Flyers won, the GENERAL DISTURBANCE crime rate changed, on average, by " + getNHLLossVsGDCrimeRateCumulative() + "%");
    }
        public static void printQuestion8() {
        
        System.out.println("Philadelphia's " + whichSportHasHighestViolentCrimeRateForWins() + " franchise had the VIOLENT highest crime rate when they won a game.");
        System.out.println("Philadelphia's " + whichSportHasHighestGDCrimeRateForWins() + " franchise had the highest GENERAL DISTURBANCE crime rate when they won a game.");
        System.out.println("Philadelphia's " + whichSportHasHighestAllCrimeRateForWins() + " franchise had the highest TOTAL crime rate when they won a game.");
        System.out.println("Philadelphia's " + whichSportHasHighestViolentCrimeRateForLosses() + " franchise had the VIOLENT highest crime rate when they lost a game.");
        System.out.println("Philadelphia's " + whichSportHasHighestGDCrimeRateForLosses() + " franchise had the highest GENERAL DISTURBANCE crime rate when they lost a game.");
        System.out.println("Philadelphia's " + whichSportHasHighestAllCrimeRateForLosses() + " franchise had the highest TOTAL crime rate when they lost a game.");

    }
        
        public static void printQuestion9() {
            System.out.println("The highest crime rate on a day when the Eagles won occurred when they played " + NFLOpponentWithHighestCrimeRateForWin());
            System.out.println("The highest crime rate on a day when the Eagles lost occurred when they played " + NFLOpponentWithHighestCrimeRateforLoss());
            System.out.println("The highest crime rate on a day when the Phillies won occurred when they played " + MLBOpponentWithHighestCrimeRateForWin());
            System.out.println("The highest crime rate on a day when the Phillies lost occurred when they played " + MLBOpponentWithHighestCrimeRateForWin());
            System.out.println("The highest crime rate on a day when the Flyers won occurred when they played " + NHLOpponentWithHighestCrimeRateForWin());
            System.out.println("The highest crime rate on a day when the Flyers won occurred when they played " + NHLOpponentWithHighestCrimeRateForLoss());
            System.out.println("The highest crime rate on a day when the 76ers won occurred when they played " + NBAOpponentWithHighestCrimeRateForWin());
            System.out.println("The highest crime rate on a day when the 76ers won occurred when they played " + NBAOpponentWithHighestCrimeRateForWin());

        }
}
