import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(sc.nextLine());

            System.out.print("Enter second number: ");
            int b = Integer.parseInt(sc.nextLine());

            System.out.println("Division: " + (a / b));

            System.out.print("Enter array index: ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Array element: " + arr[index]);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers");
        }
    }
}
