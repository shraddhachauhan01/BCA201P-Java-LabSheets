import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Q08 {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        try {
            FileWriter writer = new FileWriter("input.txt");
            writer.write("Java Lab 2026\nFile Handling");
            writer.close();

            FileReader reader = new FileReader("input.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                char c = (char) ch;
                if (Character.isLetter(c)) {
                    char lower = Character.toLowerCase(c);
                    if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                } else if (Character.isDigit(c)) {
                    digits++;
                } else if (c == ' ') {
                    spaces++;
                }
            }
            reader.close();

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
            System.out.println("Digits: " + digits);
            System.out.println("Spaces: " + spaces);
        } catch (IOException e) {
            System.out.println("Error while processing input.txt.");
        }
    }
}
