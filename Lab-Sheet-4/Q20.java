class BankAccount {
    double balance;
    static String bankCode = "SBIN";

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        double remainingBalance;
        if (amount <= balance && amount > 0) {
            remainingBalance = balance - amount;
            balance = remainingBalance;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
        System.out.println("Bank code: " + bankCode);
        System.out.println("Balance: " + balance);
    }
}

public class Q20 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000);
        account.withdraw(1500);
    }
}
