class SimpleInterest {
    double principal;
    double rate;
    double time;
    static String bank = "ABC Bank";

    SimpleInterest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    void calculate() {
        double interest = (principal * rate * time) / 100;
        System.out.println("Bank: " + bank);
        System.out.println("Simple Interest: " + interest);
    }
}

public class Q15 {
    public static void main(String[] args) {
        SimpleInterest s = new SimpleInterest(10000, 5, 2);
        s.calculate();
    }
}
