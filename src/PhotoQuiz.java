 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
			int score = 0;
		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
			String URL = "http://i0.kym-cdn.com/entries/icons/original/000/000/091/TrollFace.jpg";
		// 2. create a variable of type "Component" that will hold your image
			Component image;
		// 3. use the "createImage()" method below to initialize your Component
			image = createImage(URL);
		// 4. add the image to the quiz window
			quizWindow.add(image);
		// 5. call the pack() method on the quiz window
			quizWindow.pack();
		// 6. ask a question that relates to the image
			String answer = JOptionPane.showInputDialog("What is this image?");
		// 7. print "CORRECT" if the user gave the right answer
			String Idk;
			if(answer.equalsIgnoreCase("Troll Face")){
				Idk = "Correct";
				JOptionPane.showMessageDialog(null, "Correct");
			} else {
				Idk = "Incorrect";
				JOptionPane.showMessageDialog(null, "Incorrect" );
			}
			if(Idk.equals("Correct")){
				score++;
			} else {
				score--;
			}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
			quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
			String URL2 = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/55/Overwatch_circle_logo.svg/500px-Overwatch_circle_logo.svg.png";
			Component image2;
			image2 = createImage(URL2);
		// 11. add the second image to the quiz window
			quizWindow.add(image2);
		// 12. pack the quiz window
			quizWindow.pack();
		// 13. ask another question
			String answer2 = JOptionPane.showInputDialog("What is this Logo?");
		// 14+ check answer, say if correct or incorrect, etc.
			if(answer2.equalsIgnoreCase("The Overwatch Logo")){
				JOptionPane.showMessageDialog(null, "Correct");
				Idk = "Correct";
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect");
				Idk = "Incorrect";
			}
			if(Idk.equals("Correct")){
				score++;
			} else {
				score--;
			}
			JOptionPane.showMessageDialog(null, "Score: " + score);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





