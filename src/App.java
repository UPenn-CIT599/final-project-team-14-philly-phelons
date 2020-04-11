import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class App extends JFrame {

	public App() {
		this.setPreferredSize(new Dimension(600, 400));
		this.setTitle("Philly Phelon Search");

		add(createTopPanel(), BorderLayout.NORTH);
		add(createRadioBoxGroup(), BorderLayout.CENTER);
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
		panel.setLayout(new GridLayout(3, 1));
		panel.add(option1);
		panel.add(option2);
		panel.add(option3);
		panel.setBorder(new TitledBorder(new EtchedBorder(), "Select a Team"));

		return panel;
	}

}
