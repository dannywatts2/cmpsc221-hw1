package p1_numbering;

import java.util.Scanner;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a space-separated list of integers ending with 0: ");
        int num = scanner.nextInt();

        // Parse input for integers
        int pos = 0;
        int neg = 0;
        int total = 0;
        int count = 0;

        while (num != 0) {
            if (num > 0) {
                pos++;
            } else {
                neg++;
            }
            total += num;
            count++;

            num = scanner.nextInt();
        }

        // Output results to user
        System.out.printf("\nThere are %d positive values in that set.\n", pos);
        System.out.printf("There are %d negative values in that set.\n", neg);
        System.out.printf("The total of the set is %d.\n", total);
        System.out.printf("The average value of the set is %.3f\n", ((float) total) / count);
    }
}
