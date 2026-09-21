package p5_sorting;

import java.util.Scanner;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string to sort: ");
        String unsorted = scanner.nextLine();

        // Sort string
        String sorted = sort(unsorted);

        // Output result to user
        System.out.printf("\nThat string sorted is \"%s\"", sorted);
    }

    private static String sort(String input) {
        return input;
    }
}
