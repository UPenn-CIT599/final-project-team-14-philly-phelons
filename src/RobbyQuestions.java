import java.util.Map.Entry;

public class RobbyQuestions {

    
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
    
    
    //Question 8//
    
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
}
