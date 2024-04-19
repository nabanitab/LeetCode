package practics;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        String s = "mampi";
        String result = (getReverse(s));
        System.out.println(s+" unique charecter  : "+ result);
    }

    private static String getReverse(String s) {

        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()
        ) {
            if (set.add(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

}
