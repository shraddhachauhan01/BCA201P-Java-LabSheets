import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter student's marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100");
            }

            System.out.println("Marks: " + marks);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
