import java.util.Random;

public class RandomDist {

	public static void main(String[] args) {
		double one = 0;
		double two = 0;
		double  three = 0;
		double four = 0;
		
		Random random = new Random();
		//System.out.println(random.nextInt(4) +1);
		for(int i = 0; i < 100000000; i++) {
			int r  = random.nextInt(4) + 1;
			if(r == 1) {
				one++;
			}
			if(r == 2) {
				two++;
			}
			if(r == 3) {
				three++;
			}
			if(r == 4) {
				four++;
			}
		}
		
		System.out.println(one/100000000);
		System.out.println(two/100000000);
		System.out.println(three/100000000);
		System.out.println(four/100000000);
		
		
		
		
	}

}
