package graphics;

import java.awt.*;

public class LoopDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DrawingPanel panel = new DrawingPanel(500,500);
		Graphics g =  panel.getGraphics();
		
		panel.setBackground(Color.WHITE);
		g.setColor(Color.RED);
		
		/*
		for (int i = 1; i <= 10; i++) {
		    //              x           y        w   h
		    g.fillOval(100 + 20 * i, 5 + 20 * i, 50, 50);
		}*/
		
		
		g.setColor(Color.BLUE);

		for (int x = 1; x <= 4; x++) {
		    for (int y = 1; y <= 9; y++) {
		    	g.setColor( new Color (y *20,0,255 -(x*40)));
		        g.drawString("Java", x * 40, y * 25);
		    }
		}
		
		for(int i = 0; i <200; i++) {
			for(int j = 0; j <200; j++) {
				g.setColor(new Color(j,0, i));
				g.fillRect(10+i*1, 300+j*1, 1, 1);
			}
		}



	}

}
