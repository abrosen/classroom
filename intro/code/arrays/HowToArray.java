package arrays;

import java.util.Arrays;

public class HowToArray {


    //default array values

    public static double[] giveMeDoubles(){
        double[] numbers =  new double[100];
        return numbers;
    }

    //aliasing



    public static int[] giveMeInts() {
        int[] nums = new int[100];
        return  nums;
    }

    public static int sum(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }


        return sum;
    }

    public static double average(int[] nums){

        return sum(nums)*1.0/nums.length;
    }

    // modifying

    // returning


    public static void main(String[] args) {

        // two ways to make

        int x = 5;
        int y = 3;

        int[] arr = {3,50,-7,2,4};

        System.out.println(arr[2]);

        x = arr[3];

        System.out.println(x);

        // change contents
        y = 1000;
        arr[4] = -56;
        arr[3] = y;
        System.out.println(arr[4]);
        System.out.println(arr[3]);

        //Cannot change size
        //arr[12] = 6000;

        //iterating

        String[] words = new String[7];
        words[0] = "a";
        words[1] = "b";
        words[2] = "c";
        words[3] = "d";
        words[4] = "e";
        words[5] = "f";
        words[6] = "g";

        for(int i = 0; i < words.length ; i++ ){
            words[i] = words[i] + i;
            System.out.println(words[i]);

        }

        //printing
        System.out.println(arr);
        System.out.println(words);

        System.out.println(Arrays.toString(arr));



        //for each
        for(String word : words) {
            System.out.println(word);
        }



        // passing into methods
        int[] someNumbers = {7,2,5,1,4};
        //System.out.println(sum(someNumbers));
        //System.out.println(average(someNumbers));

        double[] fromTheMethod = giveMeDoubles();
        int[] fromTheOtherMethod = giveMeInts();
        System.out.println(Arrays.toString(fromTheMethod));
        System.out.println(Arrays.toString(fromTheOtherMethod));

        boolean[] lots = new boolean[100];
        System.out.println(Arrays.toString(lots));
        //aliasing





        //strings to Char Arrays

    }


}
