public class Q02 {
    static class Result<T> {
        T marks;

        Result(T marks) {
            this.marks = marks;
        }

        void display() {
            System.out.println("Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Result<Integer> result1 = new Result<>(85);
        Result<Double> result2 = new Result<>(91.5);

        result1.display();
        result2.display();
    }
}
