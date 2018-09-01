package arraylists;

import java.util.ArrayList;
import java.util.List;

public class WhatIsAnArrayList {

    public static void main(String[] args) {
        /*
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("hi");

        for(int i = 0; i <list.size(); i++){
            System.out.println(list.get(i));
        }

        for(String word : list) {
            System.out.println(word);
        }
        */



        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(50);
        list.add(5);
        list.add(1);
        // .... code
        // more code


        //list.add("hello");

        int sum = 0;
        for(int i =0; i < list.size(); i++){
            int value = list.get(i);
            sum += value;
        }
        System.out.println(sum);

    }
}
