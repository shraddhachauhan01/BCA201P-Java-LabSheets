import java.util.ArrayList;
import java.util.HashSet;

public class Q10 {
    public static void main(String[] args) {
        int[] values = {10, 20, 10, 30, 20, 40, 30};

        ArrayList<Integer> list = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for (int value : values) {
            list.add(value);
            set.add(value);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
        System.out.println("Difference: ArrayList allows duplicate values and maintains insertion order.");
        System.out.println("HashSet stores only unique values and does not guarantee insertion order.");
    }
}
