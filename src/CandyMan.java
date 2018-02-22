import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CandyMan implements ActionListener {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button = new JButton("Candyman");
int count = 0;
public static void main(String[] args) {
	CandyMan candy = new CandyMan();
	candy.createWindow();
}
public void createWindow() {
	frame.add(panel);
	panel.add(button);
	frame.setSize(400, 400);
	frame.setVisible(true);
	button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource() == button) {
		count++;
		if(count == 5) {
			JOptionPane.showMessageDialog(null, "I am the CandyMan");
		}
	}
}
}
