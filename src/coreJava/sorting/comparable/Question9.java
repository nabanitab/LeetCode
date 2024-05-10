package coreJava.sorting.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

////sort the list based on age in ascending order
//// or use java 8 notation to sort the list in ascending order
public class Question9 {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(2, "b"));
        list.add(new Person(4, "d"));
        list.add(new Person(1, "a"));
        list.add(new Person(3, "c"));
        list.add(new Person(5, "e"));

        Collections.sort(list);

        // Printing the sorted list
        for (Person person : list) {
            System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
        }
    }
}
