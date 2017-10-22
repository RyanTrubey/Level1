import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Get your fortune");
	JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		FortuneCookie thing = new FortuneCookie();
		thing.showButton();
	}

	void showButton() {
		frame.add(panel);
		panel.add(button);
		frame.pack();
		frame.show();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			int random = new Random().nextInt(0)+4;
			if(random == 0) {
				System.out.println("you will die.");
			} else if(random == 1) {
				System.out.println("you will live until you die.");
			} else if(random == 2) {
				System.out.println("idk");
			} else if(random == 3) {
				System.out.println("you will be one year older in one year.");
			} else if(random == 4) {
				System.out.println("you might wake up tomorrow.");
			} else {
				System.out.println("I have no idea");
			}
		}
	}
}
