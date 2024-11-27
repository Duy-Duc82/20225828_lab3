import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DaysInMonth {
    // Map for month names and their corresponding numbers
    private static final Map<String, Integer> monthMap = new HashMap<>();
    private static final int[] daysInCommonYear = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] daysInLeapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static {
        // Fill the month map with all valid month representations
        monthMap.put("january", 1);
        monthMap.put("jan", 1);
        monthMap.put("jan.", 1);
        monthMap.put("1", 1);
        monthMap.put("february", 2);
        monthMap.put("feb", 2);
        monthMap.put("feb.", 2);
        monthMap.put("2", 2);
        monthMap.put("march", 3);
        monthMap.put("mar", 3);
        monthMap.put("mar.", 3);
        monthMap.put("3", 3);
        monthMap.put("april", 4);
        monthMap.put("apr", 4);
        monthMap.put("apr.", 4);
        monthMap.put("4", 4);
        monthMap.put("may", 5);
        monthMap.put("5", 5);
        monthMap.put("june", 6);
        monthMap.put("jun", 6);
        monthMap.put("jun.", 6);
        monthMap.put("6", 6);
        monthMap.put("july", 7);
        monthMap.put("jul", 7);
        monthMap.put("jul.", 7);
        monthMap.put("7", 7);
        monthMap.put("august", 8);
        monthMap.put("aug", 8);
        monthMap.put("aug.", 8);
        monthMap.put("8", 8);
        monthMap.put("september", 9);
        monthMap.put("sep", 9);
        monthMap.put("sep.", 9);
        monthMap.put("9", 9);
        monthMap.put("october", 10);
        monthMap.put("oct", 10);
        monthMap.put("oct.", 10);
        monthMap.put("10", 10);
        monthMap.put("november", 11);
        monthMap.put("nov", 11);
        monthMap.put("nov.", 11);
        monthMap.put("11", 11);
        monthMap.put("december", 12);
        monthMap.put("dec", 12);
        monthMap.put("dec.", 12);
        monthMap.put("12", 12);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Get month input from user
            System.out.print("Enter month (full name, abbreviation, or number): ");
            String monthInput = scanner.nextLine().trim().toLowerCase();

            // Validate month input
            if (!monthMap.containsKey(monthInput)) {
                System.out.println("Invalid month. Please enter again.");
                continue;
            }

            int month = monthMap.get(monthInput);

            // Get year input from user
            System.out.print("Enter year (non-negative integer): ");
            String yearInput = scanner.nextLine().trim();

            // Validate year input
            if (!isValidYear(yearInput)) {
                System.out.println("Invalid year. Please enter again.");
                continue;
            }

            int year = Integer.parseInt(yearInput);

            // Get the number of days
            int days = getDaysInMonth(month, year);
            System.out.printf("Number of days in %s %d: %d days%n", monthInput, year, days);
            break; // Exit loop after valid input
        }

        scanner.close();
    }

    private static boolean isValidYear(String yearInput) {
        // Check if the input is a non-negative integer with all digits
        return yearInput.matches("\\d+") && Integer.parseInt(yearInput) >= 0;
    }

    private static int getDaysInMonth(int month, int year) {
        // Determine if the year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return isLeapYear ? daysInLeapYear[month - 1] : daysInCommonYear[month - 1];
    }
}
