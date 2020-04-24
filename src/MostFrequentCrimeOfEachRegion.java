import java.util.ArrayList;
import java.util.HashMap;

/**
 * Find answer to "Most Frequent Crime Type of Each Region"
 * @author Tian Xue
 * create a child class of Questions
 */
public class MostFrequentCrimeOfEachRegion extends Questions {
	
	public MostFrequentCrimeOfEachRegion(ArrayList<Crime> crime){
		super(crime);
	}
	
	/**
	 * Calculate the most frequent crime type of a given region
	 * @param crimeArray
	 * @param region
	 * @return the most frequent crime type of the given region
	 */
	public String calculateMostFrequentCrimeOfEachRegion(ArrayList<Crime> crimeArray, String region) {
		HashMap<String, Integer> thisQuestionCount = TotalCrimeCount(crimeArray); //create a hashmap to store crime count
		
		for(Crime crime: crimeArray) {
			String crimeType = crime.getCrimeCode();
			if(crime.getCrimeCode().equalsIgnoreCase(crimeType) && crime.getDistrict().contains(region)) { //count the number of crime based of region
				int temp = thisQuestionCount.get(crimeType) + 1;
				thisQuestionCount.put(crimeType,temp); //update the hashmap with crime type and count
			}
		}
		String thisQuestionAnswer = sortedCrimeType(thisQuestionCount); //sort the hashmap to find the highest count for a given region and output the crime type
		return thisQuestionAnswer;
	}
	
	/**
	 * Create a hashmap and store regions with their respective most frequent crime type
	 * @param crimeData
	 * @return region crime report
	 */
	public HashMap<String, String> mostFrequentCrimeOfEachRegionReport(ArrayList<Crime> crimeArray){ //create a hashmap to store region and associated crime type
		HashMap<String, String> crimeRegionReport = new HashMap<String, String>();
		for (Crime crime: crimeArray) {
			String region = crime.getDistrict(); // loop through each region
			if(crime.getDistrict().equals(region)) {
				crimeRegionReport.put(region, calculateMostFrequentCrimeOfEachRegion(crimeArray, region));//update the hashmap with region and associated most frequent crime type
			}
		}
		return crimeRegionReport;
	}
}
