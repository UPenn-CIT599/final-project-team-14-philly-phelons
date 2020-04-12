import javax.swing.JFrame;

/**
 * AppViewer will run the program
 * 
 * @author Claudia Peinado Romano
 *
 */
public class AppViewer {

	public static void main(String[] args) {
		JFrame crimeApp = new App();
		crimeApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		crimeApp.setVisible(true);
	}

}
