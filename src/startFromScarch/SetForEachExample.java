package startFromScarch;

import java.util.HashSet;

public class SetForEachExample {

    public static void main(String[] args) {

        String s = "nabanita";

        HashSet<Character>set = new HashSet<>();

        s.chars().forEach(ch -> set.add((char) ch));

        set.forEach(System.out::print); // prints unique characters
    }
    }

