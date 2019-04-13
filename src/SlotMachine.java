import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JButton button = new JButton();
	int rand = new Random().nextInt(3);
	JPanel panel = new JPanel();
	JLabel one = new JLabel();
	JLabel two = new JLabel();
	JLabel three = new JLabel();
public static void main(String[] args) {
	SlotMachine slot = new SlotMachine();
	slot.Start();
	
}
void Start() {
	JFrame frame = new JFrame();
	
	frame.setVisible(true);
	frame.add(panel);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	panel.add(one);
	panel.add(two);
	panel.add(three);
	panel.add(button);
	button.setText("SPIN!");
	drawButtons();
	button.addActionListener(this);
	frame.pack();
	
}
private JLabel createLabelImage(String fileName) throws MalformedURLException{
    URL imageURL = getClass().getResource(fileName);
if (imageURL == null){
	System.err.println("Could not find image " + fileName);
	return new JLabel();
}
Icon icon = new ImageIcon(imageURL);
JLabel imageLabel = new JLabel(icon);
return imageLabel;
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton pressed = (JButton) e.getSource();
	if (button == pressed ) {
		
	}
	
}
void drawButtons() {
	try {
		panel.add(createLabelImage("lime.jpeg"));
		panel.add(createLabelImage("download.jpeg"));
		panel.add(createLabelImage("LidoxjjET.jpg"));
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(rand);
	}
}
}
