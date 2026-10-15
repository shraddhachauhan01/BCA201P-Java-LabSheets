// Lab Sheet 03 - Q22
// Count how many times each element appears in a 1-D array.

import java.util.Scanner;

public class Q22_CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        boolean[] counted = new boolean[n];   // remembers which elements are already counted

        System.out.println("Occurrences of each element:");
        for (int i = 0; i < n; i++) {
            if (counted[i]) {
                continue;                     // this value was already counted earlier
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(arr[i] + " appears " + count + " time(s)");
        }
        sc.close();
    }
}
