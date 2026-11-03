import java.util.ArrayList;
import java.util.Scanner;

public class Q15 {
    static class Student<T, U, V> {
        T id;
        U name;
        V marks;

        Student(T id, U name, V marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
        }
    }

    static void displayStudents(ArrayList<Student<Integer, String, Double>> students) {
        for (Student<Integer, String, Double> student : students) {
            student.display();
        }
    }

    public static void main(String[] args) {
        ArrayList<Student<Integer, String, Double>> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        students.add(new Student<>(101, "Amit", 85.5));
        students.add(new Student<>(102, "Neha", 90.0));
        students.add(new Student<>(103, "Riya", 78.5));
        students.add(new Student<>(104, "Rahul", 82.0));
        students.add(new Student<>(105, "Priya", 88.0));

        System.out.println("All Students:");
        displayStudents(students);

        System.out.print("Enter student ID to search: ");
        int searchId = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id.equals(searchId)) {
                System.out.println("Student found:");
                students.get(i).display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        System.out.println("Total students: " + students.size());
        System.out.println("ID 101 exists: " + students.contains(students.get(0)));

        sc.close();
    }
}
