package twod;

public class Practice {

	
	public static int[] biggestOfEachRow(int[][] arr) {
		int[] answer =  new int[arr.length];
		
		for(int row  = 0 ; row < arr.length; row++) {
			
			int biggest = Integer.MIN_VALUE;
			for(int col = 0 ; col < arr[row].length; col++) {
				if(arr[row][col] > biggest ) {
					biggest = arr[row][col];
				}
			}
			/*
			int[] currentRow = arr[row];
			
			for(int col = 0 ; col < currentRow.length; col++) {
				if( currentRow[col] >  biggest){
					biggest =  currentRow[col];
				}
			}*/
			answer[row] =  biggest;
			
		}
		
		
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
