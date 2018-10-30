package hashtables;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {



    public static <E> boolean unique(List<E> list){



        Set<E> checklist = new HashSet<>();
        for (E item : list) {
            if(checklist.contains(item)){
                return false;
            } else {
                checklist.add(item);
            }

        }


        return true;
    }


    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // O(1)
        System.out.println(set.add("hello"));
        set.add("world");
        set.add("world!");
        set.add("Hello");
        set.add(null);

        System.out.println(set);

        System.out.println(set.add("hello"));

        System.out.println(set);

        for (String item : set){
            System.out.println(item);
        }
    }
}
