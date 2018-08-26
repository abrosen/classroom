package inheritance;

public class Animal {
    protected String name;
    private String color;


    public Animal() {
        this("Andrew");
    }

    public Animal(String name) {
        this.name = name;
    }


    public void eat(String thing) {
        System.out.println(this.name +  " eats "  + thing + " generically.");
    }

    public void move() {
        System.out.println(this.name + " moves normally.");

    }

}
