import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print("Enter element: ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        int max = arr[0][0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }
                }
            }
        }

        System.out.println("Maximum element: " + max);
    }
}
