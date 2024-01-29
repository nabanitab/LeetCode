package dataStructureByGFG;

public class PalindromCheckUsingReccusion {

    public static void main(String[] args) {
        String s = "abba1";
        int start = 0;
        int n= 0;
        int end = n-1;
        System.out.println(palindromeCheck(s,0,s.length()-1));
    }

    public static boolean palindromeCheck(String s, int start,int end){
        if( start>= end){
            return true;

        }
        return ((s.charAt(start))== s.charAt(end))&& palindromeCheck(s,start+1,end-1);
    }

}
