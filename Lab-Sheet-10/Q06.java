import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        try {
            FileWriter writer = new FileWriter("notes.txt", true);
            writer.write("Java is simple. Java supports file handling.\n");
            writer.close();

            System.out.print("Enter word to search: ");
            String word = sc.nextLine();

            BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String current : words) {
                    if (current.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            reader.close();

            if (count > 0) {
                System.out.println("Word found " + count + " time(s).");
            } else {
                System.out.println("Word not found.");
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file.");
        }
        sc.close();
    }
}
