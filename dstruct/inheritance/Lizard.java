package inheritance;

public class Lizard extends Reptile {

    public Lizard(){
        this.name = "Lizzy";
    }

    public Lizard(String name) {
        super(name);
    }


    public void eat(String thing){
        System.out.println(this.name + " pounces on " + thing+ " and eats it!");
    }

    public void move(){
        System.out.println(this.name + " scurries away!");
    }
}
