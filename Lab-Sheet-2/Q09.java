import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        int i = 0;
        int result = 0;

        while (i < str1.length() && i < str2.length()) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 < ch2) {
                result = -1;
                break;
            } else if (ch1 > ch2) {
                result = 1;
                break;
            }
            i++;
        }

        if (result == 0) {
            if (str1.length() < str2.length()) {
                result = -1;
            } else if (str1.length() > str2.length()) {
                result = 1;
            }
        }

        if (result < 0) {
            System.out.println("First string comes before second string");
        } else if (result > 0) {
            System.out.println("First string comes after second string");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}
