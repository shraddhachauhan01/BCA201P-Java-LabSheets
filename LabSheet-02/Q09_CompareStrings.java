// Lab Sheet 02 - Q9
// Compare two strings for lexicographic (dictionary) order without using
// built-in compare functions. Relational operators are used on characters.

import java.util.Scanner;

public class Q09_CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        // Find the length of the shorter string
        int shorter = s1.length();
        if (s2.length() < shorter) {
            shorter = s2.length();
        }

        int result = 0;   // 0 = equal, -1 = s1 comes first, 1 = s2 comes first

        // Compare character by character until a difference is found
        for (int i = 0; i < shorter; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 < c2) {
                result = -1;
                break;
            } else if (c1 > c2) {
                result = 1;
                break;
            }
        }

        // If all characters matched, the shorter string comes first
        if (result == 0) {
            if (s1.length() < s2.length()) {
                result = -1;
            } else if (s1.length() > s2.length()) {
                result = 1;
            }
        }

        if (result == -1) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in dictionary order.");
        } else if (result == 1) {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in dictionary order.");
        } else {
            System.out.println("Both strings are equal.");
        }
        sc.close();
    }
}
