package arrays;

import java.util.Arrays;

public class Sorting {


    // swaps the two items at arr[i] and arr[j]
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void selectionSort(int[] arr) {
        for(int index = 0; index< arr.length; index++) {

            int smallestVal = arr[index];
            int indexOfSmallest  = index;
            for(int i = index; i < arr.length; i++) {
                int num = arr[i];
                if(num < smallestVal) {
                    smallestVal = num;
                    indexOfSmallest = i;
                }
            }

            swap(arr,index,indexOfSmallest);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,8,3,6,5,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
