public class ReverseaStringOfWord {
    public static void main(String[] args) {
        String s = "string";
        System.out.println(getReverse(s));
    }

    public static String getReverse(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = ch.length-1; i>=0; i++){
            sb.append(s.toCharArray());
        }
       return sb.toString();

    }
}
