package animals;

public class Lizard extends Reptile {


    public Lizard(){
        this("Lizzy");
    }

    public Lizard(String name) {
        super(name);
    }



    public void move(){
        System.out.println(this.name +  " scurried out of the way!");
    }

    public void eat(String thing) {
        System.out.println(this.name + " pounced on " + thing  +" and gobbled it down!");
    }

    public static void main(String[] args) {
        Lizard l =  new Lizard("Lizz");
        l.move();
        l.eat("a tasty grub");
    }
}
