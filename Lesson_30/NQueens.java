package Lesson_30;
import java.util.*;
public class NQueens {
    static int N = 4;
    static int[] Ld = new int[30];
    static int[] Rd = new int[30];
    static int[] cl = new int[30];
    static void printSolution(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]);
            System.out.println();
        }
    }
    static boolean solveNQuitil(int[][] board, int col) {
        if (col >= N)
            return true;
        for (int i = 0; i < N; i++) {
            if (Ld[i - col + N - 1] != 1 && Rd[i + col] != 1 && cl[i] != 1) {
                board[i][col] = 1;
                Ld[i - col + N - 1] = 1;
                Rd[i + col] = 1;
                cl[i] = 1;
                if (solveNQuitil(board, col + 1))
                    return true;
                board[i][col] = 0;
                Ld[i - col + N - 1] = 0;
                Rd[i + col] = 0;
                cl[i] = 0;
            }
        }
        return false;
    }
    static boolean solveNQ() {
        int[][] board = new int[N][N]; 
        if (!solveNQuitil(board, 0)) {
            System.out.println("Solution does not exist");
            return false;
        }
        printSolution(board);
        return true;
    }

    public static void main(String[] args) {
        solveNQ();
    }
}