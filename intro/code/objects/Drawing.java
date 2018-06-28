package objects;

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(400, 400);
        frame.add(canvas); frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        //g.fillOval(100, 100, 200, 200);
        Point p1 = new Point(1,1);
        Point p2 = new Point(100,100);
        g.drawLine(p1.x,p1.y,p2.x,);

    }
}
