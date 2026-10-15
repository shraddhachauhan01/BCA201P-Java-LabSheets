// Lab Sheet 01 - Q29
// Input the height (in cm) of a person and classify them as
// short (< 150), average (150 - 170) or tall (> 170).

import java.util.Scanner;

public class Q29_HeightClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        if (height <= 0) {
            System.out.println("Height must be greater than 0.");
        } else if (height < 150) {
            System.out.println("The person is short.");
        } else if (height <= 170) {
            System.out.println("The person has average height.");
        } else {
            System.out.println("The person is tall.");
        }
        sc.close();
    }
}
