// Lab Sheet 02 - Q8
// Check whether three given angles form a valid triangle
// using relational operators (all angles > 0 and the sum is 180).

import java.util.Scanner;

public class Q08_ValidTriangleAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = sc.nextInt();
        System.out.print("Enter second angle: ");
        int b = sc.nextInt();
        System.out.print("Enter third angle: ");
        int c = sc.nextInt();

        boolean allPositive = a > 0 && b > 0 && c > 0;
        boolean sumIs180 = (a + b + c) == 180;

        if (allPositive && sumIs180) {
            System.out.println("The angles form a valid triangle.");
        } else {
            System.out.println("The angles do not form a valid triangle.");
        }
        sc.close();
    }
}
