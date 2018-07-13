package inheritance;

public class Snake extends Reptile {

    public Snake() {
        this("Sally");
    }

    public Snake(String name) {
        super(name);
    }


    public void slither(){
        System.out.println(this.name + " slithers around.");
    }


    public void move() {
        System.out.println(this.name + " slithers away.");
    }

    public void eat(String thing) {
        System.out.println(this.name + " constricts " +thing + " and devours it.");
    }

    @Override
    public String toString() {
        return "Hissssss! " + super.toString();
    }
}
