
package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        int n = 8; // Change this for different board sizes
        List<List<String>> solutions = solveNQueens(n);
        printSolutions(solutions);
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(0, board, solutions, n);
        return solutions;
    }

    private static void solve(int row, char[][] board, List<List<String>> solutions, int n) {
        if (row == n) {
            solutions.add(constructSolution(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 'Q';
                solve(row + 1, board, solutions, n);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col, int n) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[row][i] == 'Q'|| board[i][col] == 'Q') {
                return false;
            }
        }

        // Check diagonal (top-left)
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check diagonal (top-right)
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    private static List<String> constructSolution(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }

    private static void printSolutions(List<List<String>> solutions) {
        int count = 1;
        for (List<String> solution : solutions) {
            System.out.println("Solution " + count + ":");
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
            count++;
        }
    }
}

