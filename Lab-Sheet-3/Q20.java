import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        int[][] marks = new int[students][];

        for (int i = 0; i < students; i++) {
            System.out.print("Enter number of subjects for student " + (i + 1) + ": ");
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks: ");
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Marks of student " + (i + 1) + ":");
            for (int mark : marks[i]) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
    }
}
