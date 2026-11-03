public class Q04 {
    static class Pair<T, U> {
        T first;
        U second;

        Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        void display() {
            System.out.println("Employee ID: " + first);
            System.out.println("Employee Name: " + second);
        }
    }

    public static void main(String[] args) {
        Pair<Integer, String> employee = new Pair<>(1001, "Amit");
        employee.display();
    }
}
