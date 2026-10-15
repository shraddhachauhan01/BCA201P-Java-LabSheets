// Lab Sheet 01 - Q9
// Input marks of three subjects, calculate total and percentage,
// and print pass/fail (passing criteria: >= 40% in all subjects).
// Marks are taken out of 100 for each subject.

import java.util.Scanner;

public class Q09_MarksPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1 (out of 100): ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks of subject 2 (out of 100): ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks of subject 3 (out of 100): ");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;   // total out of 300, so percentage = total / 3

        System.out.println("Total marks : " + total + " / 300");
        System.out.println("Percentage  : " + percentage + "%");

        // Pass only if every subject has at least 40 marks
        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Result      : Pass");
        } else {
            System.out.println("Result      : Fail");
        }
        sc.close();
    }
}
