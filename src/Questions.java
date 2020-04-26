import java.io.IOException;
import java.time.LocalDate;
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
	 * Count the total number of crime by region
	 * @param crimeArray
	 * @return a HashMap of each region and associated crime count
	 */
	public HashMap<String, Integer> TotalCrimeCountByDistrict(ArrayList<Crime> crimeArray){
		HashMap<String, Integer> totalCrimeCountByDisctrict = new HashMap<>();
		for(Crime crime : crimeArray) {
			totalCrimeCountByDisctrict.put(crime.getDistrict(),0);
		}
		return totalCrimeCountByDisctrict; 
	}

	/**
	 * Count number of types of different crimes
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

	/**
	 * Count number of regions
	 * @param crimeArray
	 * @return total number of different regions
	 */
	
	public HashMap<String, Boolean> regionSet(ArrayList<Crime> crimeArray) {
		HashMap<String, Boolean> regionSet = new HashMap<>();
		for (Crime crime : crimeArray) {
			regionSet.put(crime.getDistrict(), true);
		}
		return regionSet;
	}

	/**
	 * Sort out a HashMap and find the key with highest value of Integer type
	 * @param hm
	 * @return Key of the highest value in the HashMap
	 */
	
	public String sortedCrimeType(HashMap<String, Integer> hm) {
		ArrayList<Integer> sorted = new ArrayList<>(); // create an arrayList to store all the sorted values;
		for (String key : hm.keySet()) {
			sorted.add(hm.get(key)); 
		}
		int valueMax = Collections.max(sorted);// find the max value of crime type
		String sortedKey = "";
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			if (valueMax == entry.getValue()) {
				sortedKey = entry.getKey(); // find the crime type
			}
		}
		return sortedKey;
	}
	
	/**
	 * Sort out a HashMap and find the key with highest value of Double type
	 * @param hm
	 * @return Key of the highest value in the HashMap
	 */
	
	public String sortedCrimeRate(HashMap<String, Double> hm) {
		ArrayList<Double> sorted = new ArrayList<>(); // create an arrayList to store all the sorted values;
		for (String key : hm.keySet()) {
			sorted.add(hm.get(key)); 
		}
		double valueMax = Collections.max(sorted);// find the max value of crime type
		String sortedKey = "";
		for (Map.Entry<String, Double> entry : hm.entrySet()) {
			if (valueMax == entry.getValue()) {
				sortedKey = entry.getKey(); // find the crime type
			}
		}
		return sortedKey;
	}
	
	
	/**
	 * Calculate the ratio between the value of two HashMaps according to the same key and store the key and ratio into a new HashMap
	 * @param hm1 
	 * @param hm2
	 * @param hm3
	 * @return A HashMap of the keySet from hm3 and the value of hm2/hm1
	 */
	
	public HashMap<String, Double> CalculateRate(HashMap<String, Integer> hm1, HashMap<String, Integer> hm2, HashMap<String, Boolean> hm3){
		HashMap<String, Double> rate = new HashMap<String, Double>();
		for(String string : hm3.keySet()) {
			rate.put(string, (double)hm2.get(string)/(double)hm1.get(string));
		}
		return rate;
	}
	
	public ArrayList<LocalDate> getLeagueGameDate(String league){
		ArrayList<LocalDate> leagueGameDate = new ArrayList<LocalDate>();
		
		try {
			LeagueReader newLeague = new LeagueReader();
		
		if (league.equals("NBA")) {
			for(Games game : newLeague.getNBAArray()) {
				leagueGameDate.add(game.getGameDate());
			}
		}
		if (league.equals("MLB")) {
			for(Games game : newLeague.getMLBArray()) {
				leagueGameDate.add(game.getGameDate());
			}
		}
		if (league.equals("NFL")) {
			for(Games game : newLeague.getNFLArray()) {
				leagueGameDate.add(game.getGameDate());
			}
		}
		if (league.equals("NHL")) {
			for(Games game : LeagueReader.NHLArray) {
				leagueGameDate.add(game.getGameDate());
			}
		}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return leagueGameDate;
	}
}