import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
JButton plus = new JButton("+");
JButton sub = new JButton("-");
JButton mul = new JButton("X");
JButton div = new JButton("÷");
JTextField num1 = new JTextField();
JTextField num2 = new JTextField();
JLabel answer = new JLabel();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
String number1;
String number2;
int input1;
int input2;
int outputnum;
String output;
public static void main(String[] args) {
	Calculator calculator = new Calculator();
	calculator.createUI();
}
public void createUI() {
frame.setSize(500, 500);
frame.add(panel);
panel.add(plus);
panel.add(sub);
panel.add(mul);
panel.add(div);
panel.add(num1);
panel.add(num2);
panel.add(answer);
frame.pack();
plus.addActionListener(this);
sub.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
frame.setVisible(true);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == plus) {
		number1 = num1.getText();
		number2 = num2.getText();
		input1 = Integer.parseInt(number1);
		input2 = Integer.parseInt(number2);
		outputnum = input1+input2;
		output = String.valueOf(outputnum);
		answer.setText(output);
	}
}
}
