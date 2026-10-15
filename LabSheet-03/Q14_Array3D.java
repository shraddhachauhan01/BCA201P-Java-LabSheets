// Lab Sheet 03 - Q14
// Input and display elements of a 2 x 2 x 2 3-D array.
// Think of it as 2 layers, and each layer has 2 rows and 2 columns.

import java.util.Scanner;

public class Q14_Array3D {
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

        System.out.println("The 3-D array is:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + i + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
