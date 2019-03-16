import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JTextField one = new JTextField();
	JTextField two = new JTextField();
	JLabel label = new JLabel();
void start() {
	frame.add(panel);
	frame.setVisible(true);
	panel.add(button);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(label);
	panel.add(one);
	panel.add(two);
	button.setText("add");
	button1.setText("sub");
	button2.setText("mul");
	button3.setText("div");
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
}
void add(){
	
}
void subtract(){
	
}
void multiply(){
	
}
void Divide(){
	
}
@Override
public void actionPerformed(ActionEvent e) {
	
	
}
}
