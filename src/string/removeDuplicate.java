package string;

import java.util.HashSet;

public class removeDuplicate {
    public static void main(String args[]) {

    //    String s = "manindra";

        int arr [] = {1,2,3,5,6,6,1,2,3};

        System.out.println(getDuplicate(arr));
    }

    public static String getDuplicate(int[] arr) {

        HashSet<Integer> hashSet = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for (int c : arr) {
            if (!hashSet.contains(c)) {
                hashSet.add(c);
                sb.append(c);
              }
            }
            return sb.toString();
        }
    }

