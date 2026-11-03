class ElectricBill {
    int units;
    static double fixedCharge = 50;

    ElectricBill(int units) {
        this.units = units;
    }

    void calculateBill() {
        double energyCharge;
        if (units <= 100) {
            energyCharge = units * 3;
        } else if (units <= 200) {
            energyCharge = 100 * 3 + (units - 100) * 5;
        } else {
            energyCharge = 100 * 3 + 100 * 5 + (units - 200) * 7;
        }
        double totalBill = energyCharge + fixedCharge;
        System.out.println("Total bill: " + totalBill);
    }
}

public class Q18 {
    public static void main(String[] args) {
        ElectricBill bill = new ElectricBill(150);
        bill.calculateBill();
    }
}
