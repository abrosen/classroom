public class Point {
    // attributes - instance variables
    private int x;
    private int y;

    // constructors
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // behaviors - instance methods
    public void printPoint() {
        System.out.println("This point is at (" +  this.x + ", "+ this.y +")");
    }

    public double distance(Point p) {
        int deltaX = p.x - this.x;
        int deltaY = p.y - this.y;
        return Math.sqrt(  Math.pow(deltaX,2)  + Math.pow(deltaY,2));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x >= 0){

            this.x = x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y >= 0){

            this.y = y;
        }
    }
}
