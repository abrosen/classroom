package chap5;

public class Fencepost {

	
	public static boolean isPrime(int n) {
		

		for(int i = 2; i < n ; i++) {
			if(n % i ==0 ) {
				return false;
			}
		}
		
		
		
		return true;
	}
	
	
	public static void printPrimes(int n) {
	
		System.out.print(2);

		for(int i = 3; i <=n ; i++) {
			if(isPrime(i)) {
				System.out.print( ", "+ i);		
			}
		}
	}
	
	
	public static void printNumbers(int n) {
		
		
		for(int i = 1; i <n ; i++) {
			System.out.print(i + ", ");
		
		}
		
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printPrimes(1000);
	}

}
