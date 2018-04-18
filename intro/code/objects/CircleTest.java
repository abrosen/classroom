package objects;


// program
public class CircleTest {
    public static void main(String[] args) {



        //Math m =  new Math();



        System.out.println(Math.pow(2,5));

        //Circle.numCircles  =10000000;

        Circle[] circles =  new Circle[1000000];
        for(int i =0; i < circles.length; i++) {
            Circle  c = new Circle(i);
            //System.out.println("We've made "   + Circle.getNumCircles() + " circles." ) ;
            circles[i] = c;
        }

        System.out.println(Circle.PI);


        for (Circle c :circles) {
          //  System.out.println(c);
        }



    }
}
