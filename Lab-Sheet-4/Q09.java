class Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    Laptop(String brand, int RAM) {
        this.brand = brand;
        this.RAM = RAM;
    }

    void display() {
        String details = "Brand: " + brand + ", RAM: " + RAM + " GB";
        System.out.println(details);
        System.out.println("Operating System: " + os);
    }
}

public class Q09 {
    public static void main(String[] args) {
        Laptop l = new Laptop("HP", 8);
        l.display();
    }
}
