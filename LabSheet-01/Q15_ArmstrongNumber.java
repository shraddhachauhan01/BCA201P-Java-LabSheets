// Lab Sheet 01 - Q15
// Accept a 3-digit number and check whether it is an Armstrong number.
// Armstrong number: sum of cubes of its digits equals the number (153 = 1 + 125 + 27).

import java.util.Scanner;

public class Q15_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        if (num < 100 || num > 999) {
            System.out.println("Please enter a valid 3-digit number.");
        } else {
            int hundreds = num / 100;        // first digit
            int tens = (num / 10) % 10;      // middle digit
            int ones = num % 10;             // last digit

            int sum = (hundreds * hundreds * hundreds)
                    + (tens * tens * tens)
                    + (ones * ones * ones);

            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        }
        sc.close();
    }
}
