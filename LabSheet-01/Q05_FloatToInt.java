// Lab Sheet 01 - Q5
// Accept a floating-point number and convert it explicitly to an integer.
// Print both the original and the converted values.

import java.util.Scanner;

public class Q05_FloatToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double original = sc.nextDouble();

        // Explicit type casting: the decimal part is cut off (not rounded)
        int converted = (int) original;

        System.out.println("Original value  : " + original);
        System.out.println("Converted value : " + converted);
        sc.close();
    }
}
