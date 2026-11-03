import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int count = 0;

        while (num > 0) {
            num = num & (num - 1);
            count++;
        }

        System.out.println("Number of set bits: " + count);
    }
}
