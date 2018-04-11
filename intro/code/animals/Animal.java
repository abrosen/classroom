package animals;

import java.awt.*;

public class Animal extends Object{
    String name;
    double size;
    Color color;

    public Animal(){
        this("Andrew");
    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat(String thing){
        System.out.println(this.name + " ate " + thing + " normally.");
    }

    public void move(){
        System.out.println(this.name + " moved generically.");
    }


    public static void main(String[] args) {
        Animal a  = new Animal("Ari the Aardvark");
        a.eat("a tasty snack");
    }
}
