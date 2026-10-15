// Lab Sheet 01 - Q2
// Input two integers and print the result of all arithmetic operations.

import java.util.Scanner;

public class Q02_ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));

        // Division and modulus are not possible when the second number is 0
        if (b != 0) {
            System.out.println("Division       : " + (a / b));
            System.out.println("Modulus        : " + (a % b));
        } else {
            System.out.println("Division and modulus are not possible with 0.");
        }
        sc.close();
    }
}
