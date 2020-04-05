import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentCrimeTypeOf2019 {
	ArrayList<Crime> crime = new ArrayList<Crime>();
	
	public MostFrequentCrimeTypeOf2019(ArrayList<Crime> crime) {
		this.crime = crime;
	}
	
	/**
	 * @author Tian Xue
	 * @param dataInfo
	 * @return The most frequent crime type happened in Philly in Year 2019.
	 */
	public String calMosFreCri(ArrayList<Crime> crimeData) {
		HashMap<String, Integer> totalCrimeCount = new HashMap<>();
		HashMap<String, Boolean> crimeTypeSet = new HashMap<>();
		
		for(Crime crime: crimeData) {
			crimeTypeSet.put(crime.getGeneralCode(),true);
			totalCrimeCount.put(crime.getGeneralCode(),0);
		}
		
		for(Crime crime: crimeData) {
			String crimeType = crime.getGeneralCode();
			if(crime.getGeneralCode().equalsIgnoreCase(crimeType) && crime.getDispatchDate().contains("2019")) {
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

}
