package objects;

import java.awt.Graphics;

public class Circle {

    private int radius;
    private Point loc;
    public static final double PI = 3.14159;

    public Circle(){
        radius =10;
        loc = new Point(0,0);
    }

    public Circle(int radius, Point loc){
        this.radius = radius;
        this.loc =  loc;
    }

    public double getCircumfrence(){
        return 2*PI*radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }

    public void draw(Graphics g){
        g.fillOval(loc.getX(), loc.getY(), 2*radius, 2*radius);
    }


}
