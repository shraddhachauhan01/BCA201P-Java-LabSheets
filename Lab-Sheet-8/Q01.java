public class Q01 {
    static class Box<T> {
        T value;

        Box(T value) {
            this.value = value;
        }

        void display() {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        Box<String> stringBox = new Box<>("Java");
        Box<Double> doubleBox = new Box<>(25.5);

        intBox.display();
        stringBox.display();
        doubleBox.display();
    }
}
