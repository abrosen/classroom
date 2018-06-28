package objects;

import java.awt.*;
import java.util.Arrays;
import javax.swing.JFrame;

public class Drawing extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();

        canvas.setSize(1000, 600);
        frame.add(canvas); frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);
    }

    public void paint(Graphics g) {
        //g.fillOval(100, 100, 200, 200);
        Point p1 = new Point(1,1);
        Point p2 = new Point(100,100);
        g.drawLine(p1.getX(),p1.getY(), p2.getX(), p2.getY());

        g.setColor(Color.RED);

        Rectangle[] rex = new Rectangle[30];

        for(int i = 0; i < rex.length; i++) {
            rex[i]  = new Rectangle(10*(i+1),10, new Point(10,i*20));
            rex[i].draw(g);
        }

        g.setColor(Color.BLUE);
        Circle c = new Circle(10, new Point(100,100));
        Circle[][] circles =  new Circle[40][40];
        for(int i = 0; i < circles.length; i++){
            for(int j = 0; j < circles[i].length; j++){
                circles[i][j] = new Circle(10, new Point(i*20,j*20));
                circles[i][j].draw(g);
            }
        }
        System.out.println(Circle.PI);


    }
}
