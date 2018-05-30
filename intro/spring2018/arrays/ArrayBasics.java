package arrays;

import java.util.Arrays;

public class ArrayBasics {
	
	
	
	public static void twiceTheIndex(int[] arr) {
		
		for(int i = 0 ; i < arr.length; i++) {
			arr[i] = 2*i;
		}
		
	}
	
	public static void tweak(int[] arr, int x) {
		System.out.println(arr);
		arr[0]++;
		x++;
	}
	
	public static int[] createNewArray(int length) {
		return new int[length];
	}
	
	
	public static void main(String[] args) {
		
		
		int[] nums;
		nums= new int[5];
		System.out.println(nums);
		int a = 3;
		tweak(nums,3);

		//
		//for(int i = 0; i < nums.length; i++) {
		//	System.out.println(nums[i]);
		//}
		
		
		System.out.println(nums[0]);
		System.out.println(a);
		
		//System.out.println(Arrays.toString(nums));
		
		int[] newArray  = {4,5,6,1,2};
		
	}

}
