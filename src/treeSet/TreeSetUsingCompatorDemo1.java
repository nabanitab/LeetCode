package treeSet;

import java.util.TreeSet;

public class TreeSetUsingCompatorDemo1 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>(new MyComparatorDemo1());
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(5);
        t.add(20);
        t.add(20);
        System.out.println(t);
    }
}
