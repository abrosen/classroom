package inheritance;

public class Snake extends Reptile {

    public Snake() {
        this.name =  "Sally";
    }

    public Snake(String name) {
        super(name);
    }

    public void hiss() {
        System.out.println("HISS!!!");
    }

    public void move() {

        System.out.println(this.name + " slithers away!");
    }
}
