// Lab Sheet 01 - Q12
// Accept a year and check whether it is a leap year using if-else.

import java.util.Scanner;

public class Q12_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Leap year: divisible by 400, or divisible by 4 but not by 100
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}
