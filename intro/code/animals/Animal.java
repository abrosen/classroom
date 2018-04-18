package animals;

import java.awt.*;

public class Animal {
    protected String name;
    protected double size;
    protected Color color;

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


    @Override
    public boolean equals(Object obj) {

       if(!(obj instanceof Animal)){
           return false;
       }
       else{
           return this.equals(  (Animal) obj);
       }
    }

    public boolean equals(Animal a) {
        if(this.name.equals(a.name)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Animal a  = new Animal("Ari the Aardvark");
        a.eat("a tasty snack");
    }
}
