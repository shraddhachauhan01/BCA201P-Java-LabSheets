import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter employee ID: ");
            String id = sc.nextLine();
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter department: ");
            String department = sc.nextLine();
            System.out.print("Enter salary: ");
            String salary = sc.nextLine();

            File file = new File("employees.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(id + "|" + name + "|" + department + "|" + salary + "\n");
            writer.close();

            System.out.print("Enter employee ID to search: ");
            String searchId = sc.nextLine();
            boolean found = false;

            if (file.exists()) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] data = line.split("\\|", -1);
                    if (data.length == 4 && data[0].equals(searchId)) {
                        System.out.println("Employee ID: " + data[0]);
                        System.out.println("Employee Name: " + data[1]);
                        System.out.println("Department: " + data[2]);
                        System.out.println("Salary: " + data[3]);
                        found = true;
                        break;
                    }
                }
                reader.close();
            } else {
                System.out.println("Employee file does not exist.");
            }

            if (!found) {
                System.out.println("Employee record not found.");
            }
        } catch (IOException e) {
            System.out.println("File handling error.");
        }
        sc.close();
    }
}
