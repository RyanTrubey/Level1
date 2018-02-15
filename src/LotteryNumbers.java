import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LotteryNumbers implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Get Lottery Number");
	JLabel label = new JLabel("...................");
public static void main(String[] args) {
	new LotteryNumbers();
	
}
public LotteryNumbers() {
	createWindow();
}
public void createWindow() {
	frame.add(panel);
	panel.add(button);
	panel.add(label);
	frame.setVisible(true);
	frame.pack();
	button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button) {
		Random random = new Random();
		Integer x = random.nextInt(1000000);
		label.setText(x.toString());
	}
}
}
