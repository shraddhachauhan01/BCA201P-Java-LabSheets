import java.util.ArrayList;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("BCA");
        courses.add("BBA");
        courses.add("BCom");
        courses.add("BA");
        courses.add("BSc");

        System.out.print("Enter course name to search: ");
        String course = sc.nextLine();

        if (courses.contains(course)) {
            System.out.println("Course exists in the list.");
        } else {
            System.out.println("Course does not exist in the list.");
        }
        sc.close();
    }
}
