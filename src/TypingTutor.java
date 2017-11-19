import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
static int keysPressed = 0;
	JFrame frame = new JFrame();
char currentLetter = generateRandomLetter();
JLabel label = new JLabel();
JPanel panel = new JPanel();
String letter = "";
public static void main(String[] args) {
	TypingTutor idk = new TypingTutor();
	idk.createWindow();
	
	
}
public void createWindow() {
	frame.show();
	frame.add(panel);
	panel.add(label);
	letter+=currentLetter;
	label.setText(letter);
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.pack();
	frame.addKeyListener(this);
}
char generateRandomLetter() {
	Random r = new Random();
	return (char) (r.nextInt(26) + 'a');
}
private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	Date timeAtEnd = new Date();
	long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	long gameInSeconds = (gameDuration / 1000) % 60;
	double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	int charactersPerMinute = (int) (charactersPerSecond * 60);
	JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
}
Date timeAtStart = new Date();

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	char s = e.getKeyChar();
	String a = "";
	a+=s;
	System.out.println(a);
	if(s == currentLetter) {
		panel.setBackground(Color.green);
	} else {
		panel.setBackground(Color.red);
	}
	if(s == currentLetter) {
		keysPressed+=1;
	}
	if(keysPressed == 20) {
		showTypingSpeed(keysPressed);
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	letter = "";
	letter+=currentLetter;
	label.setText(letter);
	
}

}


