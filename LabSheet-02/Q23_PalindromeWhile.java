// Lab Sheet 02 - Q23
// Determine if a number is a palindrome using a while loop.

import java.util.Scanner;

public class Q23_PalindromeWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        long reversed = 0;

        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp = temp / 10;
        }

        if (num >= 0 && reversed == num) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
        sc.close();
    }
}
