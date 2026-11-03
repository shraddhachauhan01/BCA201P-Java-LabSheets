import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int temp = num;
        boolean powerOfFour = temp > 0;

        while (temp > 1 && powerOfFour) {
            if ((temp & 3) != 0) {
                powerOfFour = false;
            }
            temp >>= 2;
        }

        if (powerOfFour) {
            System.out.println(num + " is a power of 4");
        } else {
            System.out.println(num + " is not a power of 4");
        }

        int toggled = num ^ (1 << 2);
        System.out.println("After toggling the 3rd bit: " + toggled);

        for (int i = 1; i <= 20; i++) {
            int result = num * i;

            if (result % 48 == 0) {
                break;
            }

            if (result % 6 == 0) {
                continue;
            }

            System.out.println(num + " x " + i + " = " + result);
        }
    }
}
