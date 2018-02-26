package randomness;

import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rand =  new Random();
		/*
		int negatives = 0;
		int positives = 0;
		for(int i = 0; i <100000000;i++) {
			int r =  rand.nextInt();
			//System.out.println(i+"\t"+r);
			if(r > 0) {
				positives++;
			} else if(r<0) {
				negatives++;
			}
		}
		System.out.println(positives + "\t" +negatives);
		*/
		
		// [x,y)
		
		System.out.println(rand.nextInt(20) +1 );
		
		
	}

}
