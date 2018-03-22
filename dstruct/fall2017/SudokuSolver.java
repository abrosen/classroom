import java.util.Arrays;

public class SudokuSolver {

	public static void solve(int[][] puzzle) {
		solve(puzzle, 0, 0);
		
	}
	
	public static boolean solve(int[][] puzzle, int row, int col) {
		if(col >= 9) {
			col = 0;
			row++;
			if(row >= 9) {
				return true;
			}
		}
		
		if(puzzle[row][col] != 0) {
			return solve(puzzle, row, col +1);
		}
		
		for(int val = 1;  val <= 9; val++) {
			if(canPlace(puzzle, row, col, val)) {
				puzzle[row][col] = val;
				System.out.println(row + "\t" + col +"\t"+ val);
				if(solve(puzzle, row, col+1)) {
					return true;
				}
			}
			
		}
		
		puzzle[row][col] = 0;
		return false;
	}
	
	private static boolean canPlace(int[][] puzzle, int row, int col, int val) {
		return 	(checkRow(puzzle,row,col,val) &&  
				checkCol(puzzle,row,col,val) && 
				checkSquare(puzzle,row,col,val));  
	}

	private static boolean checkSquare(int[][] puzzle, int row, int col, int val) {
		// TODO Auto-generated method stub
		int rowCorner = row /3 * 3;
		int colCorner = col /3 * 3;
		for(int i=0; i< 3;i++) {
			for(int j =0; j<3; j++) {
				if(puzzle[rowCorner+i][colCorner+j] == val) {
					return false;
				}
			}
		}
		
		return true;
	}

	private static boolean checkCol(int[][] puzzle, int row, int col, int val) {
		// TODO Auto-generated method stub
		for(int i = 0; i < puzzle.length; i++) {
			if(puzzle[i][col] == val) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkRow(int[][] puzzle, int row, int col, int val) {
		// TODO Auto-generated method stub
		for(int i = 0; i < puzzle.length; i++) {
			if(puzzle[row][i] == val) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] puzzle ={
                {0,0,0,9,0,0,0,0,2},
                {0,5,0,1,2,3,4,0,0},
                {0,3,0,0,0,0,1,6,0},
                {9,0,8,0,0,0,0,0,0},
                {0,7,0,0,0,0,0,9,0},
                {0,0,0,0,0,0,2,0,5},
                {0,9,1,0,0,0,0,5,0},
                {0,0,7,4,3,9,0,2,0},
                {4,0,0,0,0,7,0,0,0}
				
		};
		
		solve(puzzle);
		for(int[] row : puzzle) { 
			System.out.println(Arrays.toString(row));
		}
		
	}

	

}
