public class Student {
    private int id;
    private String name;
    private int knowledge;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.knowledge = 0;
    }


    public void learn(){
        knowledge++;
    }
}
