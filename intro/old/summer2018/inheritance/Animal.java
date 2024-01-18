package inheritance;

public class Animal /*extends Object*/{
    protected String name;

    public Animal() {
        this.name = "Mr. Noname";
    }
    public Animal(String name) {
        this.name =  name;
    }

    public void move(){
        System.out.println(this.name + " moved generically.");
    }

    public void eat(String thing) {
        System.out.println(this.name + " ate " + thing + " normally.");
    }

    @Override
    public String toString() {
        return this.name+"\t"+super.toString();
    }
}
