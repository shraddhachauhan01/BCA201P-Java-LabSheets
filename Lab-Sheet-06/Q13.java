import java.util.Scanner;

class InvalidDosageException extends Exception {
    InvalidDosageException(String message) {
        super(message);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter patient name: ");
            String patient = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drug = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            int dosage = Integer.parseInt(sc.nextLine());

            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException("Dosage must be between 1 mg and 1000 mg");
            }

            System.out.println("Patient: " + patient);
            System.out.println("Drug: " + drug);
            System.out.println("Dosage is valid");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid dosage");
        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Dosage validation completed.");
        }
    }
}
