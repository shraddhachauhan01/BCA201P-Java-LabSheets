import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][] marks = new int[students][subjects];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks of student " + (i + 1) + " in subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        int total = 0;
        int count = 0;

        for (int[] studentMarks : marks) {
            for (int mark : studentMarks) {
                total += mark;
                count++;
            }
        }

        double average = (double) total / count;

        System.out.println("Average marks: " + average);
    }
}
