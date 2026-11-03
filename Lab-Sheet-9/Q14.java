import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Q14 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        LinkedList<String> linkedList = new LinkedList<String>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add(1, "C++");
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add(1, "C++");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        arrayList.remove("C++");
        linkedList.remove("C++");
        System.out.println("After deletion:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        System.out.println("ArrayList get(0): " + arrayList.get(0));
        System.out.println("LinkedList get(0): " + linkedList.get(0));
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        System.out.println("ArrayList iteration:");
        Iterator<String> a = arrayList.iterator();
        while (a.hasNext()) {
            System.out.println(a.next());
        }

        System.out.println("LinkedList iteration:");
        Iterator<String> b = linkedList.iterator();
        while (b.hasNext()) {
            System.out.println(b.next());
        }

        System.out.println("\nComparison Table");
        System.out.println("Operation       ArrayList                 LinkedList");
        System.out.println("Insertion       Dynamic array             Doubly linked list");
        System.out.println("Deletion        May shift elements         Updates links");
        System.out.println("get(index)      Generally faster           Traverses nodes");
        System.out.println("size()          Returns number of elements Returns number of elements");
        System.out.println("Iteration       Supports iteration         Supports iteration");
    }
}
