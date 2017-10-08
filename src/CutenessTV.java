import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Cats");
	JButton button2 = new JButton("Dogs");
	JButton button3 = new JButton("Ducks");
public static void main(String[] args) {
	CutenessTV thing = new CutenessTV();
	thing.makeButtons();
}
void makeButtons() {
	frame.show();
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
}
void showCats() {
	playVideo("rNSnfXl1ZjU");
}
void showDogs() {
	playVideo("jkBMpNtM43g");
}
void showDucks() {
	playVideo("e3PdcKcUvDY&t");
}
void playVideo(String videoID) {
	try {
URI uri = new URI("https://www.youtube.com/watch?v=" + videoID);
//https://www.youtube.com/watch?v=rNSnfXl1ZjU
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == button1) {
		showCats();
	}
	if(e.getSource() == button2) {
		showDogs();
	}
	if(e.getSource() == button3) {
		showDucks();
	}
}


}
