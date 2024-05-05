package coreJava.concurrentCollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        ConcurrentHashMap chm = new ConcurrentHashMap<>();
        chm.put(101,"durga");
        chm.put(102,"soft");
        chm.putIfAbsent(103,"soln");
        chm.remove(101,"D");
        chm.replace(102,"soft","software");
        System.out.println(chm);
    }
}
