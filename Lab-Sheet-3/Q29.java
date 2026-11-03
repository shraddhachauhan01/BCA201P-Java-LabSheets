import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.print("Enter number of elements in row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];

            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                for (int k = 0; k < arr[i].length - 1 - j; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted jagged array:");
        for (int i = 0; i < rows; i++) {
            for (int value : arr[i]) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
