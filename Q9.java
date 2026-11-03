import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of three subjects: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = total / 3;

        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);

        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
