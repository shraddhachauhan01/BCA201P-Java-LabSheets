class Library {
    int booksAvailable;
    static String libraryName = "Central Library";

    Library(int booksAvailable) {
        this.booksAvailable = booksAvailable;
    }

    void issueBook() {
        if (booksAvailable > 0) {
            booksAvailable--;
            System.out.println("Book issued");
        } else {
            System.out.println("No books available");
        }
    }

    void returnBook() {
        booksAvailable++;
        System.out.println("Book returned");
    }

    void display() {
        int currentBooks = booksAvailable;
        System.out.println("Library: " + libraryName);
        System.out.println("Books available: " + currentBooks);
    }
}

public class Q30 {
    public static void main(String[] args) {
        Library library = new Library(10);
        library.issueBook();
        library.returnBook();
        library.display();
    }
}
