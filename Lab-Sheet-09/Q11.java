import java.util.TreeSet;

public class Q11 {
    public static void main(String[] args) {
        TreeSet<Integer> ids = new TreeSet<Integer>();
        ids.add(105);
        ids.add(102);
        ids.add(108);
        ids.add(102);
        ids.add(110);
        ids.add(105);
        ids.add(104);

        System.out.println("Unique sorted IDs: " + ids);
        System.out.println("First ID: " + ids.first());
        System.out.println("Last ID: " + ids.last());
        System.out.println("Higher than 105: " + ids.higher(105));
        System.out.println("Lower than 105: " + ids.lower(105));
    }
}
