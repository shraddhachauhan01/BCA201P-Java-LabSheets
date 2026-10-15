// Lab Sheet 01 - Q13
// Accept a number and check whether it is positive, negative, or zero using if-else.

import java.util.Scanner;

public class Q13_PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        sc.close();
    }
}
