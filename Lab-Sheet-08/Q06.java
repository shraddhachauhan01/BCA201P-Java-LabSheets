public class Q06 {
    static class Employee<T, U> {
        T id;
        U name;

        Employee(T id, U name) {
            this.id = id;
            this.name = name;
        }

        void display() {
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
        }
    }

    public static void main(String[] args) {
        Employee<Integer, String> employee = new Employee<>(1001, "Neha");
        employee.display();
    }
}
