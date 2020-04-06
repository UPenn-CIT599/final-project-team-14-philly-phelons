import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentCrimeOfNBASeason {
	ArrayList<Crime> crime = new ArrayList<Crime>();
	
	public MostFrequentCrimeOfNBASeason(ArrayList<Crime> crime) {
			this.crime = crime;
	}
	
	/**
	 * @author Tian Xue
	 * @param crimeData
	 * @return most frequent crime type of a NBA season for a particular year
	 */
	public String calMosFreCri(ArrayList<Crime> crimeData, String year) {
		Season newSeason = new Season();
		HashMap<String, Integer> totalCrimeCount = new HashMap<>();
		HashMap<String, Boolean> crimeTypeSet = new HashMap<>();
		
		for(Crime crime: crimeData) {
			crimeTypeSet.put(crime.getGeneralCode(),true);
			totalCrimeCount.put(crime.getGeneralCode(),0);
		}
		
		for(Crime crime: crimeData) {
			String crimeType = crime.getGeneralCode();
			String month = crime.getMonth().substring(5, 6);
			if(crime.getGeneralCode().equalsIgnoreCase(crimeType) && crime.getMonth().contains(year) && newSeason.getNbaSeason().contains(month)) {
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
	
	public HashMap<String, String> getMosFreCriOfNBASeason(ArrayList<Crime> crimeData){ //loop through each year to return a hashMap of year and most frequent crime
		HashMap<String, String> mosFreCriOfNBASeason = new HashMap<String, String>();
		
		for (Crime crime: crimeData) {
			String crimeYear = crime.getMonth().substring(0, 3);
			if(crime.getMonth().substring(0, 3).equals(crimeYear))
				mosFreCriOfNBASeason.put(crimeYear, calMosFreCri(crimeData, crimeYear));
		}
		return mosFreCriOfNBASeason;
	}

}
