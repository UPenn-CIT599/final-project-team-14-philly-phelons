import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class PieChart extends JFrame {
	private static HashMap<String, Integer> pieChartLabels = new HashMap<String, Integer>();
	private static String pieChartTitle = "";

	public PieChart(String title) {
		super(title);
		setContentPane(createChartPanel());
	}

	public static HashMap<String, Integer> getPieChartLabels() {
		return pieChartLabels;
	}

	public static void setPieChartLabels(HashMap<String, Integer> pieChartLabels) {
		PieChart.pieChartLabels = pieChartLabels;
	}

	public static String getPieChartTitle() {
		return pieChartTitle;
	}

	public static void setPieChartTitle(String pieChartTitle) {
		PieChart.pieChartTitle = pieChartTitle;
	}

	/**
	 * Creates DataSet() to be displayed in PieChart
	 * 
	 * @return dataset
	 */

	private static PieDataset createDataset() {
		DefaultPieDataset dataset = new DefaultPieDataset();

		for (Map.Entry<String, Integer> keyLabel : pieChartLabels.entrySet()) {
			String key = keyLabel.getKey();
			Integer number = keyLabel.getValue();
			dataset.setValue(key, number);
		}
//      dataset.setValue( "IPhone 5s" ,  20 );  
//      dataset.setValue( "SamSung Grand" , 20 );   
//      dataset.setValue( "MotoG" ,  40 );    
//      dataset.setValue( "Nokia Lumia" , 10 );  
		return dataset;
	}

	private static JFreeChart createChart(PieDataset dataset) {
		JFreeChart chart = ChartFactory.createPieChart(pieChartTitle, // title
				dataset, // data
				true, // include legend
				true, false);

		return chart;
	}

	public static JPanel createChartPanel() {
		JFreeChart chart = createChart(createDataset());
		return new ChartPanel(chart);
	}
}