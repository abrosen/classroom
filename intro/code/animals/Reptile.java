package animals;

import java.awt.*;

public class Reptile extends Animal{


    public Reptile(){
        this("Ralph");
    }

    public Reptile(String name){
        this.name= name;
    }

    public void eat(String thing){
        System.out.println(this.name + " ate " + thing +" with a loud crunch!");
    }


    public static void main(String[] args) {
        Reptile r =  new Reptile();
        r.eat("some lettuce");
        r.move();

    }


}
