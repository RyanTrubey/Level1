import java.awt.Color;
import java.util.ArrayList;

public class ColorPalette {

ArrayList<Color> colorList = new ArrayList<Color>();
public ColorPalette(Color color, Color color2, Color color3) {
	colorList.add(color);
	colorList.add(color2);
	colorList.add(color3);
}
public ArrayList<Color> listColors() {
	return colorList;
}

}
