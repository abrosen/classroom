package arrays;

import java.util.Arrays;
import java.util.Stack;

public class QuizPractice {
    public static void main(String[] args) {
        Stack<String> s = new Stack();
        int[] A = {3, 6,1, 2};
        int[] B = {1,-1,1,-1};
        int[] C = new int[4];



        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] * B[i];
            System.out.println(i+ "\t"+ A[i]+"*"+B[i]);
        }
        System.out.println(Arrays.toString(C));

    }
}
