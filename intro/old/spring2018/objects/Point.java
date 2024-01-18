package objects;

import java.awt.*;

public class Point {

    // instance variables
    private int x;
    private int y;


    // Constructors
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //instance methods
    public int getX(){
        return this.x;
    }

    public int getY() {
        return this.y;
    }


    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        this.x = this.x + dx;
        this.y = this.y + dy;
    }


    public double distance(Point otherPoint){
        int dx = x - otherPoint.x;
        int dy = y - otherPoint.y;

        double distance  = Math.sqrt(dx*dx + dy*dy);
        return distance;

    }

    public void draw(Graphics g) {
        g.fillOval(x, y,3,3);
        g.drawString("(" +x + " " + y+")" , x, y);
    }


    public String toString() {
        return "(" + x + "," + y + ")";
    }


}
