import java.util.ArrayList;

public class Q02 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(78);
        marks.add(85);
        marks.add(92);
        marks.add(67);
        marks.add(88);

        System.out.println("First mark: " + marks.get(0));
        System.out.println("Middle mark: " + marks.get(2));
        System.out.println("Last mark: " + marks.get(marks.size() - 1));
    }
}
