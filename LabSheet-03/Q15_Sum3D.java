// Lab Sheet 03 - Q15
// Find the sum of all elements in a 3-D array (2 x 2 x 2).

import java.util.Scanner;

public class Q15_Sum3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] arr = new int[2][2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print("Enter element [" + i + "][" + j + "][" + k + "]: ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    sum += arr[i][j][k];
                }
            }
        }

        System.out.println("Sum of all elements = " + sum);
        sc.close();
    }
}
