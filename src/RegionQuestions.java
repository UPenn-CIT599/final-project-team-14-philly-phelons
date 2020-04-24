import java.util.ArrayList;
import java.util.HashMap;

public class RegionQuestions extends Questions {
	public RegionQuestions(ArrayList<Crime> crime){
		super(crime);
	}
	
	/**
	 * Calculate the disturbance crime rate of each region and sort to find the region with highest disturbance crime rate
	 * @param crimeArray
	 * @return region with highest disturbance crime rate
	 */
	public String findRegionWithHighestDisturbanceRate(ArrayList<Crime> crimeArray) {
		HashMap<String, Integer> thisQuestionCount = TotalCrimeCount(crimeArray);
		HashMap<String, Integer> thisDisturbanceCount = TotalCrimeCount(CrimeReader.getViolentCrimeArray());
		HashMap<String, Boolean> thisRegionSet = regionSet(crimeArray);
		
		for(Crime crime: crimeArray) {
			String region = crime.getDistrict();
			if(crime.getDistrict().equalsIgnoreCase(region)) {
				int temp = thisQuestionCount.get(region) + 1;
				thisQuestionCount.put(region,temp); //count the total number of crime for each region
			}
			
			else if(crime.getDistrict().equalsIgnoreCase(region) && CrimeReader.getGenDisturbanceArray().contains(crime.getCrimeCode())) {
				int temp2 = thisQuestionCount.get(region) + 1;
				thisDisturbanceCount.put(region,temp2); //count the total number of violent crime (firearm related) for each region
			}
		}
		HashMap<String, Integer> vioRate = new HashMap<>();
		for (String region: thisRegionSet.keySet()) {
			vioRate.put(region, thisDisturbanceCount.get(region)/thisQuestionCount.get(region)); //calculate the violent crime rate for each region
		}
		
		String thisQuestionAnswer = sortedCrimeType(vioRate);
		return thisQuestionAnswer;
	}
	/**
	 * Calculate the violent crime rate of each region and sort to find the region with highest violent crime rate
	 * @param crimeArray
	 * @return region with highest violent crime rate
	 */
	public String findRegionWithHighestViolentRate(ArrayList<Crime> crimeArray) {
		HashMap<String, Integer> thisQuestionCount = TotalCrimeCount(crimeArray); // create a HashMap to store count of crime for each region
		HashMap<String, Integer> thisViolentCount = TotalCrimeCount(CrimeReader.getViolentCrimeArray()); // create a HashMap to store count of violent crime for each region
		HashMap<String, Boolean> thisRegionSet = regionSet(crimeArray); // create a HashMap to store regions
		
		for(Crime crime: crimeArray) {
			String region = crime.getDistrict();
			if(crime.getDistrict().equalsIgnoreCase(region)) {
				int temp = thisQuestionCount.get(region) + 1;
				thisQuestionCount.put(region,temp); //count the total number of crime for each region
			}
			
			else if(crime.getDistrict().equalsIgnoreCase(region) && CrimeReader.getViolentCrimeArray().contains(crime.getCrimeCode())) {
				int temp2 = thisQuestionCount.get(region) + 1;
				thisViolentCount.put(region,temp2); //count the total number of violent crime for each region
			}
		}
		HashMap<String, Integer> vioRate = new HashMap<>(); // create a HashMap to store region and associated violent crime rate
		for (String region: thisRegionSet.keySet()) {
			vioRate.put(region, thisViolentCount.get(region)/thisQuestionCount.get(region)); //update the HashMap with region and associated violent crime rate
		}
		String thisQuestionAnswer = sortedCrimeType(vioRate); // Sort the regions with violent crime rate to output the highest region
		return thisQuestionAnswer;
	}
	
	/**
	 * Calculate the most frequent crime type of a given region
	 * @param crimeArray
	 * @param region
	 * @return the most frequent crime type of the given region
	 */
	public String calculateMostFrequentCrimeOfEachRegion(ArrayList<Crime> crimeArray, String region) {
		HashMap<String, Integer> thisQuestionCount = TotalCrimeCount(crimeArray); //create a HashMap to store crime count
		
		for(Crime crime: crimeArray) {
			String crimeType = crime.getCrimeCode();
			if(crime.getCrimeCode().equalsIgnoreCase(crimeType) && crime.getDistrict().contains(region)) { //count the number of crime based of region
				int temp = thisQuestionCount.get(crimeType) + 1;
				thisQuestionCount.put(crimeType,temp); //update the HashMap with crime type and count
			}
		}
		String thisQuestionAnswer = sortedCrimeType(thisQuestionCount); //sort the HashMap to find the highest count for a given region and output the crime type
		return thisQuestionAnswer;
	}
	
	/**
	 * Create a HashMap and store regions with their respective most frequent crime type
	 * @param crimeData
	 * @return region crime report
	 */
	public HashMap<String, String> mostFrequentCrimeOfEachRegionReport(ArrayList<Crime> crimeArray){ //create a HashMap to store region and associated crime type
		HashMap<String, String> crimeRegionReport = new HashMap<String, String>();
		for (Crime crime: crimeArray) {
			String region = crime.getDistrict(); // loop through each region
			if(crime.getDistrict().equals(region)) {
				crimeRegionReport.put(region, calculateMostFrequentCrimeOfEachRegion(crimeArray, region));//update the HashMap with region and associated most frequent crime type
			}
		}
		return crimeRegionReport;
	}
}
