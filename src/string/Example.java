package string;

import java.util.HashMap;
import java.util.HashSet;

public class Example {
    public static void main(String args[]){

        String s = "Susmita";

        System.out.println(getReverese(s));
    }

  public  static String getReverese(String s){

      HashSet<String> set =  new HashSet<>();

      StringBuilder sb = new StringBuilder();

      for (Character c : s.toCharArray()) {
            if(set.add(s)){
                sb.append(c);
            }
      }
      return sb.toString();
  }
}
