// Lab Sheet 03 - Q2
// Input 10 integers and display them in reverse order.

import java.util.Scanner;

public class Q02_ReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {   // start from the last index
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
