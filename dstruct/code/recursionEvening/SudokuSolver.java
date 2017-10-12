package recursionEvening;

import java.util.Arrays;

public class SudokuSolver {
	
	
	public static boolean solve(int[][] board, int row, int col) {
		if(col >= 9) {
			row++;
			col = 0;
			if(row >= 9) {
				return true;
			}
		}
		
		if(board[row][col] != 0) {
			return solve(board,row, col+1);
		}
		
		for(int i = 1; i<=9;i++ ) {
			if(canPlace(board,row,col,i)) {
				board[row][col] = i;
				if(solve(board,row,col+1)) {
					return true;
				}
			}
			
		}
		
		board[row][col] = 0;
		return false;
	}

	private static boolean canPlace(int[][] board, int row, int col, int val) {
		// TODO Auto-generated method stub
		return true;
	}

	public static void main(String[] args) {
		
		int[][] puzzle ={
				{8,0,0,0,0,0,0,0,0},
				{0,0,3,6,0,0,0,0,0}, 
				{0,7,0,0,9,0,2,0,0}, 
				{0,5,0,0,0,7,0,0,0}, 
				{0,0,0,0,4,5,7,0,0}, 
				{0,0,0,1,0,0,0,3,0}, 
				{0,0,1,0,0,0,0,6,8}, 
				{0,0,8,5,0,0,0,1,0}, 
				{0,9,0,0,0,0,4,0,0},
				
		};
		
		solve(puzzle, 0,0);
		for(int[] row : puzzle) {
			System.out.println(Arrays.toString(row));
		}

	}

}
