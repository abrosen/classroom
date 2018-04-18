package animals;

public class Snake extends Reptile {

    public Snake() {
        this("Sam");
    }

    public Snake(String name) {
        super(name);
    }


    @Override
    public void eat(String thing) {
        System.out.println(this.name  +  " engulfed " + thing);
    }

    @Override
    public void move() {
        System.out.println(this.name + " slithered.");
    }

    public static void main(String[] args) {
        Snake s =  new Snake();
        s.move();
        s.eat("something tasty");
    }
}
