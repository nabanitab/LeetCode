package string;

public class ReverseLetterInAWord {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(reverseWord(word)).append(" ");
        }

        return result.toString().trim();
    }

    private String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        ReverseLetterInAWord reverseLetterInAWord = new ReverseLetterInAWord();

        // Example 1
        String s1 = "Let's take LeetCode contest";
        System.out.println(reverseLetterInAWord.reverseWords(s1)); // Output: "s'teL ekat edoCteeL tsetnoc"

        // Example 2
        String s2 = "God Ding";
        System.out.println(reverseLetterInAWord.reverseWords(s2)); // Output: "doG gniD"
    }
}
