package java8;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatteFromString {

    static void main() {
        String input ="welcome";

        Set<Character> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();


        for(char c : input.toCharArray()){
            if(set.add(c)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

    }
}
