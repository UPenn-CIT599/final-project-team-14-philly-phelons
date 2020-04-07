import java.util.ArrayList;
import java.util.HashMap;

public class MostFrequentCrimeOfNHLSeason {
	ArrayList<Crime> crime = new ArrayList<Crime>();
	
	public MostFrequentCrimeOfNHLSeason(ArrayList<Crime> crime) {
			this.crime = crime;
	}
	
	/**
	 * @author Tian Xue
	 * @param crimeData
	 * @param year
	 * @return most frequent crime type during a NHL season of a given year
	 */
	public String calMosFreCri(ArrayList<Crime> crimeData, String year) {
        return year;
		
	}
	
	/**
	 * Create a HashMap to store a NHL season year and the most frequent crime type
	 * @param crimeData
	 * @return a HashMap storing each NHL season year and their respective most frequent crime type
	 */
	public HashMap<String, String> getMosFreCriOfNBASeason(ArrayList<Crime> crimeData){
        return null; 
		
	}

}
