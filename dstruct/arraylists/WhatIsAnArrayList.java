package arraylists;

public class WhatIsAnArrayList {

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 100;
        }

        arr[100]  = 100;


    }
}
