// Lab Sheet 02 - Q12
// Find the smallest of four numbers using nested ternary operators.
// Syntax: condition ? valueIfTrue : valueIfFalse

import java.util.Scanner;

public class Q12_SmallestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        // smaller of a and b, then smaller of c and d, then smaller of those two
        int smallestAB = (a < b) ? a : b;
        int smallestCD = (c < d) ? c : d;
        int smallest = (smallestAB < smallestCD) ? smallestAB : smallestCD;
        System.out.println("The smallest number is " + smallest);

        // The same thing written as a single nested ternary expression
        int nested = (a < b)
                ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))
                : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));
        System.out.println("Using one nested ternary: " + nested);
        sc.close();
    }
}
