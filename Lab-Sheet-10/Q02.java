import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q02 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("student.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File does not exist or cannot be read.");
        }
    }
}
