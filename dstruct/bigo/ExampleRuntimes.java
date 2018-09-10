package bigo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ExampleRuntimes {

    public static int howBig(List<?> list){
        return list.size();
    }

    public static <E> boolean in(List<E> list, E item) {
        for (E thing: list) {

            for(int i = 0; i < 1000; i++) {
                System.out.print("");
            }
            if(item.equals(thing)){
                return true;
            }
        }
        return false;
    }


    public static <E extends Comparable<E>> void sort(List<E> list){
        // (n-1)*(n-1) = n^2 - 2n + 1
        //  =  (10^12) - 2*10^6 + 1
        //        10000000
        // 100000000000000
        // O(n^2)

        for (int runs = 0; runs < list.size() - 1; runs++) {
            for (int i = 0; i < list.size() - (1  + runs); i++) {
                E left = list.get(i);
                E right = list.get(i + 1);
                if (left.compareTo(right) > 0) {
                    list.set(i, right);
                    list.set(i + 1, left);
                }
            }
        }

    }


    public static void main(String[] args) {



        List<Integer>  list = new LinkedList<>();
        Random rand =  new Random();


        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++) {
            list.add(0,rand.nextInt());
        }
        long end  = System.currentTimeMillis();
        System.out.println(end - start);

    }

}
