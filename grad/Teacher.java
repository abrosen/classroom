public class Teacher {

    private int id;
    private String name;


    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void teach(Student student) {
        student.learn();
    }
}
