class Fibonacci {
    static int seriesCount = 0;

    void display(int n) {
        int first = 0;
        int second = 1;
        int next;
        seriesCount++;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}

public class Q24 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.display(10);
        System.out.println("Series displayed: " + Fibonacci.seriesCount);
    }
}
