// Lab Sheet 01 - Q8
// Input a character and check whether it is a vowel or a consonant using if-else.

import java.util.Scanner;

public class Q08_VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        // Convert to lowercase so that 'A' and 'a' are treated the same
        char lower = Character.toLowerCase(ch);

        if (lower >= 'a' && lower <= 'z') {          // it is a letter
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not a letter.");
        }
        sc.close();
    }
}
