import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Parent class for questions
 * 
 * @author Tian Xue
 *
 */

public abstract class Questions {
	ArrayList<Crime> crime = new ArrayList<Crime>();

	public Questions(ArrayList<Crime> crime) {
		this.crime = crime;
	}

	/**
	 * Count the total number of each crime
	 * 
	 * @param crimeArray
	 * @return total number of crime count
	 */

	public HashMap<String, Integer> TotalCrimeCount(ArrayList<Crime> crimeArray) {
		HashMap<String, Integer> totalCrimeCount = new HashMap<>();
		for (Crime crime : crimeArray) {
			totalCrimeCount.put(crime.getCrimeCode(), 0);// set the initial count to 0
		}
		return totalCrimeCount;
	}

	/**
	 * Count different types of crime
	 * 
	 * @param crimeArray
	 * @return total number of different crime type
	 */

	public HashMap<String, Boolean> crimeTypeSet(ArrayList<Crime> crimeArray) {
		HashMap<String, Boolean> crimeTypeSet = new HashMap<>();
		for (Crime crime : crimeArray) {
			crimeTypeSet.put(crime.getCrimeCode(), true); 
		}
		return crimeTypeSet;
	}

	public HashMap<String, Boolean> regionSet(ArrayList<Crime> crimeArray) {
		HashMap<String, Boolean> regionSet = new HashMap<>();
		for (Crime crime : crimeArray) {
			regionSet.put(crime.getDistrict(), true);
		}
		return regionSet;
	}

	/**
	 * Sort out the hashmap and find the key with highest value(crime count)
	 * 
	 * @param totalCrimeCount
	 * @return crime type with the highest count
	 */
	public String sortedCrimeType(HashMap<String, Integer> totalCrimeCount) {
		// create an arrayList to store all the sorted values;
		ArrayList<Integer> sorted = new ArrayList<>(); 
		
		for (String crimeType : totalCrimeCount.keySet()) {
			sorted.add(totalCrimeCount.get(crimeType)); 
		}

		int valueMax = Collections.max(sorted);// find the max value of crime type

		String crimeType = "";
		for (Map.Entry<String, Integer> entry : totalCrimeCount.entrySet()) {
			if (valueMax == entry.getValue()) {
				crimeType = entry.getKey(); // find the crime type
			}
		}
		return crimeType;
	}
}