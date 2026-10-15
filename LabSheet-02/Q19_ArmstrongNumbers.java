// Lab Sheet 02 - Q19
// Print all Armstrong numbers between 1 and 1000 using a for loop.
// Armstrong number: sum of each digit raised to the power of the number of digits.
// Example: 153 = 1^3 + 5^3 + 3^3

public class Q19_ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int num = 1; num <= 1000; num++) {

            // Step 1: count the digits of num
            int digits = 0;
            int temp = num;
            while (temp > 0) {
                digits++;
                temp = temp / 10;
            }

            // Step 2: add each digit raised to the power of 'digits'
            int sum = 0;
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;
                for (int i = 0; i < digits; i++) {
                    power = power * digit;
                }
                sum = sum + power;
                temp = temp / 10;
            }

            // Step 3: compare
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
