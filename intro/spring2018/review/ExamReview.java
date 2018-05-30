package review;

public class ExamReview {

	
	// "hello" -> "h, e, l, l, o"
	// "one two!" -> "o, n, e, , t, w, o, !"
	// "a" -> "a"
	public static String eachChar(String str) {
		String output = "";
		
		
		
		for(int i = 0; i < str.length() -1 ; i++) {
			char c = str.charAt(i);
			output = output + c +", ";

		}
		
		output = output + str.charAt(  str.length() -1);
		
		
		
		return output;
		
	}
	
	
	
	
	// n = 3 will return the integer 18 because 3 + 6 + 9 = 18
	// n = 5 will return the integer 45 because 3 + 6 + 9 + 12 + 15 = 45
	// n = -1 will return 0
	public static int sumOfThrees(int n) {
		int sum  = 0 ;
		
		
		for(int i = 1; i <= n; i++) {
			int mult = i*3;
			sum = sum +mult;
		}
		
		return sum;
	}
	
	public static int numDigits(int n) {
		int num = 0;
		while(n> 0) {
			num++;
			n = n /10;
		}
		
		return num;
	}
	
	
	public static void properFactors(int n) {
	
		for(int i = 1; i  < n ; n++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
	}
	
	public static void euler2() {
		int minus1 = 1;
		int minus2 = 1;
		int newFib;
		long sum = 0;
		
		while(minus1 < 4000000) {
			newFib = minus1 +minus2;
			if(newFib %2 ==0) {
				System.out.println(newFib);
				sum += newFib;
			}
			minus2 = minus1;
			minus1 = newFib;
		}
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(4 != 4.0);
		int x =3;
		int y =3;
		
		if( (x % 2==0 && y%2 == 1) || (y%2==0  && x%2==1)   ) {
			
		}
		
		for(int i =0; i <5; i++) {
			for(int num = 10 - (i*2); num > 0; num-=2) {
				System.out.print(num+" ");
			}
			System.out.println();
			
		}
		
		
		/*  i = 
		 *  j = 
		 *  0 
		 *  1 2 
		 *  2 3 4
		 *  
		 *  
		 *  
		 *  foo
		 *  foo
		 *  bar
		 *  baz
		 *  foo
		 *  baz
		 *  foo
		 */
		euler2();
		
	}

}
