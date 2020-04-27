import java.util.ArrayList;
import java.util.HashMap;

public class QuestionTest {
	
	public static void main(String[] args) throws Exception {
		
		//create a crime reader to return crime array
		CrimeReader reader = new CrimeReader();
		ArrayList<Crime> crimeArray = reader.getAllCrimeArray();
		
		//Question Most Frequent Crime of Each Year Per League
		MostFrequentCrimeOfLeagueEachYear thisQuestion = new MostFrequentCrimeOfLeagueEachYear(crimeArray);
		HashMap<String, String> thisAnswer = thisQuestion.getMostFrequentCrimeOfLeagueEachYearOf2007To2011(crimeArray, "NFL");
		System.out.println(thisAnswer);
		
		//Question Most Frequent Crime of Each Region Per League
		RegionQuestionsLeague thisRegionQuestions = new RegionQuestionsLeague(crimeArray);
		HashMap<String, String> thisAnswer2 = thisRegionQuestions.getMostFrequentCrimeOfEachRegionReport(crimeArray, "NFL");
		System.out.println(thisAnswer2);
		
        //Question Regions with their Disturbance Crime Rate Per League
		HashMap<String, Double> thisAnswer3 = thisRegionQuestions.findRegionWithHighestDisturbanceRatePerLeague(crimeArray, "NFL");
		System.out.println(thisAnswer3);
		
		//Display the region with the highest disturbance rate
		String thisAnswer4 = thisRegionQuestions.getRegionWithHighestDisturbanceRatePerLeague(thisAnswer3);
		System.out.println(thisAnswer4);
		
		//Question Region with their Violent Crime Rate Per League
		HashMap<String, Double> thisAnswer5 = thisRegionQuestions.findRegionWithHighestViolentRate(crimeArray, "NFL");
		System.out.println(thisAnswer5);
		
		//Question the region with the violent disturbance rate
		String thisAnswer6 = thisRegionQuestions.getRegionWithHighestViolentRatePerLeague(thisAnswer5);
		System.out.println(thisAnswer6);
	}
}
