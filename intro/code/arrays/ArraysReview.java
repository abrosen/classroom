package arrays;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysReview {

    // returns the average of the numbers in the array!
    public static double average(double[] nums) {
        return sum(nums)/nums.length;
    }


    // returns the sum of a bunch of doubles
    // [1.0, 1.5, 9.0]
    public static double sum(double[] nums) {
        double sumOfNums = 0.0;
        for(int i = 0; i < nums.length; i++) {
            sumOfNums += nums[i];
        }
        return sumOfNums;
    }


    //  search this array for the largest double
    //  and return it.
    //  [1.0, 5.0, 23.0, 12.0, 6.0]
    public static double max(double[] arr) {
        double biggest = arr[0];
        // for x in arr:
        for(double x : arr) {
            if(x > biggest){
                biggest = x;
            }
        }


        return biggest;
    }


    // hello
    public static char mostCommon(String text) {

        return ' ';
    }



    // [0,1,2,3,4,5]
    // [5,4,3,2,1,0]

    public static void reverse(int[] arr) {


        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] =  arr[arr.length - (1 +i)];
            arr[arr.length - (1+i) ] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }






    public static void main(String[] args) {
        char c =  2932;
        System.out.println(c);
        /*int[] arr= {0,1,2,3};
        System.out.println("Arr in main " + arr);
        reverse(arr);
        System.out.println("Arr in main " + Arrays.toString(arr));
        */
       /* String word  =  "hello!";
        char[] letters =  word.toCharArray();
        System.out.println(Arrays.toString(letters));
        letters[3] = 'p';
        letters[4] = '!';
        System.out.println(Arrays.toString(letters));

        word =  new String(letters);
        System.out.println(word);
        System.out.println("01234567890123456789");
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
        */



        /*int[] arr = new int[10];
        arr[0] = 5;
        arr[3] = 1;
        int x = arr[0];
        //        0      // 13
        arr[ arr[3] ] = x*6+ arr[3];
        System.out.println(Arrays.toString(arr));
        */



    }
}
