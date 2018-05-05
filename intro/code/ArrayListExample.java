import java.sql.SQLOutput;
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(7);
        list.add(5);
        list.add(12);

        //list.set(1, "tofu");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            int thing = list.get(i);
            System.out.println(thing);
        }

    }
}
