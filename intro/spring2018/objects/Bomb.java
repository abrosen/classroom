package objects;

import graphics.DrawingPanel;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bomb {

    public static Point[] readCities(String filename) throws FileNotFoundException {
        File data = new File(filename);
        Scanner fileReader =  new Scanner(data);
        int numCities =  Integer.parseInt(fileReader.nextLine());

        Point[] points = new Point[numCities];
        for (int i = 0; i < points.length; i++) {
            String line =  fileReader.nextLine();
            String[] parts = line.split(" ");
            int x =  Integer.parseInt(parts[0]);
            int y =  Integer.parseInt(parts[1]);

            points[i] = new Point(x, y);

        }

        return points;
    }



    public static void draw(Point city,  Graphics g) {

        g.fillOval(city.getX(), city.getY(),3,3);
        g.drawString(city.toString() , city.getX(), city.getY());
    }


    public static void boom(Point bomb, int radius,  Point[] cities , Graphics g){

        for (Point city: cities) {
            city.draw(g);
            System.out.println(city);
        }

        g.setColor(Color.RED);
        for (Point city:cities) {
            if(city.distance(bomb)  < radius) {
                city.draw(g);
            }
        }

        g.drawOval(bomb.getX() - radius,bomb.getY() -radius, radius*2 , radius*2 );


    }


    public static void main(String[] args) throws FileNotFoundException {
        Point[] points = readCities("cities.txt");

        String s = "abc";
        s.length();
        DrawingPanel panel = new DrawingPanel();
        Graphics g = panel.getGraphics();

        Point theBomb =  new Point(100,100);

        System.out.println(theBomb.toString());
        boom(theBomb,100, points, g);

    }
}
