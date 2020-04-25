
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
	
	
}
