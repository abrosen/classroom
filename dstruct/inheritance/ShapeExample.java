package inheritance;

public class ShapeExample {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(3);
        shapes[2] = new Rectangle(3,4);
        for(Shape shape : shapes) {
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}
