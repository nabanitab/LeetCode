package string;

public class FirstUniqueCharacter {

    public int firstUniqChar(String s) {
        int[] charCount = new int[26];

        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Find the first non-repeating character and return its index
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();

        // Example usage
        String s1 = "leetcode";
        System.out.println(firstUniqueCharacter.firstUniqChar(s1)); // Output: 0

        String s2 = "loveleetcode";
        System.out.println(firstUniqueCharacter.firstUniqChar(s2)); // Output: 2

        String s3 = "aabb";
        System.out.println(firstUniqueCharacter.firstUniqChar(s3)); // Output: -1
    }
}

