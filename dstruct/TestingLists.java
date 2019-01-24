import java.util.ArrayList;
import java.util.List;

public class TestingLists {

    public static <E>  void printAllThings(List<E> list){
        for(E thing : list ){
            System.out.println(thing);
        }

    }

    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();

        list.add(1);list.add(1);list.add(1);list.add(1);list.add(1);list.add(1);list.add(1);
        printAllThings(list);
    }

}
