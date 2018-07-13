package inheritance;

public class Playpen {


    public static void main(String[] args) {
        //Animal  a = new Animal();
        Animal greg =  new Animal("Greg the Gorilla");
        //a.move();
        greg.eat("a salad");

        Reptile r = new Reptile();
        r.eat("a tasty grub");
        System.out.println(greg);
        System.out.println(r);

        Lizard l =  new Lizard();
        System.out.println(l);
        l.move();
        l.eat("tasty lettuce");

        Snake s = new Snake();
        System.out.println(s);
    }
}
