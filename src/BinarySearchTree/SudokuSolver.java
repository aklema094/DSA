/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinarySearchTree;

/**
 *
 * @author user
 */
public class SudokuSolver {


    // Size of the Sudoku grid
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {
        int[][] board = {
                {7, 0, 0, 0, 0, 0, 2, 0, 0},
                {0, 0, 1, 0, 0, 6, 0, 0, 9},
                {0, 0, 9, 8, 3, 0, 0, 0, 1},
                {8, 5, 0, 0, 0, 2, 0, 0, 4},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {6, 0, 0, 4, 0, 0, 0, 2, 5},
                {1, 0, 0, 0, 6, 5, 4, 0, 0},
                {9, 0, 0, 3, 0, 0, 6, 0, 0},
                {0, 0, 7, 0, 0, 0, 0, 0, 2}
        };

        if (solveBoard(board)) {
            System.out.println("Sudoku solved successfully!");
            printBoard(board);
        } else {
            System.out.println("Unsolvable board.");
        }
    }

    // Solves the Sudoku board using Backtracking
    private static boolean solveBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] == 0) {  // Empty cell
                    for (int num = 1; num <= 9; num++) {
                        if (isValid(board, num, row, col)) {
                            board[row][col] = num;

                            if (solveBoard(board)) {
                                return true; // If the board is solvable
                            }

                            // Backtrack
                            board[row][col] = 0;
                        }
                    }
                    return false; // Trigger backtracking
                }
            }
        }
        return true; // Board solved
    }

    // Checks if placing a number is valid
    private static boolean isValid(int[][] board, int num, int row, int col) {
        // Check the row
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int subgridRow = (row / 3) * 3;
        int subgridCol = (col / 3) * 3;
        for (int i = subgridRow; i < subgridRow + 3; i++) {
            for (int j = subgridCol; j < subgridCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true; // Number can be placed
    }

    // Print the Sudoku board
    private static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("-----------");
            }
            for (int col = 0; col < GRID_SIZE; col++) {
                if (col % 3 == 0 && col != 0) {
                    System.out.print("|");
                }
                System.out.print(board[row][col] == 0 ? " " : board[row][col]);
            }
            System.out.println();
        }
    }
}

    

