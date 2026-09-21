package p7_array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter a number n to generate an array of n integers that add up to 0.");
        System.out.print("n = ");
        int n = scanner.nextInt();

        // Generate an array of n integers that add up to 0
        int[] zeroSum = new int[] {1, 2, 3, 4, 5};
        // TODO

        // Output result
        System.out.printf("\n%s", Arrays.toString(zeroSum));
    }
}
