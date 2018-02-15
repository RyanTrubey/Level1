import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SensitiveKeyboard implements KeyListener{
	JFrame frame = new JFrame();
	int count;
public static void main(String[] args) {
	SensitiveKeyboard keyboard = new SensitiveKeyboard();
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
   }

public SensitiveKeyboard() {
	frame.addKeyListener(this);
	frame.setVisible(true);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == frame) {
		count++;
		speak("oof");
		if(count == 10) {
			frame.setVisible(false);
		}
	}
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
