package inheritance;

public class Playpen {

    public static void main(String[] args) {

        Animal[] zoo = new Animal[5];
        zoo[0] = new Animal("Gary the Gorilla");
        zoo[1] = new Animal();
        zoo[2] = new Reptile();
        zoo[3] = new Lizard();
        zoo[4] = new Snake();
        for (Animal a : zoo) {
            a.move();
            a.eat("pizza");
            System.out.println(a.name + " is a Reptile: " + (a instanceof Reptile));
        }
    }
}
