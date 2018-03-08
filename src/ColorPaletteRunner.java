import java.awt.Color;

public class ColorPaletteRunner {
static ColorPalette cp = new ColorPalette(Color.red, Color.orange, Color.yellow);
static Picasso p = new Picasso();
public static void main(String[] args) {
	p.drawPalette(cp);
}
}
