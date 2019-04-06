import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackaMole implements ActionListener {
	static Random random = new Random();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	int clicks = 0;
	int hits  = 0;
	
	Date timeAtStart = new Date();
public static void main(String[] args) {
	WhackaMole whackamole = new WhackaMole();
	whackamole.drawButtons(random.nextInt(15));
	
	
}
void drawButtons(int a){
	frame.setVisible(true);
	frame.add(panel);
	frame.setPreferredSize(new Dimension(300,300));
	for (int i = 0; i <15; i++) {
		JButton button = new JButton();
		panel.add(button);
		if (i == a) {
				button.setText("mole!");
		}
		button.addActionListener(this);
		frame.pack();
	}
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton pressed = (JButton) e.getSource();
	String text = pressed.getText();
	clicks = clicks+1;
	if(text.equals("mole!")) {
		hits = hits+1;
		
	}
	else {
		
		
	}
	frame.remove(panel);
	panel = new JPanel();
	drawButtons(random.nextInt(15));
	if(clicks ==  10) {
		endGame(timeAtStart, hits);
		int total = clicks-hits;
		JOptionPane.showMessageDialog(null, "You missed the mole "+ total + " times");
	}
	if(clicks-hits ==  5) {
		endGame(timeAtStart, hits);
		int total = clicks-hits;
		JOptionPane.showMessageDialog(null, "You missed the mole "+ total + " times");
	}
	
}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
   
}
private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}

}

