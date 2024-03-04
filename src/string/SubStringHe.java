package string;

import java.util.ArrayList;
import java.util.List;


//time complexity is :O(n^3)
public class SubStringHe {
    public static void main(String[] args) {

        String s = " abcd";

        List<String> result = getStringWord(s);

        for (String str : result) {

            System.out.println(str);
        }
    }

    public static List<String> getStringWord(String s) {


        List<String> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {

                list.add(s.substring(i, j));

            }
        }
        return list;
    }
}