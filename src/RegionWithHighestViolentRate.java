import java.util.ArrayList;
import java.util.HashMap;


/**
 * Find the region with highest rate of violent crime
 * @author Tian Xue
 * create a child class of Questions
 */
public class RegionWithHighestViolentRate extends Questions {
	public RegionWithHighestViolentRate(ArrayList<Crime> crime){
		super(crime);
	}
	
	/**
	 * Calculate the violent crime rate of each region and sort to find the region with highest violent crime rate
	 * @param crimeArray
	 * @return region with highest violent crime rate
	 */
	public String findRegionWithHighestViolentRate(ArrayList<Crime> crimeArray) {
		HashMap<String, Integer> thisQuestionCount = TotalCrimeCount(crimeArray); // create a hashmap to store count of crime for each region
		HashMap<String, Integer> thisViolentCount = TotalCrimeCount(CrimeReader.getViolentCrimeArray()); // create a hashmap to store count of violent crime for each region
		HashMap<String, Boolean> thisRegionSet = regionSet(crimeArray); // create a hashmap to store regions
		
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
		HashMap<String, Integer> vioRate = new HashMap<>(); // create a hashmap to store region and associated violent crime rate
		for (String region: thisRegionSet.keySet()) {
			vioRate.put(region, thisViolentCount.get(region)/thisQuestionCount.get(region)); //update the hashmap with region and associated violent crime rate
		}
		
		String thisQuestionAnswer = sortedCrimeType(vioRate); // Sort the regions with violent crime rate to output the highest region
		return thisQuestionAnswer;
	}
}
