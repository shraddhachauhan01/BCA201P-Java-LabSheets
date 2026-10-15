// Lab Sheet 01 - Q7
// Input a number and check if it is divisible by both 3 and 5 using logical operators.

import java.util.Scanner;

public class Q07_DivisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // && means both conditions must be true
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5.");
        } else {
            System.out.println(num + " is not divisible by both 3 and 5.");
        }
        sc.close();
    }
}
