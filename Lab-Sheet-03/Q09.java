import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }
}
