package inheritance;

public class Reptile extends Animal {

    public Reptile(){
       this.name =  "Ralph";
    }

    public Reptile(String name){
       super(name);
        //this.name = name;
    }

    public void eat(String thing){
        System.out.println(this.name +" ate "+ thing +" with a loud CRUNCH!");
    }


    public String toString(){
        return this.name + " says:  I am a ferocious reptile!  Fear me!";
    }
}
