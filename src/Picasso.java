import org.jointheleague.graphical.robot.Robot;

public class Picasso {
	
Robot brush = new Robot();
public void drawPalette(ColorPalette cp){
	int x = 100;
	for(int i = 0; i<3; i++) {
	brush.hide();
	brush.setSpeed(10);
	brush.moveTo(x, 100);
	brush.setPenColor(cp.listColors().get(i));
	brush.penDown();
	brush.setPenWidth(10);
	brush.move(50);
	brush.penUp();
	brush.moveTo(x+=20, 100);
	}
}
}
