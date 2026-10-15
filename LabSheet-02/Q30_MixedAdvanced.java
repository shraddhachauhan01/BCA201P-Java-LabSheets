// Lab Sheet 02 - Q30
// Mixed program:
//  1. Use shift operators to check if a number is a power of 4
//  2. Use a bitwise operator to toggle the 3rd bit of the number
//  3. Use a for loop to print the multiplication table, skipping multiples of 6 using continue
//  4. Stop if a multiple of 48 is reached, using break

import java.util.Scanner;

public class Q30_MixedAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        // ---- 1. Power of 4 check using shift operators ----
        // A power of 4 has exactly one 1-bit, and it sits at an even position (0, 2, 4, ...).
        // We shift right until the number becomes 1 and count the shifts.
        boolean powerOfFour = false;
        if (num > 0 && (num & (num - 1)) == 0) {   // only one bit is set -> power of 2
            int temp = num;
            int shifts = 0;
            while (temp > 1) {
                temp = temp >> 1;
                shifts++;
            }
            powerOfFour = (shifts % 2 == 0);        // even number of shifts -> power of 4
        }
        if (powerOfFour) {
            System.out.println(num + " is a power of 4.");
        } else {
            System.out.println(num + " is not a power of 4.");
        }

        // ---- 2. Toggle the 3rd bit (counting from the right, so bit position 2) ----
        int toggled = num ^ (1 << 2);
        System.out.println("After toggling the 3rd bit: " + toggled);

        // ---- 3 and 4. Multiplication table with continue and break ----
        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int product = num * i;

            // break is checked first, because every multiple of 48 is also a multiple of 6
            if (product % 48 == 0) {
                System.out.println("Reached " + product + " (multiple of 48). Stopping.");
                break;
            }
            if (product % 6 == 0) {
                continue;                           // skip multiples of 6
            }
            System.out.println(num + " x " + i + " = " + product);
        }
        sc.close();
    }
}
