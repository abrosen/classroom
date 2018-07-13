package inheritance;

public class Lizard extends Reptile {


    public Lizard(){
        this.name = "Lizzy";
    }

    public Lizard(String name){
        super(name);
    }

    public void move() {
        System.out.println(this.name +" scurries away in a hurry.");
    }


}
