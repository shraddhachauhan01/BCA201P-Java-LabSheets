// Lab Sheet 03 - Q26
// Display the upper and lower triangular parts of a square matrix separately.
//   Upper triangle : elements on and above the main diagonal (column >= row)
//   Lower triangle : elements on and below the main diagonal (column <= row)

import java.util.Scanner;

public class Q26_TriangularParts {
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

        System.out.println("Upper triangular part:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    System.out.print(matrix[i][j] + "\t");
                } else {
                    System.out.print("\t");       // empty space for the other part
                }
            }
            System.out.println();
        }

        System.out.println("Lower triangular part:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(matrix[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
