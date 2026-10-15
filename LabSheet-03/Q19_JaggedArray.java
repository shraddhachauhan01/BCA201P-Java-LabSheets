// Lab Sheet 03 - Q19
// Create and display a jagged array with 3 rows of different lengths.
// A jagged array is a 2-D array where every row can have a different number of columns.

public class Q19_JaggedArray {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];   // 3 rows, the length of each row is decided later

        jagged[0] = new int[2];          // row 0 has 2 elements
        jagged[1] = new int[4];          // row 1 has 4 elements
        jagged[2] = new int[3];          // row 2 has 3 elements

        // fill the array with values
        int value = 1;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = value;
                value++;
            }
        }

        System.out.println("The jagged array is:");
        for (int i = 0; i < jagged.length; i++) {
            System.out.print("Row " + i + " (length " + jagged[i].length + "): ");
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
