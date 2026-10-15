// Lab Sheet 02 - Q29
// Generate random integers between 1 and 100 and stop when a number divisible
// by both 7 and 13 is found, using break.
// (The only such number from 1 to 100 is 91, because 7 x 13 = 91.)
// Note: the numbers are random, so the output is different on every run.

import java.util.Random;

public class Q29_RandomBreak {
    public static void main(String[] args) {
        Random rand = new Random();
        int count = 0;

        while (true) {
            int num = rand.nextInt(100) + 1;   // random number from 1 to 100
            count++;
            System.out.println("Number " + count + ": " + num);

            if (num % 7 == 0 && num % 13 == 0) {
                System.out.println("Found " + num + ", which is divisible by both 7 and 13.");
                break;                          // stop the loop
            }
        }
        System.out.println("Total numbers generated: " + count);
    }
}
