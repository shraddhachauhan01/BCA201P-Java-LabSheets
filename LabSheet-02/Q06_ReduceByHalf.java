// Lab Sheet 02 - Q6
// Gradually reduce a number by half using /= until it becomes less than 1,
// counting the number of steps.

import java.util.Scanner;

public class Q06_ReduceByHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double num = sc.nextDouble();

        int steps = 0;
        System.out.println("Starting value: " + num);

        while (num >= 1) {
            num /= 2;            // same as num = num / 2
            steps++;
            System.out.println("Step " + steps + ": " + num);
        }

        System.out.println("The number became less than 1 after " + steps + " steps.");
        sc.close();
    }
}
