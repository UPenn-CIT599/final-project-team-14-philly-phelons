
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 * PieChart Class builds the PieChart
 * @author claudiaromano
 *
 */
public class PieChart extends JFrame {

	private static final long serialVersionUID = -8986772773938935787L;
	private static HashMap<String, Double> pieChartLabels = new HashMap<String, Double>();
	private static String pieChartTitle = "";

	public PieChart(String title) {
		super(title);
		setContentPane(createChartPanel());
	}

	/**
	 * Getters and Setters
	 * @return
	 */
	
	public static HashMap<String, Double> getPieChartLabels() {
		return pieChartLabels;
	}

	public void setPieChartLabels(HashMap<String, Double> pieChartLabels) {
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

		for (Map.Entry<String, Double> keyLabel : pieChartLabels.entrySet()) {
			String key = keyLabel.getKey();
			Double number = keyLabel.getValue();
			dataset.setValue(key, number);
		}
		return dataset;
	}

	/**
	 * Will create the chart
	 * @param dataset
	 * @return
	 */
	private static JFreeChart createChart(PieDataset dataset) {
		JFreeChart chart = ChartFactory.createPieChart(pieChartTitle, // title
				dataset, // data
				true, // include legend
				true, false);

		return chart;
	}

	/**
	 * Will create the JPanel to add to the JFrame
	 * @return
	 */
	public JPanel createChartPanel() {
		JFreeChart chart = createChart(createDataset());
		return new ChartPanel(chart);
	}

	/**
	 * JFreeChart needs main()
	 * @param args
	 */
	public static void main(String[] args) {
	}
}