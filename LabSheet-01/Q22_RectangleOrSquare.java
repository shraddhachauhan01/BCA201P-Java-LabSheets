// Lab Sheet 01 - Q22
// Input the length and breadth of a rectangle and determine whether it is a square.

import java.util.Scanner;

public class Q22_RectangleOrSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        if (length <= 0 || breadth <= 0) {
            System.out.println("Length and breadth must be greater than 0.");
        } else if (length == breadth) {
            System.out.println("The shape is a square.");
        } else {
            System.out.println("The shape is a rectangle, not a square.");
        }
        sc.close();
    }
}
