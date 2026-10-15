// Lab Sheet 01 - Q23
// Input a temperature in Celsius and convert it to Fahrenheit
// using type casting and expressions.   F = (C * 9 / 5) + 32

import java.util.Scanner;

public class Q23_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        int celsius = sc.nextInt();

        // Without casting, celsius * 9 / 5 would be integer division and lose the decimal part.
        // Casting celsius to double keeps the decimal part.
        double fahrenheit = (double) celsius * 9 / 5 + 32;

        System.out.println(celsius + " C = " + fahrenheit + " F");
        sc.close();
    }
}
