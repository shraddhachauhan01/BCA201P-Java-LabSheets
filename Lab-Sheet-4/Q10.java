class Movie {
    String name;
    String genre;
    double rating;
    static String industry = "Bollywood";

    Movie(String name, String genre, double rating) {
        this.name = name;
        this.genre = genre;
        this.rating = rating;
    }

    void display() {
        String details = "Name: " + name + ", Genre: " + genre;
        System.out.println(details);
        System.out.println("Rating: " + rating);
        System.out.println("Industry: " + industry);
    }
}

public class Q10 {
    public static void main(String[] args) {
        Movie m = new Movie("3 Idiots", "Comedy-Drama", 8.4);
        m.display();
    }
}
