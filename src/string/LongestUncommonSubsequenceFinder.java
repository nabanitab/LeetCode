package string;

public class LongestUncommonSubsequenceFinder {
    public int findLongestUncommonSubsequence(String a, String b) {
        if (a.equals(b)) {
            return -1;
        } else {
            return Math.max(a.length(), b.length());
        }
    }

    public static void main(String[] args) {
        LongestUncommonSubsequenceFinder finder = new LongestUncommonSubsequenceFinder();

        // Example 1
        String a1 = "aba";
        String b1 = "cdc";
        System.out.println("Output 1: " + finder.findLongestUncommonSubsequence(a1, b1));

        // Example 2
        String a2 = "aaa";
        String b2 = "bbb";
        System.out.println("Output 2: " + finder.findLongestUncommonSubsequence(a2, b2));

        // Example 3
        String a3 = "aaa";
        String b3 = "aaa";
        System.out.println("Output 3: " + finder.findLongestUncommonSubsequence(a3, b3));
    }
}

