import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JPanel;

public class AppQuery {

	private static String comboBox;
	private static String radioBox;

	public static String queryAnswer() {
		CrimeReader reader;
		String resultString = "the result string";
		try {
			reader = new CrimeReader();
			ArrayList<Crime> crimeArray = reader.getAllCrimeArray();
			MostFrequentCrimeOfLeagueEachYear thisQuestion = new MostFrequentCrimeOfLeagueEachYear(crimeArray);
			HashMap<String, String> thisAnswer = thisQuestion
					.getMostFrequentCrimeOfLeagueEachYearOf2007To2011(crimeArray, "NFL");

			for (Map.Entry<String, String> keyAnswer : thisAnswer.entrySet()) {
				String key = keyAnswer.getKey();
				String value = keyAnswer.getValue();
				resultString = resultString + " " + key + " " + value;

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultString;
	}

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

}
