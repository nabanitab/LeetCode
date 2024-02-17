package string;

import java.util.HashSet;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "nabanita";
        String result = getUniqueCharacters(str);
        System.out.println(result);
    }

    private static String getUniqueCharacters(String str){
        HashSet<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (set.add(ch)) { // Add the character to the set if it's not already present
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }
}
