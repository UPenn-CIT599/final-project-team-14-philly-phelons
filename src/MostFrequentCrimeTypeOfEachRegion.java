import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentCrimeTypeOfEachRegion {
	 ArrayList<Crime> crime = new ArrayList<Crime>();
		
		public MostFrequentCrimeTypeOfEachRegion(ArrayList<Crime> crime) {
			this.crime = crime;
		}
		
		/**
		 * @author Tian Xue
		 * @param dataInfo
		 * @return The most frequent crime type in each region of Philly.
		 */
		public String calMosFreCri(ArrayList<Crime> crimeData, String region) {
			HashMap<String, Integer> totalCrimeCount = new HashMap<>();
			HashMap<String, Boolean> crimeTypeSet = new HashMap<>();
			
			for(Crime crime: crimeData) {
				crimeTypeSet.put(crime.getGeneralCode(),true);
				totalCrimeCount.put(crime.getGeneralCode(),0);
			}
			
			for(Crime crime: crimeData) {
				String crimeType = crime.getGeneralCode();
				if(crime.getGeneralCode().equalsIgnoreCase(crimeType) && crime.getDistrict().contains(region)) {
					int temp = totalCrimeCount.get(crimeType) + 1;
					totalCrimeCount.put(crimeType,temp); //count the total number of each crime type
				}
			}
			
			ArrayList<Integer> sorted = new ArrayList<>(); // create an arrayList to store all the values;
			for(String crimeType: totalCrimeCount.keySet()) {
				sorted.add(totalCrimeCount.get(crimeType)); //loop all the values and add to the arrayList
			}
			
			int valueMax = Collections.max(sorted);//find the max value of crime type
			String crimeType = "";
			for(Map.Entry<String, Integer> entry: totalCrimeCount.entrySet()) {
				if(valueMax == entry.getValue()) {
					crimeType = entry.getKey(); //find the crime type
				}
			}
			return crimeType;
		}
		
		//Create a HashMap to store region and most frequent crime type
		public HashMap<String, String> getMosFreCriOfEaRe(ArrayList<Crime> crimeData){ //loop through each year to return a hashMap of year and most frequent crime
			HashMap<String, String> mosFreCriOfEaRe = new HashMap<String, String>();

			for (Crime crime: crimeData) {
				String region = crime.getDistrict();
				if(crime.getDistrict().equals(region))
				mosFreCriOfEaRe.put(region, calMosFreCri(crimeData, region));
			}
			return mosFreCriOfEaRe;
		}
}
