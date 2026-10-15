// Lab Sheet 03 - Q13
// Multiply two 3 x 3 matrices.
// result[i][j] = sum of ( a[i][k] * b[k][j] ) for k = 0, 1, 2

import java.util.Scanner;

public class Q13_MultiplyMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] result = new int[3][3];

        System.out.println("Enter elements of the first 3 x 3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of the second 3 x 3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product of the two matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
