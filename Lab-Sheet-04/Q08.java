class Pen {
    String color;
    String type;
    static String manufacturer = "Cello";

    Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    void display() {
        String details = "Color: " + color + ", Type: " + type;
        System.out.println(details);
        System.out.println("Manufacturer: " + manufacturer);
    }
}

public class Q08 {
    public static void main(String[] args) {
        Pen p = new Pen("Blue", "Ballpoint");
        p.display();
    }
}
