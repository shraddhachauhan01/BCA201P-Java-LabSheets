// Lab Sheet 03 - Q21
// Rotate an array to the left by one position.
// Example: 1 2 3 4 5  ->  2 3 4 5 1

import java.util.Scanner;

public class Q21_RotateLeftByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        if (n > 0) {
            int first = arr[0];              // keep the first element safe
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];         // move every element one place to the left
            }
            arr[n - 1] = first;              // put the first element at the end
        }

        System.out.print("Array after rotating left by one: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
