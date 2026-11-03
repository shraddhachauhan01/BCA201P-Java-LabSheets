class Car {
    String brand;
    double mileage;
    static int wheels = 4;

    Car(String brand, double mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    void display() {
        String details = "Brand: " + brand + ", Mileage: " + mileage;
        System.out.println(details);
        System.out.println("Wheels: " + wheels);
    }
}

public class Q06 {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 18.5);
        c.display();
    }
}
