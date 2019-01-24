import java.util.Scanner;

public class PointTester {

    public static void main(String[] args) {
        Point p =  new Point();
        Point p2 = new Point(3,4);



        p.printPoint();
        p2.printPoint();

        System.out.println(p.distance(p2));



    }
}
