import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Greatest number: " + a);
        } else if (b > a) {
            System.out.println("Greatest number: " + b);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
