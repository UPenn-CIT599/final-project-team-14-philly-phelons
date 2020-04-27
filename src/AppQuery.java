import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

/**
 * AppQuery will conduct the query and call the right classes/methods
 * @author claudiaromano
 *
 */

public class AppQuery {

	private static String comboBox;
	private static String radioBox;

	/**
	 * queryAnswer() will run the appropriate search 
	 * @return String of answers
	 */
	
	public static String queryAnswer() {

		CrimeReader reader;
		String resultString = radioBox;
		try {
			reader = new CrimeReader();
			ArrayList<Crime> crimeArray = reader.getAllCrimeArray();

			if (comboBox.equals("Most Frequent Crime")) {
				resultString = getMostFrequentCrime(crimeArray);
			} else if (comboBox.equals("Region with Highest Crime")) {

			} else if (comboBox.equals("Game Wins and Crime Rates")) {

			} else if (comboBox.equals("Game Losses and Crime Rates")) {

			} else if (comboBox.equals("Sport with Highest Crime Rate")) {

			} else if (comboBox.equals("Opponent with Highest Crime Rate")) {

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultString;
	}

	/**
	 * getMostFrequentCrime will search for the most frequent crime in the league as identified by the user
	 * @param crimeArray
	 * @return String result
	 */
	private static String getMostFrequentCrime(ArrayList<Crime> crimeArray) {
		String resultString = "";
		MostFrequentCrimeOfLeagueEachYear thisQuestion = new MostFrequentCrimeOfLeagueEachYear(crimeArray);
		HashMap<String, String> thisAnswer = thisQuestion.getMostFrequentCrimeOfLeagueEachYearOf2007To2011(crimeArray,
				radioBox);

		for (Map.Entry<String, String> keyAnswer : thisAnswer.entrySet()) {
			String key = keyAnswer.getKey();
			String value = keyAnswer.getValue();
			resultString = resultString + " " + key + " " + value;
		}
		return resultString;
	}
	/**
	 * getChart will create the panel and the chart based on what the user requests
	 * @param pieChartTitle
	 * @return
	 */
	
	public static JPanel getChart(String pieChartTitle) {
		PieChart pieChartResult = new PieChart(pieChartTitle);
		HashMap<String, Integer> pieChartLabels = new HashMap<String, Integer>();
		pieChartLabels.put("one", 20);
		pieChartLabels.put("two", 30);
		pieChartLabels.put("three", 50);
		pieChartResult.setPieChartLabels(pieChartLabels);
		JPanel chartPanel = pieChartResult.createChartPanel();
		return chartPanel;
	}

	/**
	 * Getters and Setters
	 * @return
	 */
	
	public static String getComboBox() {
		return comboBox;
	}

	public static void setComboBox(String comboBoxOption) {
		comboBox = comboBoxOption;
	}

	public static String getRadioBox() {
		return radioBox;
	}

	public static void setRadioBox(String radioBoxOption) {
		radioBox = radioBoxOption;
	}

}
