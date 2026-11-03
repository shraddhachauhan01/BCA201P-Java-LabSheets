class Palindrome {
    static int countChecks = 0;

    void check(int number) {
        int original = number;
        int reverse = 0;
        int digit;
        countChecks++;

        while (number > 0) {
            digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}

public class Q21 {
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.check(121);
        p.check(123);
        System.out.println("Total checks: " + Palindrome.countChecks);
    }
}
