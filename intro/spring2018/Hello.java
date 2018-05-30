import java.util.Arrays;

public class Hello {  // creates a program called Hello, stored in Hello.java
	
	
	
	/*public static int eul1() {
		int sum = 0;
		for(int i = 1; i< 1000; i++) {
			if(i % 3 ==0 || i % 5 ==0) {

				sum += i;
			}
		}
		return sum;
	}*/
	
	public static void main(String[] args) {  // The main method


		int[][] arr = new int[5][];





		arr[0] = new int[2];
		arr[1] = new int[6];
		arr[2] = arr[0];
		arr[2][1] = 5;
		arr[3] = new int[1];
		System.out.println(Arrays.deepToString(arr));


		// Timmy went out of his house and went to the 
	    // the store for bread.
		//System.out.println("Juliet: \n\t\"Romeo, Romeo, wherefore art thou Romeo\"?");
		
		//System.out.println(eul1());  // a print statement
	}
}
