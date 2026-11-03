class Calculator {
    static int operationsCount = 0;

    void add(double a, double b) {
        double result = a + b;
        operationsCount++;
        System.out.println("Addition: " + result);
    }

    void subtract(double a, double b) {
        double result = a - b;
        operationsCount++;
        System.out.println("Subtraction: " + result);
    }

    void multiply(double a, double b) {
        double result = a * b;
        operationsCount++;
        System.out.println("Multiplication: " + result);
    }

    void divide(double a, double b) {
        if (b != 0) {
            double result = a / b;
            System.out.println("Division: " + result);
            operationsCount++;
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class Q11 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(20, 5);
        c.subtract(20, 5);
        c.multiply(20, 5);
        c.divide(20, 5);
        System.out.println("Total operations: " + Calculator.operationsCount);
    }
}
