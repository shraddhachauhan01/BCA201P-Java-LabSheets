// Lab Sheet 02 - Q20
// Repeatedly accept a password until the correct one is entered (use do-while).

import java.util.Scanner;

public class Q20_PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123";   // the password we are checking against
        String entered;
        int attempts = 0;

        // do-while runs the body at least once, then repeats while the password is wrong
        do {
            System.out.print("Enter password: ");
            entered = sc.nextLine();
            attempts++;

            if (!entered.equals(correctPassword)) {
                System.out.println("Wrong password. Try again.");
            }
        } while (!entered.equals(correctPassword));

        System.out.println("Correct password! Access granted after " + attempts + " attempt(s).");
        sc.close();
    }
}
