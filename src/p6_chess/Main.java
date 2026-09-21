package p6_chess;

import java.util.Random;

public class Main {
    static void main() {
        // Repeatedly generate chess board until a valid one is generated
        boolean[][] queens = createChessBoard();
        while (numQueens(queens) != 8) {
            queens = createChessBoard();
        }

        // Output result to user
        printChessBoard(queens);
    }

    private static boolean[][] createChessBoard() {
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
                        // 1. Determine places in diagonal above and below current element
                        // 2. Iterate through those places, checking whether there is a queen
                        int placesAbove = Math.min(j, k);
                        int placesBelow = Math.min(7 - j, 7 - k);
                        for (int l = 1; l <= placesAbove; l++) {
                            if (queens[j - l][k - l]) {
                                placeable = false;
                                break;
                            }
                        }
                        for (int l = 1; l <= placesBelow; l++) {
                            if (queens[j + l][k + l]) {
                                placeable = false;
                                break;
                            }
                        }

                        // Check for queens in the secondary diagonal
                        placesAbove = Math.min(j, 7 - k);
                        placesBelow = Math.min(7 - j, k);
                        // System.out.printf("j = %d, k = %d, placesAbove = %d, placesBelow = %d\n", j, k, placesAbove, placesBelow);
                        for (int l = 1; l <= placesAbove; l++) {
                            if (queens[j - l][k + l]) {
                                placeable = false;
                                break;
                            }
                        }
                        for (int l = 1; l <= placesBelow; l++) {
                            if (queens[j + l][k - l]) {
                                placeable = false;
                                break;
                            }
                        }

                        if (placeable) {
                            queens[j][k] = true;
                            break outer;
                        }
                    }
                }
            }
        }

        return queens;
    }

    private static int numQueens(boolean[][] board) {
        int count = 0;

        for (boolean[] row: board) {
            for (boolean place: row) {
                if (place) {
                    count++;
                }
            }
        }

        return count;
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
