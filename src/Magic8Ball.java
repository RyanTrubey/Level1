// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;
 
public class Magic8Ball {
	static String[] answers ={"yes", "no", "Ask Google", "Idk"};
	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	
			int random = new Random().nextInt(4);
	JOptionPane.showInputDialog("Ask me a question");
	JOptionPane.showMessageDialog(null, answers[random]);
	// 5. If the random number is 0
	if(random == 0){
		JOptionPane.showMessageDialog(null, "yes");
	}
	// -- tell the user "Yes"
 
	// 6. If the random number is 1
	if(random == 1){
		JOptionPane.showMessageDialog(null, "no");
	}
	// -- tell the user "No"
 
	// 7. If the random number is 2
	if(random == 2){
		JOptionPane.showMessageDialog(null, "Ask Google?");
	}
	// -- tell the user "Maybe you should ask Google?"
 
	// 8. If the random number is 3
	if(random == 3){
		JOptionPane.showMessageDialog(null, "Idk");
	}
	}
	// -- write your own answer
*/	}

	
 

