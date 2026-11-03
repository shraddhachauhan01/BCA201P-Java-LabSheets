import java.util.HashSet;

public class Q04 {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<String>();
        departments.add("Computer Science");
        departments.add("Commerce");
        departments.add("Management");
        departments.add("Computer Science");
        departments.add("Science");
        departments.add("Commerce");

        System.out.println("Unique departments:");
        for (String department : departments) {
            System.out.println(department);
        }
    }
}
