import java.util.Arrays;

public class ArrayMethods2 {

    public static void intToZero(int x ){
        x = 0;
    }

    public static void evenToZero(int[] arr) {
        int[] otherArray = {1,2,3,4,5,6,7,8,9};
        arr = otherArray;


        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                arr[i] = 0;
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int x =  100;
        intToZero(x);
        System.out.println(x);  // still 100.


        System.out.println(arr);
        evenToZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
