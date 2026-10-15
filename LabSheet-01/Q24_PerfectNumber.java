// Lab Sheet 01 - Q24
// Accept a number and check whether it is a perfect number
// (sum of its divisors, excluding the number itself, equals the number). Example: 6 = 1 + 2 + 3

import java.util.Scanner;

public class Q24_PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {       // i is a divisor of num
                sum = sum + i;
            }
        }

        if (num > 0 && sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
        sc.close();
    }
}
