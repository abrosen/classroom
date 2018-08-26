package inheritance;

public class Reptile extends Animal {
    public Reptile() {
        super("Ralph");
    }

    public Reptile(String name) {
        super(name);
    }


    public void eat(String thing) {
        System.out.println(this.name  +  " eats "  + thing + " with a crunch!");
    }
}
