package arrays;

import java.util.Arrays;

public class Lab7 {

    public static boolean isSorted(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            //System.out.println(arr[i] + " " + arr[i+1]);
            int left  =   arr[i];
            int right = arr[i+1];
            if(left > right) {
                return false;
            }
        }

        return true;
    }

    public static int[] roundAllUp(double[] nums){
        int[] rounded = new int[nums.length];
        for(int i = 0; i <nums.length; i++){
            int roundedUp = (int) Math.ceil(nums[i]);
            rounded[i] = roundedUp;
        }
        return rounded;
    }

    public static void main(String[] args) {
        int[] testSort = {1,2,4,6,5,7};
        System.out.println(isSorted(testSort));

        double[] testRound = {3.0, 1.5, 2.2};
        System.out.println(Arrays.toString(roundAllUp(testRound)));
    }
}
