import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            try {
                System.out.println("Array element: " + arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index");
            }

            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            System.out.println("Division: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}
