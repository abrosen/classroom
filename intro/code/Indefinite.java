
public class Indefinite {

	public static void printNumbers(int max) {
		
		for(int i = 1 ; i < max; i++) {
			System.out.print( i + ", " );
		}
		System.out.println(max);
		
	}
	
	
	public static void printPrimes(int max) {
		if(max < 2) {
			return;
		}
		
		System.out.print(2);
		for(int i = 3; i <= max; i++) {
			if(isPrime(i)) {
				System.out.print(", " + i );
			}
			
		}
		
	}
	
	
	public static boolean isPrime(int num) {
		for(int i  = 2; i < num; i++) {
			if( num % i == 0 ) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPrimes(100);
	}

}
