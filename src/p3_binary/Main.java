package p3_binary;

import java.util.Scanner;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter an integer to convert to binary: ");
        int num = scanner.nextInt();
        int remaining = num;

        // Convert integer to binary string
        String bin = "";
        while (remaining > 0) {
            bin = (remaining % 2) + bin;
            remaining /= 2;
        }

        // Output result to user
        System.out.printf("\n%d₁₀ = %s₂", num, bin);
    }
}
