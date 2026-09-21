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

    // Implements insertion sort
    private static String sort(String input) {
        int numChars = input.length();
        String sorted = "";

        for (int i = 0; i < numChars; i++) {
            int smallest = 0;
            for (int j = 1; j < input.length(); j++) {
                if (input.charAt(j) < input.charAt(smallest)) {
                    smallest = j;
                }
            }
            sorted += input.charAt(smallest);
            input = input.substring(0, smallest) + input.substring(smallest + 1);
        }

        return sorted;
    }
}
