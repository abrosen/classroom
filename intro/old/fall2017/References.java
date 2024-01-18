import java.util.Arrays;

public class References {

	public static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}
	
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		/*int a = 7;
		int b = 35;
		int c = b;
		c++;
		
		System.out.println(a + "\t" + b);

		swap(a,b);
		System.out.println(a + "\t" + b);
		*/
		
		
		System.out.println( (int) 'a');
		int[] arr = {1,2,'a',4,5};
		int[] arr2; 
		arr2 = arr;
		arr2[2] = 'b';
		
		swap(arr,4,0);
		System.out.println(Arrays.toString(arr));
		System.out.println((char) 97);
	}	

}
