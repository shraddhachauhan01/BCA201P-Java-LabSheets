// Lab Sheet 02 - Q26
// Take a day number (1-7) and display whether it is a weekday or weekend using switch-case.
// Here 1 = Monday, 2 = Tuesday, ..., 6 = Saturday, 7 = Sunday.

import java.util.Scanner;

public class Q26_WeekdayOrWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Day " + day + " is a weekday.");
                break;
            case 6:
            case 7:
                System.out.println("Day " + day + " is a weekend.");
                break;
            default:
                System.out.println("Invalid day number. Enter a number from 1 to 7.");
        }
        sc.close();
    }
}
