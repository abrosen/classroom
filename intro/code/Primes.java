
public class Primes {

	public static boolean isDivisible(int x , int y) {
		if(x % y  == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static boolean isPrime(int num) {
		for(int i  = 2; i < num; i++) {
			if(   isDivisible(num,i ) ) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(isPrime(548544528));
	}

}
