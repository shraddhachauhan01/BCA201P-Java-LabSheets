// Lab Sheet 01 - Q6
// Accept a character and print its ASCII value.

import java.util.Scanner;

public class Q06_AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);   // take the first character typed

        int ascii = (int) ch;            // casting a char to int gives its ASCII value
        System.out.println("ASCII value of '" + ch + "' is " + ascii);
        sc.close();
    }
}
