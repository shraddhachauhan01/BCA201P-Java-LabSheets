// Lab Sheet 03 - Q17
// Find the maximum element in a 3-D array (2 x 2 x 2).

import java.util.Scanner;

public class Q17_Max3D {
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

        int max = arr[0][0][0];     // start with the first element
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }
                }
            }
        }

        System.out.println("Maximum element = " + max);
        sc.close();
    }
}
