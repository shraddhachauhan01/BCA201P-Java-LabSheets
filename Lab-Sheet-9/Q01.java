import java.util.ArrayList;

public class Q01 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Aman");
        students.add("Riya");
        students.add("Rahul");
        students.add("Priya");
        students.add("Karan");
        students.add("Neha");
        students.add("Arjun");
        students.add("Simran");
        students.add("Vikas");
        students.add("Anjali");

        System.out.println("Student Names:");
        for (String name : students) {
            System.out.println(name);
        }
        System.out.println("Total students: " + students.size());
    }
}
