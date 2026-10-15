// Lab Sheet 01 - Q19
// Accept a character and use if-else to identify whether it is a valid operator
// (+, -, *, /) and perform the corresponding operation on two input numbers.

import java.util.Scanner;

public class Q19_ValidOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            if (op == '+') {
                System.out.println(a + " + " + b + " = " + (a + b));
            } else if (op == '-') {
                System.out.println(a + " - " + b + " = " + (a - b));
            } else if (op == '*') {
                System.out.println(a + " * " + b + " = " + (a * b));
            } else {
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
            }
        } else {
            System.out.println("'" + op + "' is not a valid operator.");
        }
        sc.close();
    }
}
