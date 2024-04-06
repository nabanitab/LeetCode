package coreJavaPracrics;

import java.util.HashSet;

public class HashMapExp {

    public static void main(String[] args) {
        String s = "nabanita";
        System.out.println(removeDuplicate(s));
    }

    public static String removeDuplicate(String s) {


        StringBuilder sb = new StringBuilder();

      for(int i = s.length()-1; i>=0; i--){
          sb.append(s.charAt(i));
      }
        return sb.toString();
    }
}