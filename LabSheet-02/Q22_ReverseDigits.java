// Lab Sheet 02 - Q22
// Reverse the digits of an integer using a while loop.

import java.util.Scanner;

public class Q22_ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        boolean negative = (num < 0);
        if (negative) {
            num = -num;                       // work with the positive value
        }

        long reversed = 0;
        while (num > 0) {
            int digit = num % 10;             // last digit
            reversed = reversed * 10 + digit; // add it to the reversed number
            num = num / 10;                   // remove the last digit
        }

        if (negative) {
            reversed = -reversed;
        }
        System.out.println("Reversed number: " + reversed);
        sc.close();
    }
}
