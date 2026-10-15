// Lab Sheet 02 - Q21
// Display all factors of a number using a do-while loop.

import java.util.Scanner;

public class Q21_FactorsDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            System.out.println("Factors of " + num + ":");
            int i = 1;
            do {
                if (num % i == 0) {          // i divides num completely
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= num);
            System.out.println();
        }
        sc.close();
    }
}
