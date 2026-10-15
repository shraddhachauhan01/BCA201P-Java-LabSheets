// Lab Sheet 01 - Q21
// Accept three angles and check whether they can form a valid triangle
// (sum of angles = 180 degrees).

import java.util.Scanner;

public class Q21_ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = sc.nextInt();
        System.out.print("Enter second angle: ");
        int b = sc.nextInt();
        System.out.print("Enter third angle: ");
        int c = sc.nextInt();

        // every angle must be greater than 0 and the sum must be exactly 180
        if (a > 0 && b > 0 && c > 0 && (a + b + c) == 180) {
            System.out.println("These angles can form a valid triangle.");
        } else {
            System.out.println("These angles cannot form a valid triangle.");
        }
        sc.close();
    }
}
