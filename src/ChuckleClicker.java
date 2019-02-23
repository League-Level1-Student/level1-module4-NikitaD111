import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button = new JButton();
	JButton button1 = new JButton();

	public static void main(String[] args) {

		new ChuckleClicker().makeButtons();
	}

	void makeButtons() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();

		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(button1);
		button.setText("Joke");
		button1.setText("Punchline");
		button.addActionListener(this);
		button1.addActionListener(this);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (button == buttonPressed) {
			JOptionPane.showMessageDialog(null, "What do you get when you cross a snake with a tasty dessert?");

		} else if (button1 == buttonPressed) {
			JOptionPane.showMessageDialog(null, "a pie-thon");
		}

	}
}
