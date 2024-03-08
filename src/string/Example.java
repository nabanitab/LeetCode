package string;

public class Example {
    public static void main(String args[]){

        String s = "Susmita";

        System.out.println(getReverese(s));
    }

    public static  String getReverese(String s){

        StringBuilder sb = new StringBuilder();

        for(int i = s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
      return sb.toString();

    }
}
