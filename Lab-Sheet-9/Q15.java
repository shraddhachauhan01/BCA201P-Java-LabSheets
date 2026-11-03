import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<String>();
        HashSet<Integer> studentIds = new HashSet<Integer>();
        TreeSet<Integer> sortedIds = new TreeSet<Integer>();
        int choice;

        do {
            System.out.println("\n1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. Display students");
            System.out.println("5. Count students");
            System.out.println("6. Iterate forward and backward");
            System.out.println("7. Display collection differences");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter student ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                students.add(name + "|" + id);
                studentIds.add(id);
                sortedIds.add(id);
                System.out.println("Student added.");
            } else if (choice == 2) {
                System.out.print("Enter student name to remove: ");
                String name = sc.nextLine();
                boolean removed = false;
                for (int i = 0; i < students.size(); i++) {
                    String[] record = students.get(i).split("\\|");
                    if (record[0].equalsIgnoreCase(name)) {
                        students.remove(i);
                        removed = true;
                        break;
                    }
                }
                if (removed) {
                    studentIds.clear();
                    sortedIds.clear();
                    for (String record : students) {
                        String[] data = record.split("\\|");
                        int id = Integer.parseInt(data[1]);
                        studentIds.add(id);
                        sortedIds.add(id);
                    }
                    System.out.println("Student removed.");
                } else {
                    System.out.println("Student not found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter student name to search: ");
                String name = sc.nextLine();
                boolean found = false;
                for (String record : students) {
                    if (record.split("\\|")[0].equalsIgnoreCase(name)) {
                        System.out.println("Student found: " + record);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("Student not found.");
                }
            } else if (choice == 4) {
                System.out.println("Student records: " + students);
                System.out.println("Unique IDs: " + studentIds);
                System.out.println("Sorted IDs: " + sortedIds);
            } else if (choice == 5) {
                System.out.println("Total students: " + students.size());
            } else if (choice == 6) {
                ListIterator<String> iterator = students.listIterator();
                System.out.println("Forward:");
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
                System.out.println("Backward:");
                while (iterator.hasPrevious()) {
                    System.out.println(iterator.previous());
                }
            } else if (choice == 7) {
                System.out.println("List keeps insertion order and allows duplicates: " + students);
                System.out.println("Set keeps unique IDs: " + studentIds);
                System.out.println("SortedSet keeps unique IDs in sorted order: " + sortedIds);
            } else if (choice != 0) {
                System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
