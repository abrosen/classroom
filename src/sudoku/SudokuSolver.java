package sudoku;

import java.util.Arrays;

public class SudokuSolver {



	
	public static void solve(int[][] board) {
		solve(board,0,0);
	}

	/* recursive method
	 * attempts to solve a sudoku puzzle one square at a time,
	 * going thru each row from left to right.
	 * Each call to the method attempts to find a solution for board[row][col]
	 * it assumes that each previous square has been correctly filled
	 * 
	 * If a solution is found for board[row][col], 
	 * we call solve on board[row][col+1], wrapping to next row when necessary
	 * 
	 * If no solution is found or our solution causes a dead end, we try another number
	 * if we are out of numbers, we ARE the dead end and return false;
	 */
	private static boolean solve(int[][] board, int row, int col) {
		if(col >= board.length) { //wrap around 
			col = 0;
			row++;
			if(row >= board.length) {  // base case
				return true;
			}
		}
		if(board[row][col] != 0 ) { // skip
			return solve(board, row, col+1);
		} 


		for(int i = 1; i <= 9; i++) {
			if(canPlace(board, row, col, i)) {
				board[row][col] = i;
				if(solve(board, row, col+1) == true) { // if all the stuff after us returns true
					return true;  // done
				} //else we try a different num
			}
		}

		board[row][col]= 0;
		return false; // backtrack;


	}




	private static boolean canPlace(int[][] board, int row, int col, int val) {
		return colSafe(board, row,col,val) &&  rowSafe(board, row, col, val) && squareSafe(board,row,col, val);
	}






	private static boolean colSafe(int[][] board, int row, int col, int val) {
		// TODO Auto-generated method stub
		for(int  i =  0; i <board.length; i++) {
			if(board[i][col] == val) {
				return false;
			}
		}


		return true;
	}




	private static boolean squareSafe(int[][] board, int row, int col, int val) {
		// TODO Auto-generated method stub
		// figure out the top left corner of the square we want to check
		// options are 00 03 06 30 33 36 60 63 66
		int cornerRow =  (row / 3) * 3;
		int cornerCol =  (col / 3) * 3;

		//System.out.println(cornerRow + "\t" + cornerCol);
		for(int i = 0; i < 3; i++ ) {
			for(int j = 0 ; j < 3; j++ ) {
				
				if(board[cornerRow+i][cornerCol+j]  == val) {
					return false;
				}
			}
		}

		return true;
	}




	private static boolean rowSafe(int[][] board, int row, int col, int val) {
		// TODO Auto-generated method stub
		for(int  i =  0; i <board.length; i++) {
			if(board[row][i] == val) {
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
		
		solve(puzzle);
		for(int[] row : puzzle) {
			System.out.println(Arrays.toString(row));
		}
	}

}
