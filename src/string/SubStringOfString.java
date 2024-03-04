package string;

import java.util.ArrayList;
import java.util.List;

public class SubStringOfString {

    public static void main(String[] args) {
        String s = "abcd";
      List<String>str = getSubString(s);
        for (String substring : str) {
            System.out.println(substring);
        }
    }

    public static List<String> getSubString(String s){
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i<s.length();i++){
            for (int j = i+1; j<=s.length();j++){
                list.add(s.substring(i,j));
            }
        }
       return  list;
    }

}
