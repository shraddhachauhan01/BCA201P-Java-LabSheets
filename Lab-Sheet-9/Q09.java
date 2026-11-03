import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Q09 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();
        students.add("Aman");
        students.add("Riya");
        students.add("Rahul");
        students.add("Priya");

        ListIterator<String> iterator = students.listIterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Riya")) {
                iterator.set("Ananya");
                iterator.add("Karan");
            }
        }

        System.out.println("Modified list: " + students);
    }
}
