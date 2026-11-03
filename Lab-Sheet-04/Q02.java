class Rectangle {
    double length;
    double breadth;
    static String shapeName = "Rectangle";

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void displayArea() {
        double area = length * breadth;
        System.out.println(shapeName + " area: " + area);
    }
}

public class Q02 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        r.displayArea();
    }
}
