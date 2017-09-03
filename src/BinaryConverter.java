import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel Panel = new JPanel();
	JTextField Text1 = new JTextField(20);
	JTextField Text2 = new JTextField(20);
	JButton button = new JButton("convert");

	public static void main(String[] args) {
		BinaryConverter BC = new BinaryConverter();
	}

	BinaryConverter() {
		frame.setVisible(true);
		frame.add(Panel);
		Panel.add(Text1);
		Panel.add(button);
		Panel.add(Text2);
		frame.pack();
		button.addActionListener(this);
	}
	int convert(String binary) {
		if(binary.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		for(int i = 0; i < binary.length(); i++) {
			if(binary.charAt(i) != '0' && binary.charAt(i) != '1') {
				JOptionPane.showMessageDialog(null, "Binary!!");
				return 0;
			}
				
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			//question.setText("");
			return 0;
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int answer = convert(Text1.getText());
		Text2.setText("" + answer);

	}
}
