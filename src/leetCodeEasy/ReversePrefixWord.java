package leetCodeEasy;

public class ReversePrefixWord { //solution 2000

    public static void main(String[] args) { //dcbaefd

        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    static String reversePrefix(String word, char ch) {

        StringBuilder sb = new StringBuilder();

        int n = word.indexOf(ch);

        for (int i = n; i >= 0; i--) {
            sb.append(word.charAt(i));
        }
        for (int i = n + 1; i < word.length(); i++) {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
