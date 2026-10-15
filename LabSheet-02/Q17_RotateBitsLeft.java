// Lab Sheet 02 - Q17
// Cyclically rotate the bits of an integer to the left by 2 positions.
// An int has 32 bits. The 2 bits that fall off the left end come back on the right end.

import java.util.Scanner;

public class Q17_RotateBitsLeft {

    // Shows an int as 32 binary digits (adds leading zeros)
    static String toBinary32(int n) {
        String bits = Integer.toBinaryString(n);
        while (bits.length() < 32) {
            bits = "0" + bits;
        }
        return bits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // (num << 2) moves the bits left, (num >>> 30) brings the top 2 bits to the right end
        int rotated = (num << 2) | (num >>> 30);

        System.out.println("Original : " + num);
        System.out.println("Binary   : " + toBinary32(num));
        System.out.println("Rotated  : " + rotated);
        System.out.println("Binary   : " + toBinary32(rotated));
        sc.close();
    }
}
