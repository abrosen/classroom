import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [5, 4, 3, 2, 1]
		//  0  1  2  3  4

		int[] array = {5,4,3,2,1};
		double[] nums = new double[1000000];
		
		for(int i =0 ; i < nums.length ; i++) {
			nums[i] = Math.pow(2, i);
		}
		
		System.out.println(Arrays.toString(nums));
	
	}

}
