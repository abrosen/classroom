package hashEvening;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Sets {

    public static boolean areUnique(String word) {
        Set<Character> seenCharacters  = new HashSet<Character>();

        for(char c  : word.toCharArray()) {
            if(seenCharacters.add(c) == false){
                return false;
            }
        }

        return true;
    }

    public static String mostCommonString(String[] words) {
        Map<String, Integer> map = new HashMap<>();

        for(String word : words) {
            if(map.containsKey(word)){
                int timesSeen = map.get(word);
                map.put(word, timesSeen +1);
            } else {
                map.put(word, 1);
            }
        }
        String mostSeenWord = "";
        int mostTimesSeen = 0;

        for(String word  : map.keySet()) {
            if(map.get(word) > mostTimesSeen){
                mostSeenWord = word;
                mostTimesSeen = map.get(word);
            }
        }
        return mostSeenWord;
    }



    public static void main(String[] args) {
        /*Set<String>  set  = new HashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("foo");
        set.add("bar");
        set.add("baz");
        set.add("wibble");
        set.add("wobble");

        System.out.println(set);

        for (String word : set) {
            System.out.println(word);
        }*/


        Map<String,Integer> map =  new HashMap<String, Integer>();
        map.put("hello", 0);
        map.put("world", 1);
        System.out.println(map);

        String[] words = {"apple","hello","banana","hello","banana","hello","banana","hello","banana","hello","banana","world","banana","world","banana","world","banana","world"};
        System.out.println(mostCommonString(words));

        Object o = new Object();
        System.out.println(o);
        System.out.println(o.hashCode());



    }
}
