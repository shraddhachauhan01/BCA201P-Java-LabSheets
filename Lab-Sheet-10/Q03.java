import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Q03 {
    public static void main(String[] args) {
        int lines = 0;
        int words = 0;
        int characters = 0;

        try {
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Java is a programming language.\n");
            writer.write("File handling is useful.");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                lines++;
                characters += line.length();
                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    words += trimmed.split("\\s+").length;
                }
            }
            reader.close();

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + characters);
        } catch (IOException e) {
            System.out.println("Error while processing the file.");
        }
    }
}
