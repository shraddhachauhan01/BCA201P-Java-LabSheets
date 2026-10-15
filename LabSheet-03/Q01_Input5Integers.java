// Lab Sheet 03 - Q1
// Input and display 5 integers using a 1-D array.

import java.util.Scanner;

public class Q01_Input5Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
