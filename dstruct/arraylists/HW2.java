package arraylists;

import java.util.ArrayList;
import java.util.List;

public class HW2 {
    public static <T> boolean in(List<T> list, T item) {
        for (T thing : list) {
            if (thing.equals(item)) {
                return true;
            }
        }

        return false;
    }

    public static int sum(List<Integer> list) {
        return -1;
    }

    public static List<Integer> makeMeAList() {

        return new ArrayList<Integer>();
    }

}







