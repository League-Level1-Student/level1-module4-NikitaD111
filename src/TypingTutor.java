import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;
	 JLabel label = new JLabel();
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
public static void main(String[] args) {
	new TypingTutor().setup();
	
}
void setup() {
	frame.setVisible(true);
	frame.setTitle("Type or Die");
	frame.add(panel);
	panel.add(label);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	currentLetter = generateRandomLetter();
	label.setText(currentLetter + "");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
	frame.setSize(199, 100);
	
}
 char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');

}

public void keyTyped(KeyEvent e) {


}

public void keyPressed(KeyEvent e) {
	System.out.println(e.getKeyChar());
	if(e.getKeyChar() == (currentLetter)){
		System.out.println("correct");
		panel.setBackground(new Color(0,255,0));
		
	}
	else {
		System.out.println("wrong");
		panel.setBackground(Color.RED);
	}
}

public void keyReleased(KeyEvent e) {
	currentLetter = generateRandomLetter();
	label.setText(currentLetter + "");
	
}

}

