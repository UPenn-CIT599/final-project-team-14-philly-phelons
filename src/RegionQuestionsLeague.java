
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;

public class RegionQuestionsLeague extends Questions {
	public RegionQuestionsLeague(ArrayList<Crime> crime){
		super(crime);
	}
	
	/**
	 * Based of each league, calculate the disturbance crime rate of each region and display 
	 * with highest disturbance crime rate
	 * @param crimeArray
	 * @param league
	 * @return disturbance rate of each region
	 */
	public HashMap<String, Double> findRegionWithHighestDisturbanceRatePerLeague(ArrayList<Crime> crimeArray, String league) {
		HashMap<String, Integer> thisQuestionCount = TotalCrimeCountByDistrict(crimeArray);
		HashMap<String, Integer> thisDisturbanceCount = TotalCrimeCountByDistrict(CrimeReader.getViolentCrimeArray());
		HashMap<String, Boolean> thisRegionSet = regionSet(crimeArray);
		ArrayList<LocalDate> leagueGameDate = getLeagueGameDate(league);
		
		for(Crime crime: crimeArray) {
			String region = crime.getDistrict();
			if(crime.getDistrict().equalsIgnoreCase(region) && leagueGameDate.contains(crime.getDate())) {
				int temp = thisQuestionCount.get(region) + 1;
				thisQuestionCount.put(region,temp); //count the total number of crime for each region
			}
		}		
		for(Crime crime : CrimeReader.getGenDisturbanceArray()) {
			String region = crime.getDistrict();
			if(crime.getDistrict().equalsIgnoreCase(region) && leagueGameDate.contains(crime.getDate())){
				int temp2 = thisDisturbanceCount.get(region) + 1;
				thisDisturbanceCount.put(region,temp2);//count the total number of disturbance crime for each region
			}
		}
		
		HashMap<String, Double> disturbanceRate = CalculateRate(thisQuestionCount, thisDisturbanceCount, thisRegionSet);//calculate the disturbance crime rate for each region
		return disturbanceRate;
	}
	
	/**
	 * Sort and find the region with highest disturbance rate
	 * @param regionDisturbanceRate
	 * @return the region with with highest disturbance rate
	 */
	public String getRegionWithHighestDisturbanceRatePerLeague(HashMap<String, Double> regionDisturbanceRate) {
		String thisQuestionAnswer = sortedCrimeRate(regionDisturbanceRate);
		return thisQuestionAnswer;
	}
	
	/**
	 * Based of each league, calculate the violent crime rate of each region and display
	 * @param crimeArray
	 * @return violent crime rate of each region
	 */
	public HashMap<String, Double> findRegionWithHighestViolentRate(ArrayList<Crime> crimeArray, String league) {
		HashMap<String, Integer> thisQuestionCount = TotalCrimeCountByDistrict(crimeArray); // create a HashMap to store count of crime for each region
		HashMap<String, Integer> thisViolenceCount = TotalCrimeCountByDistrict(CrimeReader.getViolentCrimeArray()); // create a HashMap to store count of violent crime for each region
		HashMap<String, Boolean> thisRegionSet = regionSet(crimeArray); // create a HashMap to store regions
		ArrayList<LocalDate> leagueGameDate = getLeagueGameDate(league);
		
		for(Crime crime: crimeArray) {
			String region = crime.getDistrict();
			if(crime.getDistrict().equalsIgnoreCase(region) && leagueGameDate.contains(crime.getDate())) {
				int temp = thisQuestionCount.get(region) + 1;
				thisQuestionCount.put(region,temp); //count the total number of crime for each region
			}
		}
		
		for(Crime crime: CrimeReader.getViolentCrimeArray()) {
			String region = crime.getDistrict();
			if(crime.getDistrict().equalsIgnoreCase(region) && leagueGameDate.contains(crime.getDate())) {
				int temp2 = thisViolenceCount.get(region) + 1;
				thisViolenceCount.put(region,temp2); //count the total number of violent crime for each region
			}
		}
		HashMap<String, Double> violenceRate = CalculateRate(thisQuestionCount, thisViolenceCount, thisRegionSet); // create a HashMap to store region and associated violent crime rate
		return violenceRate;
	}
	
	/**
	 * Sort and find the region with highest disturbance rate
	 * @param regionDisturbanceRate
	 * @return the region with with highest disturbance rate
	 */
	public String getRegionWithHighestViolentRatePerLeague(HashMap<String, Double> regionViolenceRate) {
		String thisQuestionAnswer = sortedCrimeRate(regionViolenceRate); // Sort the regions with violent crime rate to output the highest region
		return thisQuestionAnswer;
	}
	
	/**
	 * Calculate the most frequent crime type of a given region per league
	 * @param crimeArray
	 * @param region
	 * @param league
	 * @return the most frequent crime type of the given region
	 */
	public String calculateMostFrequentCrimeOfEachRegionPerLeague(ArrayList<Crime> crimeArray, String region, String league) {
		HashMap<String, Integer> thisQuestionCount = TotalCrimeCount(crimeArray); //create a HashMap to store crime count
		ArrayList<LocalDate> leagueGameDate = getLeagueGameDate(league);
		
		for(Crime crime: crimeArray) {
			String crimeType = crime.getCrimeCode();
			if(crime.getCrimeCode().equalsIgnoreCase(crimeType) && crime.getDistrict().equals(region) && leagueGameDate.contains(crime.getDate())) { //count the number of crime based of region
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
	public HashMap<String, String> getMostFrequentCrimeOfEachRegionReport(ArrayList<Crime> crimeArray, String league){ //create a HashMap to store region and associated crime type
		HashMap<String, String> crimeRegionReport = new HashMap<String, String>();
		Set<String> districtArray = crimeArray.stream().map(v -> v.getDistrict()).collect(Collectors.toSet()); // create a set of regions to traverse
		for(String region: districtArray) {
			String crimeRegion = calculateMostFrequentCrimeOfEachRegionPerLeague(crimeArray, region, league);
			crimeRegionReport.put(region, crimeRegion);//update the HashMap with region and associated most frequent crime type
		}
		HashMap<String, String> labelledCrimeReport = addCrimeTypeLabel(crimeRegionReport);
		return labelledCrimeReport;
	}

}
