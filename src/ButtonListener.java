import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 */

/**
 * @author claudiaromano
 *
 */
public class ButtonListener implements ActionListener {
	private String answer;

	private String getAnswer(String question) {
		String answer = "answer for the " + question + "goes here";
		return answer;
	}

	public void actionPerformed(ActionEvent e) {
		answer = getAnswer("team question");
		
	}
}
