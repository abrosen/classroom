package recursion;


import java.util.Arrays;

public class EightQueens {


    public static boolean isValid(int[][] board, int row, int col) {
        if (!isRowValid(board, row, col)) {
            return false;
        }


        return true;
    }


    public static boolean isRowValid(int[][] board, int row, int col) {
        for (int i = 1; col - i >= 0; i++) {
            if (board[row][col - i] == 1) {
                return false;
            }
        }

        return true;
    }

    public static boolean solve(int[][] board, int col) {
        if (col >= board.length) {
            return true;
        }

        for (int row = 0; row < board.length; row++) {
            if (isValid(board, row, col)) {
                board[row][col] =1;
                if (solve(board, col + 1) == true) {
                    return true;
                }
                board[row][col] =0;
            }
        }
        return false; // backtrack
    }


    public static void main(String[] args) {

        int[][] board = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}
        };

        solve(board,0);
        for (int[] row: board) {
            System.out.println(Arrays.toString(row));
        }
    }


}
