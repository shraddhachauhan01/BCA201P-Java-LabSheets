class Factorial {
    static int totalCalls = 0;

    long calculate(int number) {
        long factorial = 1;
        totalCalls++;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}

public class Q25 {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Factorial: " + f.calculate(5));
        System.out.println("Total calls: " + Factorial.totalCalls);
    }
}
