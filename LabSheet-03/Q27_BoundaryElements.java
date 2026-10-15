// Lab Sheet 03 - Q27
// Print only the boundary elements of a matrix
// (first row, last row, first column and last column).

import java.util.Scanner;

public class Q27_BoundaryElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Boundary elements (inside elements are left blank):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
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
