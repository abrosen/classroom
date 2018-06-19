package turtles;

import java.awt.*;

public class Playpen {

    public static void drawSquare(Turtle t){
        for(int i = 0; i < 4; i++){
            t.forward(100);
            t.turnRight(90);
        }
    }

    public static void drawPolygon(Turtle t, int sides, int size) {
        double angle = 360.0/sides;

        for(int i =0; i < sides; i++){
            t.forward(size);
            t.turnLeft(angle);
        }
    }


    public static void drawStar(Turtle t) {
        for(int i = 0; i < 50; i++){
            t.forward(100 + i*5 );
            t.turnRight(144);
        }

    }


    public static void weird(Turtle t){

        double angle = 360.0/100;
        for (int i = 0; i < 100; i++) {
            t.setColor(  new Color(i*2,0,i) );

            t.forward(100);
            t.turnRight(15);
            t.forward(15);
            t.turnLeft(25);
            t.forward(50);



            t.penUp();
            t.goTo(0,0);
            t.penDown();
            t.turnRight(angle);
        }

    }


    public static void drawSquaredSquares(Turtle t) {

        for (int i = 1; i <= 4; i++) {
            t.penUp();
            t.goTo(i*-30,i*-30);
            t.penDown();
            for (int j = 0; j < 4; j++) {
                t.forward(i*60);
                t.turnLeft(90);
            }


        }
    }


    public static void drawMulticolorSpiral(Turtle t, int step) {



    }


    public static void drawSquareSpiral(Turtle t, int step) {
        for (int i = 0; i < 50; i++) {
            t.setColor( new Color(i*5, 100 + i, 255 - i));
            t.forward(step*i);
            t.turnRight(90);
        }

    }

    public static void main(String[] args) {
        World w  =  new World();
        Turtle leo = new Turtle(w);
        leo.setColor(Color.RED);
        Turtle alice = new Turtle(w);
        alice.setColor(Color.GREEN);

        //drawSquareSpiral(leo,10);
       // drawSquareSpiral(alice,2);

        drawSquaredSquares(leo);
        //weird(leo);
        //drawPolygon(alice,12,50);
        //drawStar(leo);

        /*
        leo.forward(100);
        leo.setColor(Color.RED);
        drawSquare(leo);
        leo.turnLeft(90);
        leo.drop("https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Red_Fuji_southern_wind_clear_morning.jpg/320px-Red_Fuji_southern_wind_clear_morning.jpg");
        */
    }
}
