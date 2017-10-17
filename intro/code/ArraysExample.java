import java.util.Arrays;

public class ArraysExample {

	
	public static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for(int i = 0; i< a.length;i++) {
			c[i] = a[i];
		}
		for(int i = 0; i< b.length;i++) {
			c[a.length + i]= b[i];
		}
		
		
		return c;
	}
	
	
	public static int sum(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		
		return sum;
	}
	
	
	
	
	
	public static void incrementAll(int[] array) {
		for(int i = 0; i < array.length; i++ ) {
			array[i]++;
		}
	}
	
	public static void increment(int x) {
		x++;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// [5, 4, 3, 2, 1] 
		//  0  1  2  3  4

		
		
		int[] a1 = {42, -7, 1, 15};
		int[] a2 = {42, -7, 1, 15};
		System.out.println(sum(a1));
		incrementAll(a1);
		
		System.out.println(sum(a1));
		int num = 5;
		increment(num);
		System.out.println(num);
		/*int[] a3 = a1;
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1==a3);
		*/
		
		int[] array = {5,4,3,2,1};
		//array[5]   = 6;
		
		
		double[] nums = new double[10];
		
		
		System.out.println(Arrays.toString(array));
		
		
		for(int i =0 ; i < nums.length ; i++) {
			nums[i] = Math.pow(2, i);
		}
		
		System.out.println(Arrays.toString(nums));
		
		int[] x = {1,2,3,4,5,6};
		int[] y = {100,200,300,12};
		System.out.println(Arrays.toString(merge(x,y)) );
	
	}

}
