import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
	char currentLetter;
	 
public static void main(String[] args) {
	new TypingTutor().generateRandomLetter();
	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
	frame.setVisible(true);
	frame.setTitle("Type or Die");
	frame.add(panel);
	panel.add(label);


}
 char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');

}

}

