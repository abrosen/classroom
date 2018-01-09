
public class Euler1 {

	
	public static int euler1(int limit) {
		
		// [1,1000)
		int sum = 0;
		for(int i = 1; i < limit; i++ ) {
			if(i % 3 == 0  || i % 5 == 0) {
				sum += i;
			}
		}
		
		return sum;
	}
	
	
	public static int max(int a, int b) {
	    if (a > b) {
	        return a;
	    } else {
	        return b;
	    }
	    
	}

	
	public static int quadrant(double x, double y) {
		if(x == 0 || y == 0) {
			return 0;
		} else if(x > 0 && y > 0) {
			return 1;
		} else if(x < 0 && y > 0) {
			return 2;
		} else if(x < 0 && y < 0) {
			return 3;
		} else {
			return 4;
		}
		
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// modulo tricks
		// x % 2 == 0  for even odd testing
		// x % 10 gets last digit of x
		// x % y == 0 : true means x is multiple of y ( is divisible by y)
		
		int answer = quadrant(0,-3);
		System.out.println(answer);
	}

}
