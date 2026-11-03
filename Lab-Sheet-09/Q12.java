import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> patientNames = new ArrayList<String>();
        HashSet<String> patientIds = new HashSet<String>();

        patientNames.add("Aarav");
        patientNames.add("Diya");
        patientIds.add("P101");
        patientIds.add("P102");

        System.out.println("Initial patient names: " + patientNames);
        System.out.println("Initial unique patient IDs: " + patientIds);

        System.out.print("Enter patient name to add: ");
        String name = sc.nextLine();
        System.out.print("Enter patient ID to add: ");
        String id = sc.nextLine();
        patientNames.add(name);
        patientIds.add(id);

        System.out.print("Enter patient name to remove: ");
        String removeName = sc.nextLine();
        patientNames.remove(removeName);

        System.out.print("Enter patient ID to search: ");
        String searchId = sc.nextLine();
        if (patientIds.contains(searchId)) {
            System.out.println("Patient ID found.");
        } else {
            System.out.println("Patient ID not found.");
        }

        System.out.println("Patient names: " + patientNames);
        System.out.println("Patient IDs: " + patientIds);
        sc.close();
    }
}
