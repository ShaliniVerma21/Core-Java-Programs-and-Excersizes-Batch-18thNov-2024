package Assignement_3;
//Sudoku Solver 🧩: Solve and generate Sudoku puzzles.

/* sample data
5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 9
 */
import java.util.Scanner;

// Interface for Sudoku Operations
interface SudokuOperations {
    boolean solveSudoku(int[][] board);
    void printBoard(int[][] board);
}

// Abstract class for Puzzle
abstract class Puzzle {
    protected int[][] board;

    public Puzzle(int[][] board) {
        this.board = board;
    }

    public abstract void displayPuzzle();
}

// Concrete class for Sudoku
class Sudoku extends Puzzle implements SudokuOperations {

    public Sudoku(int[][] board) {
        super(board);
    }

    @Override
    public boolean solveSudoku(int[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) { // Find an empty cell
                    for (int num = 1; num <= 9; num++) {
                        if (isSafe(board, row, col, num)) {
                            board[row][col] = num; // Place the number
                            if (solveSudoku(board)) {
                                return true; // Recursively solve
                            }
                            board[row][col] = 0; // Backtrack
                        }
                    }
                    return false; // No valid number found
                }
            }
        }
        return true; // Solved
    }

    private boolean isSafe(int[][] board, int row, int col, int num) {
        // Check row and column
        for (int x = 0; x < 9; x++) {
            if (board[row][x] == num || board[x][col] == num) {
                return false;
            }
        }
        // Check 3x3 box
        int startRow = row - row % 3, startCol = col - col % 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i + startRow][j + startCol] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void printBoard(int[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int d = 0; d < 9; d++) {
                System.out.print(board[r][d] + " ");
            }
            System.out.print("\n");
        }
    }

    @Override
    public void displayPuzzle() {
        System.out.println("Current Sudoku Puzzle:");
        printBoard(board);
    }
}

// Main class
public class demo20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[9][9];

        // Input Sudoku puzzle
        System.out.println("Enter the Sudoku puzzle (0 for empty cells):");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = scanner.nextInt();
            }
        }

        Sudoku sudoku = new Sudoku(board);
        sudoku.displayPuzzle();

        if (sudoku.solveSudoku(board)) {
            System.out.println("Solved Sudoku:");
            sudoku.printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }

        scanner.close();
    }
}