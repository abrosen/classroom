package hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        /*Set<String> set = new HashSet<String>();
        set.add("Hello");
        System.out.println(set);
        set.add("World");
        System.out.println(set);
        set.add("foo");
        set.add("bar");
        set.add("baz");
        set.add("babble");
        set.add("fred");
        set.add("whup");
        set.add("whup");
        set.add("whup");
        set.add("whup");
        set.add("whup");
        set.add("whup");
        //System.out.println();
        for(String word : set){
            System.out.println(word);
        }*/

        Map<Integer,Student> map = new HashMap<Integer, Student>();
        map.put(423524, new Student(423524,"Foo Bar", "123 CS Lane"));
        map.put(1, new Student(1,"ABC", "321 Alphabet Lane"));
        map.put(-1, new Student(-1,"Negative Nancy", "Y axis"));
        System.out.println(map.get(423523));

    }
}
