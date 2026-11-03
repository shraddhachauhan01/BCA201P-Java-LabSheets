import java.util.ArrayList;

public class Q10 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Amit");
        names.add("Neha");
        names.add("Riya");
        names.add("Rahul");
        names.add("Karan");

        System.out.println("Names: " + names);
        System.out.println("Element at index 1: " + names.get(1));

        names.set(1, "Priya");
        System.out.println("After set(): " + names);

        names.remove(3);
        System.out.println("After remove(): " + names);
        System.out.println("Size: " + names.size());
    }
}
