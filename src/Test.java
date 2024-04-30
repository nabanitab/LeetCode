public class Test {

    public static void main(String[] args) {

        String s = "nita";
        String s1 = "nita";

      String result = addTwoString(s,s1);
        System.out.println(result);
    }

    private static String addTwoString(String s, String s1){
       StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            for (int j = i+1; j<s1.length(); j++){
                if(s.charAt(i)==s1.charAt(j)){
                    sb.append(s.charAt(i));
                }else {
                    return sb.toString();
                }
            }
        }
     return sb.toString();
    }
}
