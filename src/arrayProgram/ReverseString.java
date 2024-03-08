package arrayProgram;

//Write Java Program to reverse String without using reverse methods
public class ReverseString {

    public static void main(String[] args) {

        String s = "Nabanita";

        System.out.println(getReverseString(s));

    }

    public static  String getReverseString(String s){

        StringBuilder sb = new StringBuilder();

        for (int i = s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
