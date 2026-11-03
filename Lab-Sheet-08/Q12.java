public class Q12 {
    static class Container<T> {
        T value;

        void add(T value) {
            this.value = value;
        }

        T get() {
            return value;
        }
    }

    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>();
        Container<String> stringContainer = new Container<>();
        Container<Double> doubleContainer = new Container<>();

        intContainer.add(50);
        stringContainer.add("Generics");
        doubleContainer.add(12.75);

        System.out.println(intContainer.get());
        System.out.println(stringContainer.get());
        System.out.println(doubleContainer.get());
    }
}
