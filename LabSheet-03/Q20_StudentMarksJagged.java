// Lab Sheet 03 - Q20
// Store marks for students where each student has taken a different number of subjects,
// then display them. A jagged array is used: one row per student.

import java.util.Scanner;

public class Q20_StudentMarksJagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = new int[students][];

        for (int i = 0; i < students; i++) {
            System.out.print("Enter number of subjects taken by student " + (i + 1) + ": ");
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];       // this row gets its own length

            for (int j = 0; j < subjects; j++) {
                System.out.print("  Enter marks of subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMarks of all students:");
        for (int i = 0; i < students; i++) {
            System.out.print("Student " + (i + 1) + " (" + marks[i].length + " subjects): ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
