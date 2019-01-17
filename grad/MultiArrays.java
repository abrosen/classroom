import java.util.Arrays;

public class MultiArrays {

    public static int sum5(int[][] arr) {
        int sum = 0;
        /*for(int row = 0; row < arr.length; row++) {


            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] % 5 == 0) {
                    sum+=arr[row][col];
                }
            }
        }*/

        for(int[] row : arr){
            for(int item : row){
                if(item % 5 == 0){
                    sum += 5;
                }
            }
        }

        return sum ;
    }


    public static void main(String[] args) {
        int[][] arr = {{2,5,4}, {2,10,5,7}, {4,3,2}};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(sum5(arr));

    }
}
