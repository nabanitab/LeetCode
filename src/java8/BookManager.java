package java8;


import java.util.Arrays;

public class BookManager {
    public static void main(String[] args) {
        String[] bookTitles = { "The Hobbit", "1984", "To Kill a Mockingbird", "The Great Gatsby", "Moby Dick" };

        // Method reference to a static method
        Arrays.sort(bookTitles, BookManager::compareTitles);

        // Print the sorted array
        for(String title : bookTitles) {
            System.out.println(title);
        }
    }

    public static int compareTitles(String a, String b) {
        return a.compareTo(b);
    }
}