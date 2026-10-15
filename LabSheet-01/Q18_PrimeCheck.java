// Lab Sheet 01 - Q18
// Accept a number and print whether it is prime or not using if-else.

import java.util.Scanner;

public class Q18_PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;             // 0, 1 and negative numbers are not prime
        } else {
            // check divisors from 2 up to the square root of the number
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }
}
