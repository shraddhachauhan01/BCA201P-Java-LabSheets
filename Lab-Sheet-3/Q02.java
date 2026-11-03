import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
