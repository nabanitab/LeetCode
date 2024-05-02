package coreJava.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);
        System.out.println(l);

        // Sorting in descending order
        Collections.sort(l, new MyComparator());
        System.out.println(l);

        // Performing binary search
        System.out.println(Collections.binarySearch(l, 13, new MyComparator()));
        System.out.println(Collections.binarySearch(l, 17));
    }
}

class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1); // Reversing the comparison logic
    }
}

