import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RegionWithHighestBulRate {
	ArrayList<Crime> crime = new ArrayList<Crime>();
	
	public RegionWithHighestBulRate(ArrayList<Crime> crime) {
			this.crime = crime;
	}
		
		/**
		 * @author Tian Xue
		 * @param crimeData
		 * @return The region with highest Burglary Residential crime throughout the years
		 */
	public String calHighBurCri(ArrayList<Crime> crimeData) {
		HashMap<String, Integer> totalCrimeCount = new HashMap<>();
		HashMap<String, Integer> totalBurCount = new HashMap<>();
		HashMap<String, Boolean> regionSet = new HashMap<>();

			
		for(Crime crime: crimeData) {
			regionSet.put(crime.getDistrict(),true);
			totalCrimeCount.put(crime.getDistrict(),0);
			totalBurCount.put(crime.getDistrict(),0);
		}
		
		for(Crime crime: crimeData) {
			String region = crime.getDistrict();
			if(crime.getDistrict().equalsIgnoreCase(region)) {
				int temp = totalCrimeCount.get(region) + 1;
				totalCrimeCount.put(region,temp); //count the total number of crime for each region
			}
			
			if(crime.getDistrict().equalsIgnoreCase(region) && crime.getGeneralCode().contains("Burglary Residential")) {
				int temp2 = totalCrimeCount.get(region) + 1;
				totalBurCount.put(region,temp2); //count the total number of Burglary Residential for each region
			}
		}
		
		HashMap<String, Double> burRate = new HashMap<>();
		for (String region: regionSet.keySet()) {
			burRate.put(region, (double)totalBurCount.get(region)/(double)totalCrimeCount.get(region)); //calculate the residential burglary rate for each region
		}
		
		ArrayList<Double> sorted = new ArrayList<>(); // create an arrayList to store all the values;
		for(String region: regionSet.keySet()) {
			sorted.add(burRate.get(region)); //loop all the values and add to the arrayList
		}
		
		double valueMax = Collections.max(sorted);//find the max value of crime type
		String region = "";
		for(Map.Entry<String, Integer> entry: totalCrimeCount.entrySet()) {
			if(valueMax == entry.getValue()) {
				region = entry.getKey(); //find the crime type
			}
		}
		return region;
	}
}
