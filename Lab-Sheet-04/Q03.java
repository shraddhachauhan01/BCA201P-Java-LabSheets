class Circle {
    double radius;
    static final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}

public class Q03 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.display();
    }
}
