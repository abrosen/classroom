import java.util.*;

public class UniqueWithSets {

    public static <E> boolean allUnique(List<E> list){
        Set<E> set =  new HashSet<E>();
        for(E item : list){
            if(set.add(item) == false){
                return false;
            }
        }


        return true;
    }

    public static char mostCommonCharacter(String text){
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c : text.toCharArray()){
            if(!charCount.containsKey(c)){
                charCount.put(c, 1);
            } else {
                int count = charCount.get(c);
                charCount.put(c,  count +1);
            }
        }

        char mostCommon = '~';
        int mostCount = -1;

        for(char c : charCount.keySet()){
            if(charCount.get(c) > mostCount) {
                mostCommon = c;
                mostCount = charCount.get(c);
            }
        }
        return mostCommon;

    }


    public static void main(String[] args) {

    }
}
