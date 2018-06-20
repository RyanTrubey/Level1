import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Exam implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton yellow;
	JButton red;
	JButton blue;
	JButton green;

	public static void main(String[] args) {
		Level1Exam exam = new Level1Exam();
		exam.createUI();
	}

	public void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		yellow = new JButton();
		red = new JButton();
		blue = new JButton();
		green = new JButton();
		frame.add(panel);
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);
		frame.pack();
		yellow.setBackground(Color.yellow);
		red.setBackground(Color.red);
		blue.setBackground(Color.blue);
		green.setBackground(Color.green);
		yellow.setOpaque(true);
		red.setOpaque(true);
		blue.setOpaque(true);
		green.setOpaque(true);
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
		frame.setVisible(true);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == yellow) {
			speak("Yellow");
		}
		if (e.getSource() == red) {
			speak("Red");
		}
		if (e.getSource() == blue) {
			speak("blue");
		}
		if (e.getSource() == green) {
			speak("green");
		}
	}
}
