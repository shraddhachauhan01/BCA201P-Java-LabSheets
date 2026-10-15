// Lab Sheet 01 - Q28
// Accept a number and display the number of digits using expressions and if-else.

import java.util.Scanner;

public class Q28_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;             // ignore the minus sign
        }

        int count = 0;
        if (num == 0) {
            count = 1;              // 0 has one digit
        } else {
            while (num > 0) {
                num = num / 10;     // remove the last digit
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
