package recursionEvening;

import java.util.Arrays;

public class SudokuSolver {


	public static boolean solve(int[][] board, int row, int col) {
		if(col >= 9) {
			row++;
			col = 0;
			
		}
        	if(row >= 9) {
				return true;
        	}

		if(board[row][col] != 0) {
			return solve(board,row, col+1);
		}

		for(int i = 1; i<=9 ;i++ ) {
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
		return colSafe(board,row,col,val) && 
				rowSafe(board,row,col,val) &&
				squareSafe(board,row,col,val) ;
	}	

	private static boolean squareSafe(int[][] board, int row, int col, int val) {
		// TODO Auto-generated method stub
		int rowCorner = row / 3 * 3;
		int colCorner = col / 3 * 3;
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[rowCorner+i][colCorner+j]  == val) {
					return false;
				}
			}
		}
		
		
		return true;
	}

	private static boolean rowSafe(int[][] board, int row, int col, int val) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 9; i++) {
			if(board[row][i] == val) {
				return false;
			}
		}
		
		return true;
	}

	private static boolean colSafe(int[][] board, int row, int col, int val) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 9; i++) {
			if(board[i][col] == val) {
				return false;
			}
		}
		
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
