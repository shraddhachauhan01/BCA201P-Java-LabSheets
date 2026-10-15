// Lab Sheet 02 - Q16
// Perform fast multiplication and division of a number by powers of two
// using shift operators.
//   num << n  is the same as  num * 2^n
//   num >> n  is the same as  num / 2^n  (for positive numbers)

import java.util.Scanner;

public class Q16_ShiftMultiplyDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the power of 2 (n): ");
        int n = sc.nextInt();

        int multiplied = num << n;    // left shift = multiply by 2^n
        int divided = num >> n;       // right shift = divide by 2^n

        System.out.println(num + " << " + n + " = " + multiplied + "   (" + num + " x 2^" + n + ")");
        System.out.println(num + " >> " + n + " = " + divided + "   (" + num + " / 2^" + n + ")");
        sc.close();
    }
}
