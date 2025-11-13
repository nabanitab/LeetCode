
public class ReverseString {
    public static void main(String[] args) {

        String s = "nabanita";

        System.out.println(getReverseString(s));
    }

    public static String getReverseString(String s){


       String result = "";

        for(int i = s.length()-1 ; i>= 0; i--){
           result+=s.charAt(i);
        }
       return result;
    }
}
