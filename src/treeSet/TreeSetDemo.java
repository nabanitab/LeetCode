package treeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet set = new TreeSet<>();
        set.add(new StringBuffer("A"));
        set.add(new StringBuffer("Z"));
        set.add(new StringBuffer("L"));
        set.add(new StringBuffer("B"));

        System.out.println(set);//[A, B, L, Z]
        System.out.println("A".compareTo("Z"));//-25
        System.out.println("Z".compareTo("K"));//15
        System.out.println("A".compareTo("A"));//0
        System.out.println("A".compareTo(null));//Exception in thread "main" java.lang.NullPointerException

    }
}
