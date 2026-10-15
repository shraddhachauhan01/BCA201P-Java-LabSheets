// Lab Sheet 03 - Q6
// Copy all elements from one array to another.

import java.util.Scanner;

public class Q06_CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] source = new int[n];
        int[] copy = new int[n];          // second array of the same size

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            source[i] = sc.nextInt();
        }

        // copy element by element
        for (int i = 0; i < n; i++) {
            copy[i] = source[i];
        }

        System.out.print("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.print("\nCopied array  : ");
        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
