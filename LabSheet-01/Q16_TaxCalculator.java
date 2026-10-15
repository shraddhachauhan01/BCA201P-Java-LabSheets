// Lab Sheet 01 - Q16
// Input salary and calculate tax based on income slabs using if-else.
//   Income <= 250000        : No tax
//   250001 to 500000        : 5%
//   500001 to 1000000       : 20%
//   Above 1000000           : 30%
// Here the rate of the slab is applied on the whole income.

import java.util.Scanner;

public class Q16_TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual salary: ");
        double salary = sc.nextDouble();

        double tax;
        if (salary <= 250000) {
            tax = 0;
        } else if (salary <= 500000) {
            tax = salary * 5 / 100;
        } else if (salary <= 1000000) {
            tax = salary * 20 / 100;
        } else {
            tax = salary * 30 / 100;
        }

        System.out.println("Salary : " + salary);
        System.out.println("Tax    : " + tax);
        sc.close();
    }
}
