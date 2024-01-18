package arrays;

import java.util.Arrays;

public class ArrayMethods {



    // [0, 4, 8]
    // [1, 3, -1]
    // [0, 1, 4, 3, 8, -1]
    public static int[] interweave(int[] A, int[] B) {
        if(A.length != B.length) {
            return null;
        }
        int[] C = new int[A.length + B.length];
        for (int i = 0; i < A.length && i < B.length; i++){
            C[2*i]    = A[i];
            C[(2*i) + 1]  = B[i];


        }


        return C;
    }





    public static void main(String[] args) {

        int[] A = {0,2,4};
        int[] B = {1,3,5};
        System.out.println(Arrays.toString(interweave(A,B))) ;
    }
}
