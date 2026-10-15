// Lab Sheet 01 - Q4
// Demonstrate the use of relational operators by comparing two numbers.

import java.util.Scanner;

public class Q04_RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Each relational operator gives true or false
        System.out.println(a + " == " + b + " : " + (a == b));
        System.out.println(a + " != " + b + " : " + (a != b));
        System.out.println(a + " >  " + b + " : " + (a > b));
        System.out.println(a + " <  " + b + " : " + (a < b));
        System.out.println(a + " >= " + b + " : " + (a >= b));
        System.out.println(a + " <= " + b + " : " + (a <= b));
        sc.close();
    }
}
