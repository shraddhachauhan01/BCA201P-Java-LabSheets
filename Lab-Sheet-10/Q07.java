import java.io.File;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file or directory name: ");
        String name = sc.nextLine();

        File file = new File(name);
        System.out.println("Exists: " + file.exists());
        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("File size: " + file.length() + " bytes");
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        sc.close();
    }
}
