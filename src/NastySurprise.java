

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements MouseListener {
  public static void main(String[] args) {
	new NastySurprise().createUI();
}
  JFrame frame = new JFrame();
  JPanel panel = new JPanel();
  JButton button = new JButton();
  JButton button1 = new JButton();
  
  private void createUI() {
	  frame.add(panel);
	  frame.setVisible(true);
	  button.setText("Trick");
	  button1.setText("Treat");
	  button.addMouseListener(this);
	  button1.addMouseListener(this);
	  panel.add(button);
	  panel.add(button1);
	  frame.pack();
  }
  private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
	if (e.getSource() == button) {
		showPictureFromTheInternet("https://i.imgur.com/vWD85qB.jpg");
	}
	if(e.getSource() == button1) {
		showPictureFromTheInternet("https://static1.squarespace.com/static/5b3a59f93e2d0904012f9010/t/5b3a797c88251b29f4970de4/1535666508261/scary+acres+girl+with+dolly.jpg?format=2500w");
	}
	
}

@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
