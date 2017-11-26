import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whackamole implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton mole = new JButton("Mole");
	int MoleCounter = 0;
	int Counter = 10;
	int wrongCounter = 0;
	Date timeAtStart = new Date();
public static void main(String[] args) {
	Whackamole idk = new Whackamole();
	Random r = new Random();
	int ran = r.nextInt(19);
	idk.drawButtons(ran);
}
public void drawButtons(int num){
	frame = new JFrame();
	panel = new JPanel();
	mole = new JButton("mole");
	frame.add(panel);
	for(int i = 0; i < 19; i++) {
		
		if(i == num) {
			panel.add(mole);
			
		} else {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
		}
	}
	mole.addActionListener(this);
	frame.setVisible(true);
	frame.setSize(400, 175);
}
void speak(String words) {
try {
Runtime.getRuntime().exec("say " + words).waitFor();
} catch (Exception e) {
e.printStackTrace();
}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() != mole) {
		speak("you missed");
		wrongCounter+=1;
		if(wrongCounter % Counter == 0) {
			for(int i = 0; i < 499; i++) {
				JOptionPane.showMessageDialog(null, "Ur bad and shouldn't be playing this game");
			}
		}
	} else if (e.getSource() == mole) {
		MoleCounter+=1;
		if(MoleCounter == 10) {
			endGame(timeAtStart, 10);
		}
	}
	frame.dispose();
	Random n = new Random();
	int ran2 = n.nextInt(19);
	drawButtons(ran2);
	
}
private void endGame(Date timeAtStart, int molesWhacked) {
Date timeAtEnd = new Date();
JOptionPane.showMessageDialog(null, "Your whack rate is "
+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000 / molesWhacked) + " moles per second.");
}


}
