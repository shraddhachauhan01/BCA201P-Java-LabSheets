class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String trimmed = sentence.trim();
        int count;

        if (trimmed.isEmpty()) {
            count = 0;
        } else {
            String[] words = trimmed.split("\\s+");
            count = words.length;
        }

        System.out.println("Language: " + language);
        System.out.println("Word count: " + count);
    }
}

public class Q28 {
    public static void main(String[] args) {
        WordCounter w = new WordCounter();
        w.countWords("Java is an object oriented language");
    }
}
