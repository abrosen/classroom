package eveningReview;

public class SuperReview {

	public static void main(String[] args) {
		
		long l;
		
		double d;
		
		boolean b;
		char c;
		d= 1.1;
		
		String s; 
		s = new String("hello!");
		
		
		
		
		
		System.out.println(.1+.2);
		
		int[] arr = new int[10];
		
		// use this when you care about the index 
		// or whenever
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = i*i;
		}
		
		// only use when you DON'T CARE about the index
		for(int x : arr) {
			System.out.println(x);
		}
		
	}

}
