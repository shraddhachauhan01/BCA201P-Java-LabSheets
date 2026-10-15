// Lab Sheet 02 - Q4
// Demonstrate prefix and postfix increment by simulating a counter
// for visitors entering and leaving a store.
//   Postfix (count++) : uses the current value first, then changes it.
//   Prefix  (++count) : changes the value first, then uses it.

public class Q04_VisitorCounter {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Store opens. Visitors inside: " + count);

        // Postfix increment: the old value is shown, then the count increases
        System.out.println("\nVisitor enters (postfix count++)");
        System.out.println("Value shown by count++ : " + (count++));
        System.out.println("Visitors inside now    : " + count);

        // Prefix increment: the count increases first, then the new value is shown
        System.out.println("\nVisitor enters (prefix ++count)");
        System.out.println("Value shown by ++count : " + (++count));
        System.out.println("Visitors inside now    : " + count);

        // One more visitor enters
        count++;
        System.out.println("\nAnother visitor enters. Visitors inside: " + count);

        // Decrement is used when visitors leave
        System.out.println("\nVisitor leaves (postfix count--)");
        System.out.println("Value shown by count-- : " + (count--));
        System.out.println("Visitors inside now    : " + count);

        System.out.println("\nVisitor leaves (prefix --count)");
        System.out.println("Value shown by --count : " + (--count));
        System.out.println("Visitors inside now    : " + count);
    }
}
