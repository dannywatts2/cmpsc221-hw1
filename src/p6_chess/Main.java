package p6_chess;

import java.util.Random;

public class Main {
    static void main() {
        // Initialize RNG
        Random rng = new Random();

        // Create chess board
        boolean[][] queens = new boolean[8][8];

        // Add first queen in a random location
        queens[rng.nextInt(8)][rng.nextInt(8)] = true;

        // Add rest of queens
        for (int i = 0; i < 7; i++) {
            boolean placed = false;
            int j = 0;
            int k = 0;

            while (!placed) {
                if (!queens[j][k]) {
                    queens[j][k] = true;
                    placed = true;
                } else {
                    k++;
                    if (k >= 8) {
                        k = 0;
                        j++;
                    }
                    if (j >= 8) {
                        System.out.println("ERROR");
                    }
                }
            }
        }

        // Output result to user
        printChessBoard(queens);
    }

    private static void printChessBoard(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
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
