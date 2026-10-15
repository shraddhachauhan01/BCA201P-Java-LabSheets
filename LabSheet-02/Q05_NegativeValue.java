// Lab Sheet 02 - Q5
// Take an integer and output its negative value using unary operators.
// The unary minus (-) changes the sign of a number.

import java.util.Scanner;

public class Q05_NegativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int negative = -num;      // unary minus

        System.out.println("Original number : " + num);
        System.out.println("Negative value  : " + negative);
        sc.close();
    }
}
