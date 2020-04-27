import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/**
 * App class builds the GUI using Swing Components
 * 
 * @author Claudia Peinado Romano
 *
 */
public class App extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// window dimensions
	private static final int FRAME_WIDTH = 700;
	private static final int FRAME_HEIGHT = 600;

	// labels where answers will go
	private JLabel resultLabel = new JLabel(" ");
	private JLabel radioLabel = new JLabel(" ");
	private JLabel comboBoxLabel = new JLabel(" ");

	@SuppressWarnings("rawtypes")
	private JComboBox crimeStatList;

	// radio buttons
	JRadioButton optionMLB = new JRadioButton("MLB");
	JRadioButton optionNBA = new JRadioButton("NBA");
	JRadioButton optionNFL = new JRadioButton("NFL");
	JRadioButton optionNHL = new JRadioButton("NHL");

	// constructor builds the window
	public App() {

		this.setTitle("Philly Phelon Search");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		add(createTopPanel(), BorderLayout.NORTH);
		add(createCenterPanel(), BorderLayout.CENTER);
	}

	// top panel with title
	private JPanel createTopPanel() {
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("View Crime Statistics");
		topPanel.add(label);
		return topPanel;
	}

	/**
	 * createCenterPanel will build a panel with Radio Options, Combo Box, Submit
	 * Button and Labels for answers layout will place this in the center of the
	 * window
	 * 
	 * @return JPanel
	 */

	private JPanel createCenterPanel() {
		JPanel centerPanel = new JPanel();

		centerPanel.add(createRadioBoxGroup());
		centerPanel.add(createComboBox());
		centerPanel.add(createButtonGroup());
		centerPanel.add(resultLabel);
		centerPanel.add(radioLabel);
		centerPanel.add(comboBoxLabel);

		return centerPanel;
	}

	/**
	 * will create a panel with radio options
	 * 
	 * @return JPanel
	 */
	private JPanel createRadioBoxGroup() {

		// group buttons
		ButtonGroup group = new ButtonGroup();
		group.add(optionMLB);
		group.add(optionNBA);
		group.add(optionNFL);
		group.add(optionNHL);

		// add radio buttons to a panel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1));
		panel.add(optionMLB);
		panel.add(optionNBA);
		panel.add(optionNFL);
		panel.add(optionNHL);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Leagues"));

		return panel;
	}

	/**
	 * createComboBox will create panel with a combo select box
	 * 
	 * @return JPanel
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private JPanel createComboBox() {
		String[] crimeStatOptions = { "Most Frequent Crime", "Regions with Highest Crimes" };
		
//		Removed 		
//		"Game Wins and Crime Rates", "Game Losses and Crime Rates", "Sport with Highest Crime Rate", "Opponent with Highest Crime Rate"

		crimeStatList = new JComboBox(crimeStatOptions);
		crimeStatList.setSelectedIndex(0);
		crimeStatList.addActionListener(crimeStatList);

		// create Panel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1));
		panel.add(crimeStatList);

		return panel;

	}

	/**
	 * createButtonGroup will create a Panel with a submit button
	 * 
	 * @return JPanel
	 */

	private JPanel createButtonGroup() {
		JButton getButton = createButton("Get Stat");

		// group buttons
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(getButton);

		// create panel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1));
		panel.add(getButton);

		return panel;
	}

	/**
	 * createButton will build a button and add an action listener for it
	 * 
	 * @param buttonName
	 * @return JButton
	 */
	private JButton createButton(String buttonName) {
		ButtonListener listen = new ButtonListener();
		JButton newButton = new JButton(buttonName);
		newButton.addActionListener(listen);

		return newButton;
	}

	/**
	 * ButtonListener is the action listener for the button
	 */
	class ButtonListener implements ActionListener {

		/**
		 * getRadioSelected will read which radio option user selected
		 * 
		 * @return String optionSelected
		 */
		private String getRadioSelected() {
			String optionSelected = null;
			if (optionMLB.isSelected()) {
				optionSelected = "MLB";
			} else if (optionNBA.isSelected()) {
				optionSelected = "NBA";
			} else if (optionNFL.isSelected()) {
				optionSelected = "NFL";
			} else if (optionNHL.isSelected()) {
				optionSelected = "NHL";
			}
			return optionSelected;
		}

		/**
		 * actionPerformed will be called by the listener when the button is clicked it
		 * will read the options selected by the user and respond with answers requested
		 * by user
		 */
		public void actionPerformed(ActionEvent e) {
			String comboBoxString = (String) crimeStatList.getSelectedItem();
			String radioSelectedString = getRadioSelected();

			AppQuery.setComboBox(comboBoxString);
			AppQuery.setRadioBox(radioSelectedString);

			resultLabel.setText(AppQuery.queryAnswer());

			add(AppQuery.getChart("chart title goes here"), BorderLayout.SOUTH);
		}
	}
}
