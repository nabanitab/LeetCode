package string;

class VowelReverser {
    public String reverseVowels(String s) {
        char[] charArray = s.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Find the leftmost vowel
            while (left < right && !isVowel(charArray[left])) {
                left++;
            }

            // Find the rightmost vowel
            while (left < right && !isVowel(charArray[right])) {
                right--;
            }

            // Swap the vowels
            if (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }

        return new String(charArray);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        VowelReverser vowelReverser = new VowelReverser();

        // Test cases
        String test1 = "hello";
        System.out.println(vowelReverser.reverseVowels(test1));  // Output: "holle"

        String test2 = "leetcode";
        System.out.println(vowelReverser.reverseVowels(test2));  // Output: "leotcede"
    }
}
