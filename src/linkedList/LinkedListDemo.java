package linkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
        l.add("durga");
        l.add(30);
        l.add(null);
        l.set(0,"software");
        l.add(0,"venkey");
        l.removeLast();
        l.addFirst("ccc");
        System.out.println(l);
    }
}
