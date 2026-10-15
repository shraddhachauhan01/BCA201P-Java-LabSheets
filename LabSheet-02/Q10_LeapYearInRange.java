// Lab Sheet 02 - Q10
// Determine if a given year is both a leap year and within a given range.

import java.util.Scanner;

public class Q10_LeapYearInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the start year of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end year of the range: ");
        int end = sc.nextInt();
        System.out.print("Enter the year to check: ");
        int year = sc.nextInt();

        boolean isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        boolean inRange = (year >= start && year <= end);

        // Logical AND: both conditions must be true
        if (isLeap && inRange) {
            System.out.println(year + " is a leap year and lies within " + start + " to " + end + ".");
        } else if (isLeap) {
            System.out.println(year + " is a leap year but is outside the range.");
        } else if (inRange) {
            System.out.println(year + " is within the range but is not a leap year.");
        } else {
            System.out.println(year + " is not a leap year and is outside the range.");
        }
        sc.close();
    }
}
