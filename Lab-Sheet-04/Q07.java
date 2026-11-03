class BankAccount {
    int accountNumber;
    double balance;
    static String bankName = "State Bank";

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }
}

public class Q07 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345, 5000);
        System.out.println("Bank: " + BankAccount.bankName);
        account.deposit(1500);
    }
}
