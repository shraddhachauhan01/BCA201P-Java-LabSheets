import java.util.ArrayList;
import java.util.ListIterator;

public class Q13 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("Java");
        courses.add("Python");
        courses.add("DBMS");
        courses.add("Networking");
        courses.add("Operating Systems");

        ListIterator<String> iterator = courses.listIterator();

        System.out.println("Forward traversal:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println("Next index: " + iterator.nextIndex());
        }

        System.out.println("Backward traversal:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
            System.out.println("Previous index: " + iterator.previousIndex());
        }
    }
}
