import java.util.Random;

public class RandomDist {

	public static void main(String[] args) {
		final int RANGE = 10000;
		
		int[] counts =  new int[RANGE]; 
		
		
		Object[] scanners;
		
		Random random = new Random();
		//System.out.println(random.nextInt(4) +1);
		for(int i = 0; i < 100000000; i++) {
			int r  = random.nextInt(RANGE);
			counts[r] = counts[r] +1;	
			
		}
		
		for(int i = 0 ; i < counts.length; i++) {
			System.out.println("We saw " +  i +" "+ counts[i] +" times.");
		}
		
		
		
		
	}

}
