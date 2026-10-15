// Lab Sheet 03 - Q25
// Find the sum of the main diagonal and secondary diagonal elements of a square matrix.
//   Main diagonal      : elements where row == column
//   Secondary diagonal : elements where row + column == n - 1

import java.util.Scanner;

public class Q25_DiagonalSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int mainSum = 0;
        int secondarySum = 0;
        for (int i = 0; i < n; i++) {
            mainSum += matrix[i][i];
            secondarySum += matrix[i][n - 1 - i];
        }

        System.out.println("Sum of main diagonal      = " + mainSum);
        System.out.println("Sum of secondary diagonal = " + secondarySum);
        sc.close();
    }
}
