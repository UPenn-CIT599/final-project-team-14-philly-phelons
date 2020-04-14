import java.io.*;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * 
 * @author Robby Ballard
 * 
 *         This class reads the crime.csv file and returns Crime objects using
 *         the OpenCsv library.
 * 
 *         collaborates with Crime class
 *
 */
public class CrimeReader {

	/**
	 * readCrimes will read data and make an array list of Crime objects
	 * 
	 * @param request1
	 * @param request2
	 * @param methodName1 getters from Crime class
	 * @param methodName2 getters from Crime class
	 * @return ArrayList<Crime> objects
	 */

	public ArrayList<Crime> readCrimes(String request1, String request2, String methodName1, String methodName2) {
		ArrayList<Crime> crimeArray = new ArrayList<>();
		try {

			FileInputStream fis = new FileInputStream("crime.gz.gz");
			GZIPInputStream gis = new GZIPInputStream(fis);
			InputStreamReader isr = new InputStreamReader(gis);
			BufferedReader br = new BufferedReader(isr);
			CSVReader reader = new CSVReader(br);

			CsvToBean<Crime> csvToBean = new CsvToBeanBuilder<Crime>(reader).withType(Crime.class)
					.withIgnoreLeadingWhiteSpace(true).build(); // Converts rows of csv data to JavaBeans

			for (Crime crime : (Iterable<Crime>) csvToBean) {
				if (crime.getMethodName(methodName1).equals(request1)
						&& crime.getMethodName(methodName2).equals(request2)) {
					
					// fills ArrayList with Crime objects that match the search criteria
					crimeArray.add(crime);
				}
			}

			reader.close();

		} catch (IOException e) {
			e.printStackTrace();

		} catch (Exception e) {
			System.err.println("Invoke() failed: " + e);
		}
		return crimeArray;

	}

}
