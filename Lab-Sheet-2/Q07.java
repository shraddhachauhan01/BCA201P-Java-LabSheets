import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalRainfall = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter rainfall for day " + i + ": ");
            double rainfall = sc.nextDouble();
            totalRainfall += rainfall;
        }

        System.out.println("Total rainfall for 7 days: " + totalRainfall);
    }
}
