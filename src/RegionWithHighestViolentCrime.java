import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RegionWithHighestViolentCrime {
    ArrayList<Crime> crime = new ArrayList<Crime>();
	
	public RegionWithHighestViolentCrime(ArrayList<Crime> crime) {
			this.crime = crime;
	}
		
		/**
		 * @author Tian Xue
		 * @param crimeData
		 * @return The region with highest violent crime throughout the years
		 */
	public String calMosFreCri(ArrayList<Crime> crimeData) {
		HashMap<String, Integer> totalCrimeCount = new HashMap<>();
		HashMap<String, Integer> totalVioCount = new HashMap<>();
		HashMap<String, Boolean> regionSet = new HashMap<>();

			
		for(Crime crime: crimeData) {
			regionSet.put(crime.getDistrict(),true);
			totalCrimeCount.put(crime.getDistrict(),0);
			totalVioCount.put(crime.getDistrict(),0);
		}
		
		for(Crime crime: crimeData) {
			String region = crime.getDistrict();
			if(crime.getDistrict().equalsIgnoreCase(region)) {
				int temp = totalCrimeCount.get(region) + 1;
				totalCrimeCount.put(region,temp); //count the total number of crime for each region
			}
			
			if(crime.getDistrict().equalsIgnoreCase(region) && crime.getGeneralCode().contains("firearm") ) {
				int temp2 = totalCrimeCount.get(region) + 1;
				totalVioCount.put(region,temp2); //count the total number of violent crime (firearm related) for each region
			}
			
			else if(crime.getDistrict().equalsIgnoreCase(region) && crime.getGeneralCode().contains("assault")) {
				int temp2 = totalCrimeCount.get(region) + 1;
				totalVioCount.put(region,temp2); //count the total number of violent crime (assault related) for each region
			}
			
			else if(crime.getDistrict().equalsIgnoreCase(region) && crime.getGeneralCode().contains("offense")) {
				int temp2 = totalCrimeCount.get(region) + 1;
				totalVioCount.put(region,temp2); //count the total number of violent crime (offense related) for each region
			}
			
		}
		
		HashMap<String, Double> vioRate = new HashMap<>();
		for (String region: regionSet.keySet()) {
			vioRate.put(region, (double)totalVioCount.get(region)/(double)totalCrimeCount.get(region)); //calculate the violent crime rate for each region
		}
		
		ArrayList<Double> sorted = new ArrayList<>(); // create an arrayList to store all the values;
		for(String region: regionSet.keySet()) {
			sorted.add(vioRate.get(region)); //loop all the values and add to the arrayList
		}
		
		double valueMax = Collections.max(sorted);//find the max value of crime type
		String Region = "";
		for(Map.Entry<String, Integer> entry: totalCrimeCount.entrySet()) {
			if(valueMax == entry.getValue()) {
				Region = entry.getKey(); //find the crime type
			}
		}
		return Region;
	}

}
