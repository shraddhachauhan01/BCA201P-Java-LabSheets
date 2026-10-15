// Lab Sheet 01 - Q3
// Check whether a given number is even or odd using the modulus operator and if-else.

import java.util.Scanner;

public class Q03_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        sc.close();
    }
}
