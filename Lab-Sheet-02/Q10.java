import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        System.out.print("Enter range start year: ");
        int start = sc.nextInt();

        System.out.print("Enter range end year: ");
        int end = sc.nextInt();

        boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);

        if (leap && year >= start && year <= end) {
            System.out.println("The year is a leap year and is within the range");
        } else {
            System.out.println("Condition not satisfied");
        }
    }
}
