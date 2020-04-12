import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
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

public class App extends JFrame {

	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 400;
	
	public App() {

		this.setTitle("Philly Phelon Search");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		add(createTopPanel(), BorderLayout.NORTH);
		add(createCenterPanel(), BorderLayout.CENTER);
	}
	
	
	private JPanel createTopPanel() {
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("View Crime Statistics");
		topPanel.add(label);
		return topPanel;
	}

	private JPanel createCenterPanel() {
		JPanel centerPanel = new JPanel();
		
		centerPanel.add(createRadioBoxGroup());
		centerPanel.add(createComboBox());
		centerPanel.add(createButtonGroup());
		
		return centerPanel;
	}
	
	private JPanel createRadioBoxGroup() {
		// radio buttons
		JRadioButton option1 = new JRadioButton("Option 1");
		JRadioButton option2 = new JRadioButton("Option 2");
		JRadioButton option3 = new JRadioButton("Option 3");

		// group buttons
		ButtonGroup group = new ButtonGroup();
		group.add(option1);
		group.add(option2);
		group.add(option3);

		// add radio buttons to a panel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1));
		panel.add(option1);
		panel.add(option2);
		panel.add(option3);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Teams"));

		return panel;
	}
	
	private JPanel createComboBox() {
		
		//create Combo Box
		String[] crimeStatOptions = {"Most Frequent Crime", "Region with Highest Crime", "Game Wins and Crime Rates", "Game Losses and Crime Rates", "Sport with Highest Crime Rate", "Opponent with Highest Crime Rate"};
	
		JComboBox crimeStatList = new JComboBox(crimeStatOptions);
		crimeStatList.setSelectedIndex(0);
		crimeStatList.addActionListener(crimeStatList);		
		
		//create Panel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1,1));
		panel.add(crimeStatList);
		
		return panel;
		
	}
	
	private JPanel createButtonGroup() {
		//create buttons
		JButton getButton = createButton("Get Stat");

		//group buttons
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(getButton);
		
		//create panel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 1));
		panel.add(getButton);
		
		return panel;
		
	}

	private JButton createButton(String buttonName) {
		ButtonListener listen = new ButtonListener();
		JButton newButton = new JButton(buttonName);
		newButton.addActionListener(listen);
		
		return newButton;
	}
}
