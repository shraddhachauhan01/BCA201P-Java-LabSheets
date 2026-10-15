// Lab Sheet 03 - Q24
// Remove duplicate elements from a 1-D array (without using collections).

import java.util.Scanner;

public class Q24_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[] unique = new int[n];     // can hold at most n elements
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            // check if arr[i] is already present in the unique array
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == arr[i]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                unique[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
