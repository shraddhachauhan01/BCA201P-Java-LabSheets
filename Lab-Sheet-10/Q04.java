import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter roll number: ");
            String roll = sc.nextLine();
            System.out.print("Enter marks: ");
            String marks = sc.nextLine();

            FileWriter writer = new FileWriter("students.txt", true);
            writer.write("Name: " + name + ", Roll Number: " + roll + ", Marks: " + marks + "\n");
            writer.close();
            System.out.println("Student record appended successfully.");
        } catch (IOException e) {
            System.out.println("Error while appending data.");
        }
        sc.close();
    }
}
