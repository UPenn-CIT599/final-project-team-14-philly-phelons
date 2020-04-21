import java.util.ArrayList;
import java.util.HashMap;

/**
 * Find the region with highest rate of disturbance crime
 * @author Tian Xue
 * create a child class of Questions
 */

public class RegionWithHighestDisturbanceRate extends Questions {
	public RegionWithHighestDisturbanceRate(ArrayList<Crime> crime){
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
}

