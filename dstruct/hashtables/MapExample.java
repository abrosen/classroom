package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {


    // INPUT -> OUTPUT
    // ["foo", "bar", "foo", "bar", "baz"] -> {"foo":2 , "bar":2, "baz":1}
    // ["a", "b", "a","c", "a", "d"] -> {"a":3, "b":1, "c":1,"d":1}
    public static Map<String, Integer> wordCount(List<String> words) {
        Map<String, Integer> map =  new HashMap<>();


        for (String word : words) {
            if(!map.containsKey(word)){
                map.put(word, 1);
            } else {
                int timesSeen = map.get(word);
                map.put(word,timesSeen + 1);
            }
        }

        return map;
    }

    public static <E> boolean isPermutation(List<E> listA, List<E> listB){
        if(listA.size() != listB.size()){
            return false;
        }

        Map<E, Integer> mapA =  new HashMap<>();
        Map<E, Integer> mapB =  new HashMap<>();

        for(E item : listA){
            if(mapA.containsKey(item)){
                int timesSeen =  mapA.get(item);
                mapA.put(item, timesSeen + 1);
            } else {
                mapA.put(item ,1);
            }

        }

        for(E item : listB){
            if(mapB.containsKey(item)){
                mapB.put(item, mapB.get(item) +1);
            } else {
                mapB.put(item ,1);
            }

        }

        for (E item : mapA.keySet() ) {
            if(mapA.get(item) != mapB.get(item)){
                return false;
            }
        }

        for (E item : mapB.keySet() ) {
            if(mapA.get(item) != mapB.get(item)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        /*map.put("Hello", "foo");
        map.put("World", "bar");
        map.put("lll", "baz");
        map.put("lll", "fred");

        System.out.println(map);
        System.out.println(map.get("Hello"));
        System.out.println(map.remove("Hello"));
        System.out.println(map);

        for (String thing : map.keySet()) {
            System.out.println("Key: " + thing + "\tValue:" + map.get(thing));
        }*/

        List<String> l = new ArrayList<>();
        l.add("2");
        l.add("hello");
        l.add("h");
        l.add("hello");
        l.add("h");
        l.add("h");
        l.add("hello");
        l.add("u");
        l.add("hello");
        l.add("hello");
        l.add("2");
        l.add("mmhmm");
        System.out.println(wordCount(l));

    }
}
