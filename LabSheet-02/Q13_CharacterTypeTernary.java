// Lab Sheet 02 - Q13
// Check if a character is a vowel, consonant, digit or special symbol
// using the ternary operator.

import java.util.Scanner;

public class Q13_CharacterTypeTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        char lower = Character.toLowerCase(ch);
        boolean isLetter = (lower >= 'a' && lower <= 'z');
        boolean isDigit = (ch >= '0' && ch <= '9');
        boolean isVowel = (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u');

        String type = isDigit ? "Digit"
                    : isLetter ? (isVowel ? "Vowel" : "Consonant")
                    : "Special symbol";

        System.out.println("'" + ch + "' is a " + type);
        sc.close();
    }
}
