import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button1 = new JButton("Joke");
	JButton button2 = new JButton("Punchline");
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		ChuckleClicker thing = new ChuckleClicker();
		thing.makeButtons();
	}

	void makeButtons() {
		frame.show();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "why did the frog fall off the cliff");
		}
		if(e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "someone pushed him");
		}

	}
}
