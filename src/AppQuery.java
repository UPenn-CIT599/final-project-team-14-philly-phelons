import java.util.HashMap;

import javax.swing.JPanel;

public class AppQuery {

	private static String comboBox;
	private static String radioBox;
		
	public static String queryAnswer() {
		return "the answer for " + comboBox + " and " + radioBox + "would go here";
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
