class Triangle {
    double a;
    double b;
    double c;
    static String type = "Triangle";

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void check() {
        boolean valid = a + b > c && a + c > b && b + c > a;
        System.out.println("Shape: " + type);
        if (!valid) {
            System.out.println("Invalid triangle");
        } else if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}

public class Q16 {
    public static void main(String[] args) {
        Triangle t = new Triangle(5, 5, 6);
        t.check();
    }
}
