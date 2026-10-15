// Lab Sheet 01 - Q20
// Accept age and gender and determine eligibility for marriage
// (male >= 21, female >= 18) using nested if-else conditions.

import java.util.Scanner;

public class Q20_MarriageEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender (M/F): ");
        char gender = Character.toUpperCase(sc.next().charAt(0));

        if (gender == 'M') {
            if (age >= 21) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible. A male must be at least 21 years old.");
            }
        } else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("Eligible for marriage.");
            } else {
                System.out.println("Not eligible. A female must be at least 18 years old.");
            }
        } else {
            System.out.println("Invalid gender entered. Please enter M or F.");
        }
        sc.close();
    }
}
