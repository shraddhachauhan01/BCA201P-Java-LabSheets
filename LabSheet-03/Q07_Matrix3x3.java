// Lab Sheet 03 - Q7
// Input and display elements of a 3 x 3 matrix.

import java.util.Scanner;

public class Q07_Matrix3x3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
