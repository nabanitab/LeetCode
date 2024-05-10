package coreJava.concurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;

// This piece throws ConcurrentModificationException. Use either of the below hints to fix the code
//Hint 1: use removeIf
//Hint 2: use iterator to remove the item.
public class ConcureentArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Using removeIf method
        list.removeIf(integer -> integer.equals(3));

        for (Integer integer : list) {
            System.out.println("List Value:" + integer);
        }
        // Using iterator to safely remove elements while iterating

      /*  Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            if (integer.equals(3)) {
                iterator.remove();
            }
        }

        for (Integer integer : list) {
            System.out.println("List Value:" + integer);
        }
    }*/

    }
}
