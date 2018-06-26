package arrays;

import java.util.Arrays;

public class QuizMaker {

    public static void q1(){
        int[] arr = new int[6];
        for(int i = 0; i < arr.length/2; i++) {
            arr[2*i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void q2(){
        int[] arr = new int[100];
        for(int i = arr.length - 1; i >= 0; i--){
            arr[i] = (arr.length - 1) - i;
        }
        //print first and last
        System.out.println(arr[0]  + " " + arr[arr.length -1]);
    }

    public static void main(String[] args) {
        q2();
    }
}
