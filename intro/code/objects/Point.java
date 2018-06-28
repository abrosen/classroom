package objects;

public class Point {

    // Attributes
    // What the object has
    double x;
    double y;

    // Constructors
    // How to build an object
    public Point(int initX, int initY) {
        x = initX;
        y = initY;
    }


    //Behaviors
    //What the object can do
    public void printCoordinates(){

        System.out.println(x + " " + y);
    }

}
