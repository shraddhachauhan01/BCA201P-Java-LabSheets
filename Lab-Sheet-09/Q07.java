import java.util.ArrayList;
import java.util.Collections;

public class Q07 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(10);

        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);
        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));
        System.out.println("Frequency of 10: " + Collections.frequency(numbers, 10));
    }
}
