import java.awt.BorderLayout;
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
JTextField num1 = new JTextField(7);
JTextField num2 = new JTextField(7);
JLabel answer = new JLabel("Answer");
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JPanel panel2 = new JPanel();
String number1;
String number2;
Double input1;
Double input2;
Double outputnum;
String output;
public static void main(String[] args) {
	Calculator calculator = new Calculator();
	calculator.createUI();
}
public void createUI() {
frame.setSize(350, 135);
frame.setLayout(new BorderLayout());
frame.add(panel, BorderLayout.SOUTH);
frame.add(panel2, BorderLayout.NORTH);
panel.add(plus);
panel.add(sub);
panel.add(mul);
panel.add(div);
panel2.add(num1);
panel2.add(num2);
panel2.add(answer);
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
		input1 = Double.parseDouble(number1);
		input2 = Double.parseDouble(number2);
		outputnum = input1+input2;
		output = String.valueOf(outputnum);
		answer.setText(output);
	}
	if(e.getSource() == sub) {
		number1 = num1.getText();
		number2 = num2.getText();
		input1 = Double.parseDouble(number1);
		input2 = Double.parseDouble(number2);
		outputnum = input1-input2;
		output = String.valueOf(outputnum);
		answer.setText(output);
	}
	if(e.getSource() == mul) {
		number1 = num1.getText();
		number2 = num2.getText();
		input1 = Double.parseDouble(number1);
		input2 = Double.parseDouble(number2);
		outputnum = input1*input2;
		output = String.valueOf(outputnum);
		answer.setText(output);
	}
	if(e.getSource() == div) {
		number1 = num1.getText();
		number2 = num2.getText();
		input1 = Double.parseDouble(number1);
		input2 = Double.parseDouble(number2);
		outputnum = input1/input2;
		output = String.valueOf(outputnum);
		answer.setText(output);
	}
}
}
