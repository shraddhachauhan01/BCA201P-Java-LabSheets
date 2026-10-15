// Lab Sheet 01 - Q25
// Accept two integers and a logical operator as a character. Use if-else to perform
// the logical operation and display the result.
// A non-zero integer is treated as true and 0 is treated as false.
// Operators:  &  (AND)    |  (OR)    !  (NOT of the first number)

import java.util.Scanner;

public class Q25_LogicalOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int x = sc.nextInt();
        System.out.print("Enter second integer: ");
        int y = sc.nextInt();
        System.out.print("Enter logical operator (&, |, !): ");
        char op = sc.next().charAt(0);

        boolean a = (x != 0);   // convert numbers to true/false
        boolean b = (y != 0);

        if (op == '&') {
            System.out.println(a + " AND " + b + " = " + (a && b));
        } else if (op == '|') {
            System.out.println(a + " OR " + b + " = " + (a || b));
        } else if (op == '!') {
            System.out.println("NOT " + a + " = " + (!a));
        } else {
            System.out.println("Invalid logical operator.");
        }
        sc.close();
    }
}
