package java8;


//input : {1,2,3,7,8,5,2,7,3}

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer>list = new ArrayList<>();
        Collections.addAll(list,1,2,3,7,8,5,2,7,3);

          //if we wanted to price without duplicate number:
         // Set<Integer>set = list.stream().collect(Collectors.toSet());
        // System.out.println(set);

        //if we wanted to price only duplicate number:
        Set<Integer> uniqueSet = new HashSet<>();
        Set<Integer> duplicates = list.stream()
                .filter(n -> !uniqueSet.add(n)) // Filter out duplicates
                .collect(Collectors.toSet());

        System.out.println("Duplicate numbers: " + duplicates);
    }
}


