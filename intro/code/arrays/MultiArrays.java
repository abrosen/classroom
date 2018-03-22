package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiArrays {

    public static int numVowels(String[] words){
        int numVowels = 0;

        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
            String ithWord = words[i];
            for(int j = 0; j < ithWord.length(); j++) {
                char letter = ithWord.charAt(j);
                if(letter == 'a' || letter == 'e'|| letter == 'i'|| letter == 'o'|| letter == 'u'){
                    numVowels++;
                }
            }

        }

        return numVowels;
    }


    public static int[][] matrixAdd(int[][] A, int[][] B) {
        if(A.length != B.length  || A[0].length  != B[0].length){
           return null;
        }


        int ROWS = A.length;
        int COLS = A[0].length;
        int[][] C  = new int[ROWS][COLS];

        for(int row = 0; row < ROWS; row++){
            for(int col = 0 ; col< COLS; col++) {
                C[row][col] = A[row][col] + B[row][col];
            }
        }


        return C;
    }


    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        matrix[0][0] = 1;
        matrix[1][1] = 1;
        matrix[1][2] = 5;


        int[][] A =  {
                {0,1,2},
                {3,4,5},
                {6,7,8}
        };

        int[][] B = {
                {1,1,1},
                {1,1,1},
                {1,0,1}};

        int[][] C  = matrixAdd(A,B);
        for(int[] row : C) {
            System.out.println(Arrays.toString(row));
        }
        /*int[][][][][][][][][] iHateMyself;

        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0 ;  col < matrix[row].length ; col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }*/



        /*
        int[] numbers =   {1,5,7,9};
        String[] words =  {"Hello", "World", "!"};
        String string =  "This is a string";
        char[] letters = string.toCharArray();

        System.out.println(numVowels(words));
        */


    }
}
