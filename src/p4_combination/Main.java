package p4_combination;

import java.util.Scanner;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number n to find the possible combinations of two numbers of the set from 1 to n: ");
        int n = scanner.nextInt();

        // Calculate and output all combinations and number of combinations
        int count = 0;

        System.out.println("\nPossible combinations of two numbers of the set from 1 to n:");
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.printf("%d %d\n", i, j);
                count++;
            }
        }

        System.out.printf("\nTotal possible combinations: %d\n", count);
    }
}
