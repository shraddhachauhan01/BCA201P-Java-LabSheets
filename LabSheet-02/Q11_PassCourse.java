// Lab Sheet 02 - Q11
// Check if a student passes a course: they must have at least 40% in theory
// AND 50% in practical, OR overall 50%.
//   Pass = (theory >= 40 AND practical >= 50) OR (overall >= 50)

import java.util.Scanner;

public class Q11_PassCourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory percentage: ");
        double theory = sc.nextDouble();
        System.out.print("Enter practical percentage: ");
        double practical = sc.nextDouble();
        System.out.print("Enter overall percentage: ");
        double overall = sc.nextDouble();

        if ((theory >= 40 && practical >= 50) || overall >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
        sc.close();
    }
}
