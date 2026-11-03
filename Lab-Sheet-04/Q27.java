class StringReverse {
    static int totalReversals = 0;

    void reverse(String text) {
        String reversed = "";
        totalReversals++;

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}

public class Q27 {
    public static void main(String[] args) {
        StringReverse s = new StringReverse();
        s.reverse("Java");
        System.out.println("Total reversals: " + StringReverse.totalReversals);
    }
}
