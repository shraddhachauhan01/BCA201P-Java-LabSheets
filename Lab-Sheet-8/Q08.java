public class Q08 {
    static <T> void displayThree(T first, T second, T third) {
        System.out.println(first + ", " + second + ", " + third);
    }

    public static void main(String[] args) {
        displayThree(1, 2, 3);
        displayThree("Java", "Python", "C");
        displayThree(1.5, 2.5, 3.5);
    }
}
