class Book {
    String title;
    String author;
    double price;
    static String publisher = "Pearson";

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        String details = "Title: " + title + ", Author: " + author;
        System.out.println(details);
        System.out.println("Price: " + price);
        System.out.println("Publisher: " + publisher);
    }
}

public class Q05 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James", 450);
        b.display();
    }
}
