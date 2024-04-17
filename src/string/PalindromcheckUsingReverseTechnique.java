package string;

public class PalindromcheckUsingReverseTechnique {
    public static void main(String[] args) {
        String str = "nabo";
        System.out.println(getPalindrome(str));
    }


    public static boolean getPalindrome(String str) {

        String reverseString = "";
        for (int i = str.length() - 1; i>=0; i--) {
            reverseString = reverseString+ str.charAt(i);
        }
       if(str.toLowerCase().equals(reverseString.toLowerCase())) {
           return true;
       }else {
           return false;
       }
    }
}
