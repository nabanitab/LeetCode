package hashSet;
import java.util.*;
public class LongestSubStringPossible {


        public static int lengthOfLongestSubstring(String s) {
            int n = s.length();
            Set<Character> set = new HashSet<>();
            int ans = 0, i = 0, j = 0;
            while (i < n && j < n) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j++));
                    ans = Math.max(ans, j - i);
                } else {
                    set.remove(s.charAt(i++));
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            String s = "abcabcbb";
            int longestLength = lengthOfLongestSubstring(s);
            System.out.println("Length of longest substring without repeating characters: " + longestLength);
        }
    }


