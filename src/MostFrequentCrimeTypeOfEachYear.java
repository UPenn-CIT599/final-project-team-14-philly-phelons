import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentCrimeTypeOfEachYear {
    ArrayList<Crime> crime = new ArrayList<Crime>();
	
	public MostFrequentCrimeTypeOfEachYear(ArrayList<Crime> crime) {
		this.crime = crime;
	}
	

	/**
	 * @author Tian Xue
	 * @param dataInfo
	 * @return The most frequent crime type happened in Philly in each year.
	 */
	public String calMosFreCri(ArrayList<Crime> crimeData, String year) {
		HashMap<String, Integer> totalCrimeCount = new HashMap<>();
		HashMap<String, Boolean> crimeTypeSet = new HashMap<>();
		
		for(Crime crime: crimeData) {
			crimeTypeSet.put(crime.getGeneralCode(),true);
			totalCrimeCount.put(crime.getGeneralCode(),0);
		}
		
		for(Crime crime: crimeData) {
			String crimeType = crime.getGeneralCode();
			if(crime.getGeneralCode().equalsIgnoreCase(crimeType) && crime.getDispatchDate().contains(year)) {
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
	
	//create a HashMap to store year and most frequent crime type of each year
	public HashMap<String, String> getMosFreCriOfEaYr(ArrayList<Crime> crimeData){ //loop through each year to return a hashMap of year and most frequent crime
		HashMap<String, String> mosFreCriOfEaYr = new HashMap<String, String>();
		
		for (Crime crime: crimeData) {
			String crimeYear = crime.getMonth().substring(0, 3);
			if(crime.getMonth().substring(0, 3).equals(crimeYear))
			mosFreCriOfEaYr.put(crimeYear, calMosFreCri(crimeData, crimeYear));
		}
		return mosFreCriOfEaYr;
	}
	
}
