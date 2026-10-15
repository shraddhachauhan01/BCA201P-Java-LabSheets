// Lab Sheet 02 - Q2
// Calculate compound interest given principal, rate and time.
//   Amount = P * (1 + R / 100) ^ T        Compound Interest = Amount - P

import java.util.Scanner;

public class Q02_CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate of interest (% per year): ");
        double rate = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = sc.nextDouble();

        double amount = principal * Math.pow(1 + rate / 100, time);
        double compoundInterest = amount - principal;

        System.out.println("Total amount      : " + amount);
        System.out.println("Compound interest : " + compoundInterest);
        sc.close();
    }
}
