// Lab Sheet 01 - Q26
// Input a five-digit number and check whether the first and last digits are the same
// using arithmetic expressions.

import java.util.Scanner;

public class Q26_FirstLastDigitSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        if (num < 10000 || num > 99999) {
            System.out.println("Please enter a valid five-digit number.");
        } else {
            int first = num / 10000;   // dividing by 10000 leaves only the first digit
            int last = num % 10;       // remainder after dividing by 10 is the last digit

            System.out.println("First digit : " + first);
            System.out.println("Last digit  : " + last);

            if (first == last) {
                System.out.println("The first and last digits are the same.");
            } else {
                System.out.println("The first and last digits are different.");
            }
        }
        sc.close();
    }
}
