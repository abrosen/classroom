package inheritance;

public class Polymorph {

    public static void main(String[] args) {



        Animal[] zoo =  new Animal[5];
        zoo[0] = new Animal("Ernie the Elephant");
        zoo[1] = new Animal("Greg the Gorilla");
        zoo[2] = new Reptile();
        zoo[3] = new Lizard();
        zoo[4] = new Snake();

        for (Animal a : zoo) {
            System.out.println(a);
            a.move();
            a.eat("tasty zoo snacks");
        }


        // slither
        Animal s = new Snake();
        s.move();
        s.eat("something huge");
        ((Snake)   s).slither();
    }
}
