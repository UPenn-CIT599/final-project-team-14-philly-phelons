import java.util.ArrayList;
import java.util.HashMap;


/**
 * Find answer to question "Most Frequent Crime Type of Each Year 2007 - 2011"
 * @author Tian Xue
 * create a child class of Questions
 */
public class MostFrequentCrimeOfEachYear extends Questions {
	
	public MostFrequentCrimeOfEachYear(ArrayList<Crime> crime){
		super(crime);
	}
	
	/**
	 * Calculate crime count based of crime type and year
	 * @param crimeArray
	 * @param year
	 * @return most frequent crime type of a given year
	 */
	public String calculateMostFrequentCrimeOfEachYear(ArrayList<Crime> crimeArray, String year) {
		HashMap<String, Integer> thisQuestionCount = TotalCrimeCount(crimeArray); //create a hashmap to store count
		for(Crime crime: crimeArray) {
			String crimeType = crime.getCrimeCode();
			if(crime.getCrimeCode().equalsIgnoreCase(crimeType) && crime.getDate().toString().contains(year)) { //count number of crime based of type
				int temp = thisQuestionCount.get(crimeType) + 1;
				thisQuestionCount.put(crimeType,temp); //put the type and associated count into the hashmap
			}
		}
		String thisQuestionAnswer = sortedCrimeType(thisQuestionCount); //sort the hashmap to find the most frequent crime type
		return thisQuestionAnswer;
	}
	
	/**
	 * Create a hashmap to store year and associated most frequent crime type
	 * @param crimeArray
	 * @return annual report
	 */
	public HashMap <String, String> MostFrequentCrimeOfEachYearOf2007To2011(ArrayList<Crime> crimeArray) {
		HashMap<String, String> annualReport = new HashMap<String, String>();
		for(int i = 2007; i < 2012; i++) {
			String annualData = calculateMostFrequentCrimeOfEachYear(crimeArray, Integer.toString(i));
			annualReport.put(Integer.toString(i), annualData);
		}
		return annualReport;
	}
}
