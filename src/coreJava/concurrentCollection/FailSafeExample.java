package coreJava.concurrentCollection;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
    public static void main(String[] args) {

        //If we write ArrayList we will get concurrent modification exception
        //it is not generally permissible for one thread to modify a Collection while another thread is
        // iterating over it. If we write copyOnWriteArrayList exception will be not error.
        //ArrayList<String>al = new ArrayList<>();


        //CopyOnWriteArrayList is Fail safe & ArrayList is fail fast
        CopyOnWriteArrayList<String>al = new CopyOnWriteArrayList<>();

        al.add("1");
        al.add("2");
        al.add("3");
        al.add("4");

        for (String s:al
             ) {
            al.remove("2");
        }
        for (String s:al
             ) {
            System.out.println(s);
        }
    }
}
