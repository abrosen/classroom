package animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalDriver {


    public static void feed(Animal[] animals, String food) {
        for(int i = 0; i < animals.length; i++) {
            Animal a = animals[i];

            if(a == null) {
                continue;
            }

            a.eat(food);
        }

    }


    public static void main(String[] args) {
        Animal[] zoo = new Animal[10];
        zoo[0] = new Animal("Eddy the Elephant");
        zoo[1] = new Reptile();
        zoo[2] = new Lizard();
        zoo[3] = new Snake();
        zoo[4] = new Animal("Ozzy the Orangutan");
        feed(zoo, "a cookie");

        Animal a1 = new Animal("A");
        Animal a2 = new Animal("A");
        System.out.println(a1.equals(new Reptile("A")));




    }

}
