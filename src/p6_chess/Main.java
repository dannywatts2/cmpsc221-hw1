package p6_chess;

import java.util.Random;

public class Main {
    static void main() {
        // Initialize RNG
        Random rng = new Random();

        // Set up chess board
        boolean[][] queens = new boolean[8][8];
        queens[rng.nextInt(8)][rng.nextInt(8)] = true;

        printChessBoard(queens);
    }

    private static void printChessBoard(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("Q");
                } else {
                    System.out.print(" ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }
}
