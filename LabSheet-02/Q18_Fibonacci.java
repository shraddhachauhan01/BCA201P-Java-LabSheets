// Lab Sheet 02 - Q18
// Print the first 20 terms of the Fibonacci sequence using a for loop.

public class Q18_Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;

        System.out.println("First 20 terms of the Fibonacci sequence:");

        for (int i = 1; i <= 20; i++) {
            System.out.print(first + " ");
            int next = first + second;   // each term is the sum of the previous two
            first = second;
            second = next;
        }
        System.out.println();
    }
}
