package string;

public class RansomNoteSolution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        // Count occurrences of each letter in magazine
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char ch : ransomNote.toCharArray()) {
            if (count[ch - 'a'] == 0) {
                return false; // Letter not available in magazine
            }
            count[ch - 'a']--;
        }

        return true;
    }

    public static void main(String[] args) {
        RansomNoteSolution solution = new RansomNoteSolution();

        String ransomNote1 = "a";
        String magazine1 = "b";
        System.out.println("Output 1: " + solution.canConstruct(ransomNote1, magazine1));

        String ransomNote2 = "aa";
        String magazine2 = "ab";
        System.out.println("Output 2: " + solution.canConstruct(ransomNote2, magazine2));

        String ransomNote3 = "aa";
        String magazine3 = "aab";
        System.out.println("Output 3: " + solution.canConstruct(ransomNote3, magazine3));
    }
}

