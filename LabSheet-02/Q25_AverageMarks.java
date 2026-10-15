// Lab Sheet 02 - Q25
// Calculate the average marks of students stored in a 2D array using a for-each loop.
// Each row of the array is one student, each column is one subject.

import java.util.Scanner;

public class Q25_AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][] marks = new int[students][subjects];

        // Input the marks (normal for loops are used to fill the array)
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks of student " + (i + 1) + ":");
            for (int j = 0; j < subjects; j++) {
                System.out.print("  Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // for-each loops are used to read the array
        int studentNumber = 1;
        for (int[] row : marks) {
            int total = 0;
            for (int mark : row) {
                total += mark;
            }
            double average = (double) total / subjects;
            System.out.println("Student " + studentNumber + " -> Total: " + total + ", Average: " + average);
            studentNumber++;
        }
        sc.close();
    }
}
