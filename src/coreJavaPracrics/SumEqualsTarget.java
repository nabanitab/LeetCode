package coreJavaPracrics;

import java.util.Arrays;
import java.util.List;

public class SumEqualsTarget {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 2, 1, 2, 5, 6);
        int target = 11;
        List<Integer> result = getTwoElementsWithSum(list, target);
        if (result != null) {
            System.out.println("Two elements whose sum equals target: " + result.get(0) + " and " + result.get(1));
        } else {
            System.out.println("No two elements whose sum equals target.");
        }
    }

    public static List<Integer> getTwoElementsWithSum(List<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return Arrays.asList(list.get(i), list.get(j));
                }
            }
        }
        return null;
    }
}


