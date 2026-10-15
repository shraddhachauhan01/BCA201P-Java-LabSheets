// Lab Sheet 03 - Q29
// Sort the elements of each row in a jagged array (ascending order).
// Bubble sort is applied on every row separately.

public class Q29_SortJaggedRows {
    public static void main(String[] args) {
        int[][] jagged = {
            {9, 3, 7},
            {15, 2, 8, 1, 6},
            {20, 10},
            {4, 12, 5, 3}
        };

        System.out.println("Jagged array before sorting:");
        printArray(jagged);

        // sort each row using bubble sort
        for (int r = 0; r < jagged.length; r++) {
            int[] row = jagged[r];
            for (int i = 0; i < row.length - 1; i++) {
                for (int j = 0; j < row.length - 1 - i; j++) {
                    if (row[j] > row[j + 1]) {          // swap if out of order
                        int temp = row[j];
                        row[j] = row[j + 1];
                        row[j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Jagged array after sorting each row:");
        printArray(jagged);
    }

    // helper method to print a jagged array
    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
