package hash;

public class Student {
    int idNum;
    String name;
    String address;

    public Student(int idNum, String name, String address) {
        this.idNum = idNum;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNum=" + idNum +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
