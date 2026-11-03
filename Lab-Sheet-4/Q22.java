class Armstrong {
    static int totalChecks = 0;

    void check(int number) {
        int original = number;
        int temp = number;
        int digits = 0;
        int sum = 0;
        totalChecks++;

        do {
            digits++;
            temp /= 10;
        } while (temp != 0);

        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}

public class Q22 {
    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        a.check(153);
        a.check(123);
        System.out.println("Total checks: " + Armstrong.totalChecks);
    }
}
