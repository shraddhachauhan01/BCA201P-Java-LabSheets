public class Q05 {
    static class Product<T, U> {
        T id;
        U price;

        Product(T id, U price) {
            this.id = id;
            this.price = price;
        }

        void display() {
            System.out.println("Product ID: " + id + ", Price: " + price);
        }
    }

    public static void main(String[] args) {
        Product<Integer, Double> p1 = new Product<>(101, 499.50);
        Product<Integer, Double> p2 = new Product<>(102, 799.00);
        Product<Integer, Double> p3 = new Product<>(103, 250.75);

        p1.display();
        p2.display();
        p3.display();
    }
}
