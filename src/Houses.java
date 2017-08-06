import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot idk = new Robot();
	static int height = 300;
	static String s = "60";
	static String m = "120";
	static String l = "250";
	static int small = Integer.parseInt(s);
	static int medium = Integer.parseInt(m);
	static int large = Integer.parseInt(l);
	static Random number = new Random();
	public static void main(String[] args) {
		idk.setPenWidth(4);
		idk.hide();
		idk.setSpeed(10);
		startPosition();
		idk.penDown();
		for(int i = 0; i < 9; i++){
			drawHouse(small);
			
		}
		
	}

	static void startPosition() {
		idk.moveTo(30, 900);
	}

	static void drawHouse(int height) {
		idk.setRandomPenColor();
		idk.move(height);
		if(height >= large){
			drawFlatRoof();
		} else {
			drawPointyRoof();
		}
		idk.move(height);
		idk.setPenColor(Color.green);
		idk.turn(-90);
		idk.move(30);
		idk.turn(-90);
		idk.setPenColor(Color.black);
	}
	static void drawPointyRoof(){
		idk.turn(30);
		idk.move(30);
		idk.turn(120);
		idk.move(30);
		idk.turn(30);
	}
	static void drawFlatRoof(){
		idk.turn(90);
		idk.move(30);
		idk.turn(90);
	}
}
