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
            // Check board for blank spot that has no queens in its row, column, and diagonals
            outer: for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    if (!queens[j][k]) {
                        boolean placeable = true;

                        // Check if there are any queens in its row
                        for (int l = 0; l < 8; l++) {
                            if (queens[j][l]) {
                                placeable = false;
                                break;
                            }
                        }

                        // Check if there are any queens in its column
                        for (int l = 0; l < 8; l++) {
                            if (queens[l][k]) {
                                placeable = false;
                                break;
                            }
                        }

                        // Check for queens in the main diagonal
                        // TODO

                        // Check for queens in the secondary diagonal
                        // TODO

                        if (placeable) {
                            queens[j][k] = true;
                            break outer;
                        }
                    }
                }
            }
        }

        // Output result to user
        printChessBoard(queens);
    }

    private static void printChessBoard(boolean[][] board) {
        for (boolean[] booleans : board) {
            System.out.print("|");
            for (boolean aBoolean : booleans) {
                if (aBoolean) {
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
