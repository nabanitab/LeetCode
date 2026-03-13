public class ReverseaStringOfWord {
    public static void main(String[] args) {
        String s = "string";
        System.out.println(getReverse(s));
    }

    public static String getReverse(String s) {

        String res = "";
        for(int i = s.length()-1; i>=0; i++){
            res+=s;
        }


        return res;
    }
}
