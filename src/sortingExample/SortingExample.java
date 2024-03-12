package sortingExample;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("orange");

        Collections.sort(list); // Sorts the ArrayList in ascending order
        System.out.println("Sorted ArrayList: " + list);
    }
}
