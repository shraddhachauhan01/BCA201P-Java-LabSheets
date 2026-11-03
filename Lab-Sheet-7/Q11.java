class BankAccount {
    int balance = 100000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
    }
}

class Q11 {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                account.withdraw(1);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++) {
                account.withdraw(1);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final balance: " + account.balance);
        System.out.println("Expected balance: 98000");
    }
}
