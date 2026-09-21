package p7_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main() {
        // Initialize scanner and random number generator
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();

        // Get user input
        System.out.println("Enter a number n to generate an array of n integers that add up to 0.");
        System.out.print("n = ");
        int n = scanner.nextInt();

        // Generate an array of n integers that add up to 0
        // Algorithm:
        // 1. Add a random number to the array
        // 2. Add the negative of the first number to the array
        // 3. Split index 1 into two numbers that add up to its value and store them in indexes 1 and 2
        // 4. Repeat this until we reach the final index.
        // This assumes n >= 2.
        int[] zeroSum = new int[n];
        /*for (int i = 0; i < n; i++) {
            zeroSum[i] = rng.nextInt();
        }*/
        zeroSum[0] = rng.nextInt();
        zeroSum[1] = -zeroSum[0];

        for (int i = 1; i < n - 1; i++) {
            int num = zeroSum[i];
            zeroSum[i] = rng.nextInt();
            zeroSum[i + 1] = num - zeroSum[i];
        }

        // Verify result
        int total = 0;
        for (int i: zeroSum) {
            total += i;
        }
        System.out.println(total);

        // Output result
        System.out.printf("\n%s", Arrays.toString(zeroSum));
    }
}
