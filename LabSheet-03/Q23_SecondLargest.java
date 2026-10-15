// Lab Sheet 03 - Q23
// Find the second largest element in a 1-D array.
// (Duplicates of the largest value do not count as the second largest.)

import java.util.Scanner;

public class Q23_SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second = largest;          // old largest becomes second largest
                largest = arr[i];
            } else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("Largest element        = " + largest);
            System.out.println("Second largest element = " + second);
        }
        sc.close();
    }
}
