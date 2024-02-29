package hashmap;

import java.util.HashMap;

// Given an array of integers, find the frequency of each element and return it as a HashMap where the keys
// are the elements and the values are their frequencies.

public class FindFrequencyOrOccuranceOfElement {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 1, 2, 4, 5, 6, 2, 2};
        HashMap<Integer, Integer> frequencyMap = findFrequency(arr);

        for (int key : frequencyMap.keySet()) {
            System.out.println("Element " + key + " occurs " + frequencyMap.get(key) + " times.");
        }
    }

    public static HashMap<Integer,Integer> findFrequency(int[] arr){

        HashMap<Integer,Integer>map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return map;
    }
    }

