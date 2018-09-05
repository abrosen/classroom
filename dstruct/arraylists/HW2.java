package arraylists;

import java.util.ArrayList;
import java.util.List;

public class HW2 {

    public static <E>  boolean in( List<E> list, E item ){
        for(E element : list) {
            if(item.equals(element)){
                return true;
            }
        }
        return false;
    }


    public static int sum(List<Integer> list){
        return -1;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        boolean b = in(list, 4);
        sum(list);

    }

}







