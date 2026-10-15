// Lab Sheet 02 - Q7
// Accumulate rainfall data for 7 days using += and find the total.

import java.util.Scanner;

public class Q07_RainfallTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter rainfall for day " + day + " (in mm): ");
            double rainfall = sc.nextDouble();
            total += rainfall;       // same as total = total + rainfall
        }

        System.out.println("Total rainfall in 7 days = " + total + " mm");
        sc.close();
    }
}
