import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class MostFrequentCrimeOfLeagueEachYear extends Questions {
	public MostFrequentCrimeOfLeagueEachYear(ArrayList<Crime> crime){
		super(crime);
	}
	
	/**
	 * Calculate crime count based of crime type and year
	 * @param crimeArray
	 * @param year
	 * @return most frequent crime type of a given year
	 */
	public String calculateMostFrequentCrimeOfEachYear(ArrayList<Crime> crimeArray, String year, String league) {
		HashMap<String, Integer> thisQuestionCount = TotalCrimeCount(crimeArray); //create a HashMap to store count
		ArrayList<LocalDate> leagueGameDate = getLeagueGameDate(league);
		for(Crime crime: crimeArray) {
			String crimeType = crime.getCrimeCode();
			if(crime.getCrimeCode().equalsIgnoreCase(crimeType) && crime.getDate().toString().contains(year) && leagueGameDate.contains(crime.getDate())) { //count number of crime based of type
				int temp = thisQuestionCount.get(crimeType) + 1;
				thisQuestionCount.put(crimeType,temp); //put the type and associated count into the HashMap
			}
		}
		String thisQuestionAnswer = sortedCrimeType(thisQuestionCount); //sort the HashMap to find the most frequent crime type
		return thisQuestionAnswer;
	}
	
	/**
	 * Create a HashMap to store year and associated most frequent crime type
	 * @param crimeArray
	 * @return annual report
	 */
	public HashMap <String, String> getMostFrequentCrimeOfLeagueEachYearOf2007To2011(ArrayList<Crime> crimeArray, String league) {
		HashMap<String, String> annualReport = new HashMap<String, String>();
		for(int i = 2007; i < 2012; i++) {
			String annualData = calculateMostFrequentCrimeOfEachYear(crimeArray, Integer.toString(i).substring(2, 3), league);
			annualReport.put(Integer.toString(i), annualData);
		}
		return annualReport;
	}

}
