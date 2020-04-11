import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
		add(createRadioBoxGroup(), BorderLayout.WEST);
		add(createButtonGroup(), BorderLayout.CENTER);
	}
	
	
	private JPanel createTopPanel() {
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("View Crime Statistics");
		topPanel.add(label);
		return topPanel;
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
		panel.setLayout(new GridLayout(3, 2));
		panel.add(option1);
		panel.add(option2);
		panel.add(option3);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Teams"));

		return panel;
	}
	
	private JPanel createButtonGroup() {
		//create buttons
		JButton btn1 = createButton("Get Most Frequent Crime");
		JButton btn2 = createButton("Get Region with Highest Crime");
		JButton btn3 = createButton("Get Game Wins and Crime Rates");
		JButton btn4 = createButton("Get Game Losses and Crime Rates");
		JButton btn5 = createButton("Get Sport with Highest Crime Rates");
		JButton btn6 = createButton("Get Opponent with Highest Crime Rates");

		//group buttons
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(btn1);
		buttonGroup.add(btn2);
		buttonGroup.add(btn3);
		buttonGroup.add(btn4);
		buttonGroup.add(btn5);
		buttonGroup.add(btn6);
		
		//create panel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 3));
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		
		return panel;
		
	}

	private JButton createButton(String buttonName) {
		ButtonListener listen = new ButtonListener();
		JButton newButton = new JButton(buttonName);
		newButton.addActionListener(listen);
		
		return newButton;
	}
}
