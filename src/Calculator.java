import java.awt.Dimension;
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
	panel.add(one);
	panel.add(two);
	panel.add(button);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(label);
	button.setText("add");
	button1.setText("sub");
	button2.setText("mul");
	button3.setText("div");
	one.setPreferredSize(new Dimension(100,30));
	two.setPreferredSize(new Dimension(100,30));
	button.addActionListener(this);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	frame.pack();
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
}
int add(int a,int b){
	return a+b ;
	
}
int subtract(int a,int b){
	return a-b;
	
}
int multiply(int a,int b){
	return a*b;
	
}
int Divide(int a, int b){
	return a/b;
	
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton pressed = (JButton) e.getSource();
	String num = one.getText();
	String num1 = two.getText();
	int on = Integer.parseInt(num);
	int tw = Integer.parseInt(num1);
	int res = 0;
	if(pressed ==  button) {
		res = add(on, tw);
		
	}
	if(pressed == button1) {
		res = subtract(on, tw);
	}
	if(pressed == button2) {
		res = multiply(on, tw);
	}
	if(pressed == button3) {
		res = Divide(on, tw);
	}
	label.setText(res + " ");
	frame.pack();
}
}
