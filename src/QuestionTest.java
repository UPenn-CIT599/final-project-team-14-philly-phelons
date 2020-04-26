import java.util.ArrayList;
import java.util.HashMap;

public class QuestionTest {
	
	public static void main(String[] args) throws Exception {
		
		CrimeReader reader = new CrimeReader();
		ArrayList<Crime> crimeArray = reader.getAllCrimeArray();
		
		MostFrequentCrimeOfLeagueEachYear thisQuestion = new MostFrequentCrimeOfLeagueEachYear(crimeArray);
		HashMap<String, String> thisAnswer = thisQuestion.MostFrequentCrimeOfLeagueEachYearOf2007To2011(crimeArray, "NHL");
		System.out.println(thisAnswer);
		
		RegionQuestionsLeague thisRegionQuestions = new RegionQuestionsLeague(crimeArray);
		HashMap<String, String> thisAnswer2 = thisRegionQuestions.mostFrequentCrimeOfEachRegionReport(crimeArray, "NHL");
		System.out.println(thisAnswer2);

		String thisAnswer3 = thisRegionQuestions.findRegionWithHighestDisturbanceRatePerLeague(crimeArray, "NHL");
		System.out.println(thisAnswer3);
		
		String thisAnswer4 = thisRegionQuestions.findRegionWithHighestViolentRate(crimeArray, "NHL");
		System.out.println(thisAnswer4);
	}
}
