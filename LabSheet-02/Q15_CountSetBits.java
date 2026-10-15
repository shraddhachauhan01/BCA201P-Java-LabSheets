// Lab Sheet 02 - Q15
// Count the number of set bits (1s) in the binary representation of a number
// using bitwise operators.

import java.util.Scanner;

public class Q15_CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        System.out.println("Binary form: " + Integer.toBinaryString(num));

        int temp = num;
        int count = 0;

        while (temp != 0) {
            count += temp & 1;     // (temp & 1) is 1 when the last bit is 1
            temp = temp >>> 1;     // shift right by 1 to look at the next bit
        }

        System.out.println("Number of set bits (1s): " + count);
        sc.close();
    }
}
