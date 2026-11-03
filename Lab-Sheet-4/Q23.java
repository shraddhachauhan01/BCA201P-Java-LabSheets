class PrimeChecker {
    static int totalPrimeChecks = 0;

    void check(int number) {
        boolean prime = number > 1;
        totalPrimeChecks++;

        for (int i = 2; i <= number / i && prime; i++) {
            if (number % i == 0) {
                prime = false;
            }
        }

        if (prime) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}

public class Q23 {
    public static void main(String[] args) {
        PrimeChecker p = new PrimeChecker();
        p.check(17);
        p.check(20);
        System.out.println("Total checks: " + PrimeChecker.totalPrimeChecks);
    }
}
