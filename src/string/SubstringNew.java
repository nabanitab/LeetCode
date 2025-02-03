package string;

import java.util.ArrayList;
import java.util.List;

public class SubstringNew {


    public static void main(String args[]){

        String str = "aabbdc";

        List<String>result = getSubstring(str);
        System.out.println(result);

    }

    public static List<String> getSubstring(String str){

        List<String>revese = new ArrayList<>();

        for (int i = 0; i<str.length(); i++){
            for (int j = i+1; j<str.length(); j++){
                revese.add(str.substring(i,j));
            }
        }
        return revese;
    }
}
