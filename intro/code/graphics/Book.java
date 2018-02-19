package graphics;

import java.awt.*;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DrawingPanel panel = new DrawingPanel(200,150);
		Graphics g =  panel.getGraphics();
		g.setColor(Color.CYAN);
		g.fillRect(20, 35, 100, 100);
		
		g.setColor(Color.WHITE);
		g.drawString("BJP", 70, 55);
		g.setColor(new Color(191,118,73));
		
		for(int i = 0; i< 10; i++) {
			g.fillRect(20, 35+i*10, 10 + 10*i, 9);
			panel.sleep(20);
		}
	}

}
