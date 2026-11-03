import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Second largest element does not exist");
            return;
        }

        int largest = 0;
        int second = 0;
        boolean hasLargest = false;
        boolean hasSecond = false;

        for (int value : arr) {
            if (!hasLargest || value > largest) {
                if (hasLargest && value != largest) {
                    second = largest;
                    hasSecond = true;
                }
                largest = value;
                hasLargest = true;
            } else if (value != largest && (!hasSecond || value > second)) {
                second = value;
                hasSecond = true;
            }
        }

        if (hasSecond) {
            System.out.println("Second largest element: " + second);
        } else {
            System.out.println("Second largest distinct element does not exist");
        }
    }
}