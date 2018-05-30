package graphics;

import java.awt.Color;
import java.awt.Graphics;

public class GraphicsExample {

	public static void main(String[] args) {
		DrawingPanel panel =  new DrawingPanel();
		Graphics g = panel.getGraphics();
		g.fillRect(0,0, 100,100);
		
		
		g.setColor( new Color(100,200,100) );
		g.drawLine(0,0,50,50);
		g.setColor(Color.magenta);
		g.drawLine(50, 50, 100, 100);
		
		
		g.setColor(Color.RED);
		g.drawString("Hello, World!", 300, 200);
		g.drawRect(0, 0, 100, 100);
		
		
		/*
		g.drawRect(100, 100, 50, 50);

		g.fillOval(100, 100, 50, 50);
		
		for(int i = 0;  i < 5; i++ ) {
			g.fillOval(200+ (i*30), 200 , 20, 20+i*10);
		}*/
	
	}

}
