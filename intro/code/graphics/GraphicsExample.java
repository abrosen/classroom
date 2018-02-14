package graphics;

import java.awt.Color;
import java.awt.Graphics;

public class GraphicsExample {

	public static void main(String[] args) {
		DrawingPanel panel =  new DrawingPanel();
		Graphics g = panel.getGraphics();
		g.setColor(Color.BLUE);
		g.drawRect(100, 100, 50, 50);
		g.setColor(Color.RED);
		g.fillOval(100, 100, 50, 50);
		
		for(int i = 0;  i < 5; i++ ) {
			g.fillOval(200+ (i*30), 200 , 20, 20+i*10);
		}
	
	}

}
