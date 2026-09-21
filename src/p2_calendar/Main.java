package p2_calendar;

import java.util.Scanner;

public class Main {
    static void main() {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the day of the week as a number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");
        int dayOfWeek = scanner.nextInt() - 1;

        // Account for leap years
        int[] daysPerMonth = new int[] {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 4 == 0 && year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            daysPerMonth[1] = 29;
        } else {
            daysPerMonth[1] = 28;
        }

        // Calculate days of the week of the first day of each month of the year the user input and output result
        String[] daysOfWeek = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] months = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int daysFromJan1 = 0;
        System.out.println();
        for (int i = 0; i < 12; i++) {
            System.out.printf("%s 1 is a %s.\n", months[i], daysOfWeek[(dayOfWeek + daysFromJan1) % 7]);
            daysFromJan1 += daysPerMonth[i];
        }
    }
}
