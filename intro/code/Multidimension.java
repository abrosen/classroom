import java.util.Arrays;

public class Multidimension {


	public static int sum(int[][] arr) {
		int sum = 0;
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[row].length;col++) {
				sum += arr[row][col];
			}
		}


		return sum;
	}

	
	
	public static int sum2(int[][] arr) {
		int sum = 0;
		
		for(int i= 0; i< arr.length; i++) {
			int[] innerArray = arr[i];
			
			for(int j =0; j <innerArray.length; j++) {
				sum += innerArray[j];
			}
		}
		
		
		
		return sum;
	}
	

	public static String biggestString(String[] words) {
		int indexOfBiggest = 0;
		int biggest = 0;
		for(int i = 0; i <words.length; i++) {
			int count = 0;
			for(int letter = 0; letter < words[i].length(); letter++) {
				count++;
			}
			if(count > biggest) {
				biggest = count;
				indexOfBiggest = i;
			}
		}
		return words[indexOfBiggest];
	}
	
	
	public static int sum3(int[][] arr) {
		int sum = 0;
		
		for(int[] row: arr) {
			for(int val : row) {
				sum += val;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = new int[5][2];
		System.out.println(Arrays.deepToString(array));
		
		//System.out.println(sum3(array));

	}



}
