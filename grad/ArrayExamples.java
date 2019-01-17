import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {
        int[] arr = {3,9,57,8,2,2,4};

        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] == arr[i-1]  || arr[i] == arr[i+1]) {
                System.out.println("match found\tindex "  +  i );
            }

        }


    }
}
