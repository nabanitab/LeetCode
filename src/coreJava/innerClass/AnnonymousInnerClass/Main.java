package coreJava.innerClass.AnnonymousInnerClass;

//Simple anonymous inner class

public class Main {
    public static void main(String[] args) {

        // Creating an instance of the class
        Movie popcorn = new Movie();

        // Using an anonymous inner class to extend Movie
        MovieExtended popcornExtended = new MovieExtended() {
            // Overriding method from Movie
            @Override
            public void watch() {
                System.out.println("Enjoying popcorn while watching the movie");
            }
        };

        // Calling the overridden method from the anonymous inner class
        popcornExtended.watch();
    }
}

// Base class
class Movie {
    public void watch() {
        System.out.println("Watching the movie");
    }
}

// Anonymous inner class extending Movie
class MovieExtended extends Movie {
    // No need to define explicitly in this case
}
