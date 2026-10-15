// Lab Sheet 02 - Q24
// Find the maximum and minimum values in an integer array using a for-each loop.

import java.util.Scanner;

public class Q24_MaxMinForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The array must have at least one element.");
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }

            int max = arr[0];
            int min = arr[0];

            // for-each loop: 'value' takes each element of arr one by one
            for (int value : arr) {
                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
            }

            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        }
        sc.close();
    }
}
