import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] first = new int[n];
        int[] second = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            first[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            second[i] = first[i];
        }

        System.out.println("Copied array:");
        for (int value : second) {
            System.out.print(value + " ");
        }
    }
}
