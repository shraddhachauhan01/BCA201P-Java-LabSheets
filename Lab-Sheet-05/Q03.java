public class Q03 {
    public static void main(String[] args) {
        String number = "12a";

        try {
            int value = Integer.parseInt(number);
            System.out.println("Integer value: " + value);
        } catch (NumberFormatException e) {
            System.out.println("The string is not a valid integer");
        }
    }
}
