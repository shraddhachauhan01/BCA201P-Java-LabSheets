import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        num = Math.abs(num);
        int count;

        if (num == 0) {
            count = 1;
        } else if (num < 10) {
            count = 1;
        } else if (num < 100) {
            count = 2;
        } else if (num < 1000) {
            count = 3;
        } else if (num < 10000) {
            count = 4;
        } else {
            count = 0;
            while (num > 0) {
                count++;
                num /= 10;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
