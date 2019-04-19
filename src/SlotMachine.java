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
	String image1 = "lime.jpeg";
	String image2 = "download.jpeg";
	String image3 = "LidoxjjET.jpg";
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
	/*panel.add(one);
	panel.add(two);
	panel.add(three);*/
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
	System.out.println("hi");
	JButton pressed = (JButton) e.getSource();
	if (button == pressed ) {
		SlotMachine slot = new SlotMachine();
		slot.drawButtons();
	}
	
}
	
void drawButtons() {
	

	
	for(int i = 0; i < 3; i++) {
		int num1 = new Random().nextInt(3);
		int num2 = new Random().nextInt(3);
		int num3 = new Random().nextInt(3);
		if(num1 == 0) {
		image1 = "download.jpeg";
		}
		if(num2 == 1) {
		image2 = "download.jpeg";
		}
		if(num3 == 2) {
		image3 = "download.jpeg";
		}
		
	}
	try {
		panel.add(createLabelImage(image1));
		panel.add(createLabelImage(image2));
		panel.add(createLabelImage(image3));
	} catch (MalformedURLException e) {
		e.printStackTrace();
		
	}
}
}
