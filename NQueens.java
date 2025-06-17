import java.util.ArrayList;
import java.util.List;
public class NQueens {
    public static void main(String[] args) {
        int n = 4; // Change 'n' for different board sizes
        List<List<Integer>> solutions = solveNQueens(n);
        if (solutions.isEmpty()) {
            System.out.println("No solutions found for N = " + n);
        } else {
            System.out.println("Solutions for N = " + n + ":");
            for (List<Integer> solution : solutions) {
                printBoard(solution, n);
                System.out.println();
            }
        }
    }
    public static List<List<Integer>> solveNQueens(int n) {
        List<List<Integer>> solutions = new ArrayList<>();
        int[] board = new int[n]; // Represents column position of queen in each row
        solveNQueensUtil(board, 0, n, solutions);
        return solutions;
    }
    private static void solveNQueensUtil(int[] board, int row, int n, List<List<Integer>> solutions) {
        if (row == n) {
            // Base case: All queens are placed, add the solution to the list
            solutions.add(convertToSolution(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row] = col;  // Place queen in the current row and column
                solveNQueensUtil(board, row + 1, n, solutions); // Recur for next row
            }
        }
    }
    private static boolean isSafe(int[] board, int row, int col) {
        // Check for conflicts with previously placed queens
        for (int prevRow = 0; prevRow < row; prevRow++) {
            int prevCol = board[prevRow];
            if (prevCol == col || Math.abs(prevCol - col) == Math.abs(prevRow - row)) {
                return false; // Conflict found
            }
        }
        return true; // No conflict
    }
    private static List<Integer> convertToSolution(int[] board) {
        // Convert array representation of board to a list of column positions
        List<Integer> solution = new ArrayList<>();
        for (int col : board) {
            solution.add(col + 1); // 1-indexed positions
        }
        return solution;
    }
    private static void printBoard(List<Integer> solution, int n) {
        // Prints the board configuration from a solution.
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (solution.get(row) == col + 1) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}