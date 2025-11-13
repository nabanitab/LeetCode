package fome;

import coreJava.inheritance.C;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class reverseString {
    public static void main(String[] args) {

        String s = "madam";
        //String s = "I Love java";
        // String s = "Susmita bapari";
        System.out.println(getFirstNonRepeating(s));

    }

    public static char getFirstNonRepeating(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

       for( Map.Entry<Character,Integer>res : map.entrySet()){
           if (res.getValue()==1){
               System.out.println(res);
           }
       }
        return 0;
    }
    //remove Duplicate

    public static String reverseString(String s) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.toString();
    }
    //Palindrom check

    public static boolean checkPalindrom(String s) {
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }


//Reverse the order of words, not the characters inside them.
 /*   public static String getReveseWord(String s){
       String[] words = s.split(" ");

        String str = "";
        for (int i = words.length-1; i>=0; i--){
          str = str+words[i] + " ";
        }
        return str.trim();
    }*/

/*    //Revese characters inside  each word of a sentance
    public static String getEachRevese(String s){

        //spilt the sentence into words by space
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word : words){
            StringBuilder reveseWord = new StringBuilder();

            for(int i = word.length()-1; i>=0; i--){
                reveseWord.append(word.charAt(i));
            }

            result.append(reveseWord).append(" ");
        }
        //trip extra space
        return result.toString().trim();

    }*/

    //Revese string
/*    public static String getRevese(String s){
        String str = "";
        for(int i= s.length()-1; i>=0; i--){

            str+=s.charAt(i);

        }
        return str;
    }*/
}
