public class SquareRunner {

    public static void main(String[] args) {
        Square s = new Square(8);
        String temp =  s.toString();
        System.out.println(temp);




        Circle[] circles = new Circle[1000000];
        for (int i = 0; i < circles.length; i++) {
            Circle c =  new Circle(i +1);
            circles[i] = c;
        }

    }
}
