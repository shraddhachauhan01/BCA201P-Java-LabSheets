// Lab Sheet 03 - Q28
// Search for an element in a 2-D array and display its row and column position.

import java.util.Scanner;

public class Q28_Search2D {
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

        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(key + " found at row " + i + ", column " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println(key + " was not found in the matrix.");
        }
        sc.close();
    }
}
