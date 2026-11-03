import java.util.ArrayList;

public class Q09 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 5);
        }

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
