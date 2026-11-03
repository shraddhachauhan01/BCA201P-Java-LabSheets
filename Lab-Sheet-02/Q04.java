import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visitors = 0;

        System.out.print("Enter number of visitors entering: ");
        int entering = sc.nextInt();

        for (int i = 0; i < entering; i++) {
            if (i % 2 == 0) {
                ++visitors;
            } else {
                visitors++;
            }
            System.out.println("Current visitors: " + visitors);
        }

        System.out.print("Enter number of visitors leaving: ");
        int leaving = sc.nextInt();

        for (int i = 0; i < leaving; i++) {
            if (visitors > 0) {
                visitors--;
                System.out.println("Current visitors: " + visitors);
            } else {
                System.out.println("Store is empty");
                break;
            }
        }

        System.out.println("Visitors inside store: " + visitors);
    }
}