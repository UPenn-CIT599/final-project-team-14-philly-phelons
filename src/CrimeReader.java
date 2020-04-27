

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 
 * @author Robby Ballard
 * 
 * Class to read "Crime.csv" file and input data into 2 usable ArrayLists.
 * ViolentCrimeArray includes only crimes deemed "violent" (See Crime class for specific code enumeration).
 * General Social Disturbances, non-violent in nature, are included in the genDisturbanceArray.
 * @author Robby Ballard CrimeReader collaborates with  reads csv and stores
 *         crime data in ArrayList of Crime objects
 *
 */
public class CrimeReader {
	
	public static ArrayList<Crime> allCrimeArray = new ArrayList<Crime>();
	public static ArrayList<Crime> violentCrimeArray = new ArrayList<Crime>();
	public static ArrayList<Crime> genDisturbanceArray = new ArrayList<Crime>();

	public CrimeReader() throws FileNotFoundException {
		allCrimeArray = makeAllCrimeArray();
		makePublicCrimeArrays(allCrimeArray);
	}

	

	public static ArrayList<Crime> getAllCrimeArray() {
		return allCrimeArray;
	}


	public static ArrayList<Crime> getViolentCrimeArray() {
		return violentCrimeArray;
	}


	public static ArrayList<Crime> getGenDisturbanceArray() {
		return genDisturbanceArray;
	}
	
	public static ArrayList<Crime> getCrimeArrayWithoutCode800(){
	        return crimeArrayWithoutCode800;
	}




	/**
	 * makeAllCrimeArray will read csv and return an Array of Crimes
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	private ArrayList<Crime> makeAllCrimeArray() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("Crime.csv");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		ArrayList<Crime> crimeArray = new ArrayList<Crime>();
		String dataLine;

		try {
			br.readLine();
			while ((dataLine = br.readLine()) != null) {
				String[] dataLineSplit = dataLine.split(",");
				String district = dataLineSplit[0];
				String date = dataLineSplit[1];
				String crimeCode = dataLineSplit[2];

				Crime crime = new Crime(district, date, crimeCode);

				crimeArray.add(crime);
			}
			br.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return crimeArray;

	}

	/**
	 * Will filter out violent and disturbance only codes and populate
	 * ViolentCrimeArray and genDisturbanceArray
	 * 
	 * @param crimeArray
	 */
	public void makePublicCrimeArrays(ArrayList<Crime> crimeArray) {
		for (Crime crime : crimeArray) {
			// Filters Crime objects for those containing Violent Codes
			if (crime.getCrimeCode().equals("100") || crime.getCrimeCode().equals("200")
					|| crime.getCrimeCode().equals("300") || crime.getCrimeCode().equals("400")
					|| crime.getCrimeCode().equals("800") || crime.getCrimeCode().equals("900")
					|| crime.getCrimeCode().equals("1500")) {
				violentCrimeArray.add(crime);
			}
			// Filters crimes for those containing general disturbance codes
			else if (crime.getCrimeCode().equals("1400") || crime.getCrimeCode().equals("2100")
					|| crime.getCrimeCode().equals("2300") || crime.getCrimeCode().equals("2400")) {
				genDisturbanceArray.add(crime);
			}

		}

	}
}
