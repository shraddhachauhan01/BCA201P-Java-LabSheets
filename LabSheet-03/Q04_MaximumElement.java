// Lab Sheet 03 - Q4
// Find the maximum element in an array.

import java.util.Scanner;

public class Q04_MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The array must have at least one element.");
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            int max = arr[0];                 // assume the first element is the largest
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Maximum element = " + max);
        }
        sc.close();
    }
}
