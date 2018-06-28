package objects;

public class Point {

    // Attributes
    // What the object has
    private int x;
    private int y;

    // Constructors
    // How to build an object
    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getY() {
        return y;
    }

    public int getX(){
        return this.x;

    }



    //Behaviors
    //What the object can do
    public void printCoordinates(){

        System.out.println(x + " " + y);
    }

}
