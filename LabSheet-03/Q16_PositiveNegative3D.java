// Lab Sheet 03 - Q16
// Count positive and negative numbers in a 3-D array (2 x 2 x 2).
// Zeros are neither positive nor negative, so they are counted separately.

import java.util.Scanner;

public class Q16_PositiveNegative3D {
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

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] > 0) {
                        positive++;
                    } else if (arr[i][j][k] < 0) {
                        negative++;
                    } else {
                        zero++;
                    }
                }
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros           : " + zero);
        sc.close();
    }
}
