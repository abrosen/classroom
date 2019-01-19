package arrays;

import java.util.Arrays;

public class MultiArray {


    // counts the number of words ending with s
    public static int numPlurals(String[] words){
        int count = 0;
        for(int i = 0; i < words.length; i++){
            String word = words[i];
            if(word.charAt(word.length() - 1)  == 's'){
                count++;
            }
        }
        return count;
    }

    // counts the number of arrays of numbers where the last number ends in 5
    public static int numEndsWith5(int[][] arr){
        int count = 0;
        for (int row = 0; row < arr.length; row++) {
            int[] arrOfNums = arr[row];
            if (arrOfNums[arr.length - 1] == 5) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        String[] words = {"aardvarks", "anteaters", "pens","foo"};
        System.out.println(numPlurals(words));

        int[] nums = {1,2,3,4,5};
        int[][] A =    {{0,1,2},
                        {3,4,5},
                        {6,7,8}};

        int[][] B = new int[5][4];
        for(int row =0; row <B.length; row++){

            for(int col = 0 ; col < B[col].length; col++) {
                B[row][col] = row;

            }


        }

    }

}
