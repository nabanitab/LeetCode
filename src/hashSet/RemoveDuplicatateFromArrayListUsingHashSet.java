package hashSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatateFromArrayListUsingHashSet {

    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 4, 3, 2, 1, 4));

        HashSet<Integer>hashSet = new HashSet<>(al);
        System.out.println(hashSet);
    }
}
