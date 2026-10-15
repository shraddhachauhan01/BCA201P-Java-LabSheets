// Lab Sheet 02 - Q27
// Take a grade (A-F) and print its qualitative meaning using switch-case.

import java.util.Scanner;

public class Q27_GradeMeaning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a grade (A-F): ");
        char grade = Character.toUpperCase(sc.next().charAt(0));

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below average");
                break;
            case 'E':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade. Enter a letter from A to F.");
        }
        sc.close();
    }
}
