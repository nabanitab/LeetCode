

public class ReverseString {
    public static void main(String[] args) {

        String s = "nabanita";

        System.out.println(getReverseString(s));
    }

    public static String getReverseString(String s){

        char [] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();


        for(int i = chars.length-1 ; i>= 0; i--){
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
