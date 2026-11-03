class Product {
    int id;
    String name;
    double price;
    static double discountRate = 10;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void calculatePrice() {
        double discount = price * discountRate / 100;
        double finalPrice = price - discount;
        System.out.println("Product ID: " + id);
        System.out.println("Product: " + name);
        System.out.println("Final price: " + finalPrice);
    }
}

public class Q19 {
    public static void main(String[] args) {
        Product p = new Product(101, "Bag", 1000);
        p.calculatePrice();
    }
}
