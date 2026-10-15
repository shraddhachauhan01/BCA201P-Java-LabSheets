// Lab Sheet 01 - Q27
// Input the cost price and selling price of an item.
// Determine profit or loss, and by how much, using if-else.

import java.util.Scanner;

public class Q27_ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double costPrice = sc.nextDouble();
        System.out.print("Enter selling price: ");
        double sellingPrice = sc.nextDouble();

        if (sellingPrice > costPrice) {
            System.out.println("Profit of " + (sellingPrice - costPrice));
        } else if (costPrice > sellingPrice) {
            System.out.println("Loss of " + (costPrice - sellingPrice));
        } else {
            System.out.println("No profit, no loss.");
        }
        sc.close();
    }
}
