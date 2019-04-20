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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JButton button = new JButton();
	JFrame frame = new JFrame();
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
		
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		panel.add(button);
		button.setText("SPIN!");
		drawButtons();
		button.addActionListener(this);
		frame.pack();

	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
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
		if (button == pressed) {
			drawButtons();
		}

	}

	void drawButtons() {
		panel.remove(one);
		panel.remove(two);
		panel.remove(three);
			int num1 = new Random().nextInt(3);
		try {
			if (num1 == 0) {
				one = createLabelImage(image1);
			}
			if (num1 == 1) {
				one = createLabelImage(image2);
			}
			if (num1 == 2) {
				one = createLabelImage(image3);	
			}
			int num2 = new Random().nextInt(3);
			if (num2 == 0) {
				two = createLabelImage(image1);
			}
			if (num2 == 1) {
				two = createLabelImage(image2);
			}
			if (num2 == 2) {
				two = createLabelImage(image3);	
			}
			int num3 = new Random().nextInt(3);
			if (num3 == 0) {
				three = createLabelImage(image1);
			}
			if (num3 == 1) {
				three = createLabelImage(image2);
			}
			if (num3 == 2) {
				three = createLabelImage(image3);	
			}
			panel.add(one);
			panel.add(two);
			panel.add(three);
			frame.pack();
			if (num1 == num2 && num2 == num3) {
				JOptionPane.showMessageDialog(null, "You won bye");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();

		}
	}
}
