package interview;
/*
    Sorting of anagrams:
        - by letters in word
        - by the number of words in each of sub arrays

    Input array: ["eat", "ate", "cat", "elbow", "below", "tea"]

    Output array: [["cat"], ["elbow", "below"], ["ate", "eat", "tea"]]
    *//*
public class Main {
    public static void main(String[] args) {
        String[] inputStr = {"eat", "ate", "cat", "elbow", "below", "tea"};
        System.out.println(sortString(inputStr));
    }
    private static List<List<String>> sortString(String[] words) {
        // put your solution here
    }
}
    has context menu*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String[] inputStr = {"eat", "ate", "cat", "elbow", "below", "tea"};

    List<List<String>> result = sortString(inputStr);
        System.out.println(result);
    }

    private static List<List<String>> sortString(String[] inputStr) {

        HashMap<Integer,String>firstMap = new HashMap<>();


        for (String c :inputStr
             ) {
            firstMap.put(0,firstMap.getOrDefault(0,c));

        }

        HashMap<Integer,String>secondMap = new HashMap<>();

        for (String s:inputStr
             ) {
            secondMap.put(0,secondMap.getOrDefault(0,s));
        }

        List<List<String>> output = new ArrayList<>();

        if(firstMap==secondMap){
            return output;
        }
        return null;
    }

}
