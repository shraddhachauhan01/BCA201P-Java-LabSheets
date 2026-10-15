// Lab Sheet 02 - Q3
// Find the distance between two points in a 2D plane using the distance formula.
//   distance = sqrt( (x2 - x1)^2 + (y2 - y1)^2 )

import java.util.Scanner;

public class Q03_DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);

        System.out.println("Distance between the points = " + distance);
        sc.close();
    }
}
