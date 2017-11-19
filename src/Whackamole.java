import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Whackamole {
public static void main(String[] args) {
	Whackamole idk = new Whackamole();
	Random r = new Random();
	int ran = r.nextInt(12);
	idk.drawButtons(ran);
}
public void drawButtons(int num){
	JFrame frame = new JFrame();
	for(int i = 0; i < 12; i++) {
		JButton button = new JButton();
		frame.add(button);
		if(i == num) {
			button.setText("Mole!");
		}
	}
	frame.setSize(480, 610);
}
}
