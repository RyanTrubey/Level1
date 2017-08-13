
// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel drumLabelWithImage;
	JLabel Drum2;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
			JFrame Frame = new JFrame();
		// 2. Make the frame visible
			Frame.setVisible(true);
		// 3. Set the size of the frame
			Frame.setSize(50, 50);
		// 4. Set the title of the frame
			Frame.setTitle("Drum Kit");
		// 5. Make a JPanel and initialize it.
			JPanel Panel = new JPanel();
			
		// 6. Add the panel to the frame. (The panel is invisible.)
			Frame.add(Panel);
			
		// 7. Download an image of a drum from the Internet. Drop it into your Eclipse
		// project under "default package".
		// 8. Put the name of your image in a String variable.
			String D = "Drum.png";
			String C = "Cymbal.jpg";
		// 9. Edit the next line to use your String variable
			drumLabelWithImage = createLabelImage(D);
			Drum2 = createLabelImage(C);
		// 10. Add the image to the panel
			Panel.add(drumLabelWithImage);
			Panel.add(Drum2);
		// 11. Set the layout of the panel to "new GridLayout()"
			Panel.setLayout(new GridLayout());
		// 12. call the pack() method on the frame
			Frame.pack();
		// 13. add a mouse listener to drumLabelWithImage.
			drumLabelWithImage.addMouseListener(this);
			Drum2.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		System.out.println("mouse clicked");
		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package". You can
		// find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.
		// 16. If they clicked on the drumImage...
			if(e.getSource() == Drum2) {
				playSound("Cymbal.wav");
			}
			if(e.getSource() == drumLabelWithImage) {
				playSound("Drum.aiff");
			}
		// 17. ...use the playSound method to play a drum sound.
		
			
		// 18. Add more images to make a drumkit. Remember to add a mouse listener to
		// each one.
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
