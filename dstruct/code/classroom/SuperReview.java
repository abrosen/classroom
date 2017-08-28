package classroom;

public class SuperReview {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[10];
		
		
		// index based form;
		for(int  i = 0; i< arr.length; i++) {
			arr[i] = i*i;
		}
		
		// for each loop
		for ( int x : arr) {
			
			System.out.println(x);
			x++;
		}
		for ( int x : arr) {
			
			System.out.println(x);
			
		}
	}

}
