package arrays;

import java.util.Arrays;

public class Aliasing {

    public static void someMethod(int a) {
        a++;
        //stop here
    }

    public static void makeArrayNegative(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0 ){
                arr[i]  = arr[i] * -1;
            }
        }
    }

    public static void main(String[] args) {
        //int x = 5;
        //int y = 13;
        //int z = y;
        //someMethod(x);

        int[] arr = new int[2];
        System.out.println(arr);
        arr[0] = 10;
        arr[1] = 20;
        makeArrayNegative(arr);
        System.out.println(Arrays.toString(arr));
        /*int[] brr = arr;
        System.out.println(brr);
        brr[0] = -5000;
        System.out.println(arr[0]);
        */



    }
}
