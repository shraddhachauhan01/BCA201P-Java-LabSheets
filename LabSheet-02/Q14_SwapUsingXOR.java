// Lab Sheet 02 - Q14
// Swap two integers without using a temporary variable (use XOR).

import java.util.Scanner;

public class Q14_SwapUsingXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // XOR swap: no third variable needed
        a = a ^ b;
        b = a ^ b;     // now b has the old value of a
        a = a ^ b;     // now a has the old value of b

        System.out.println("After swapping : a = " + a + ", b = " + b);
        sc.close();
    }
}
