// Lab Sheet 02 - Q1
// Find the area of a triangle given its three sides using Heron's formula.
//   s = (a + b + c) / 2        area = sqrt( s * (s - a) * (s - b) * (s - c) )

import java.util.Scanner;

public class Q01_HeronsFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = sc.nextDouble();
        System.out.print("Enter side b: ");
        double b = sc.nextDouble();
        System.out.print("Enter side c: ");
        double c = sc.nextDouble();

        // In a valid triangle, the sum of any two sides is greater than the third side
        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Semi-perimeter : " + s);
            System.out.println("Area of triangle : " + area);
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
        sc.close();
    }
}
