// Lab Sheet 01 - Q17
// Accept an integer and check whether it is a palindrome using arithmetic operations
// and type casting. (A palindrome reads the same forwards and backwards, e.g. 121)

import java.util.Scanner;

public class Q17_PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int temp = num;
        long reversed = 0;               // long is used so a big reversed number does not overflow

        while (temp > 0) {
            int digit = temp % 10;       // take the last digit
            reversed = reversed * 10 + digit;
            temp = temp / 10;            // remove the last digit
        }

        // Type casting: convert the long result back to int for display
        int reversedInt = (int) reversed;
        System.out.println("Reverse of the number: " + reversedInt);

        if (num >= 0 && reversed == num) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        sc.close();
    }
}
