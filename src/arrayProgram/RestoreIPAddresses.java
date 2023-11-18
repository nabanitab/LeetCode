package arrayProgram;

import java.util.ArrayList;
import java.util.List;

//A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.
//
//For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
//Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.
//
//
//
//Example 1:
//
//Input: s = "25525511135"
//Output: ["255.255.11.135","255.255.111.35"]
public class RestoreIPAddresses {

    public static List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String s, int start, List<String> path, List<String> result) {
        if (start == s.length() && path.size() == 4) {
            result.add(String.join(".", path));
            return;
        }
        if (path.size() > 4) {
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (start + i <= s.length()) {
                String segment = s.substring(start, start + i);
                if ((segment.charAt(0) == '0' && segment.length() == 1) || (segment.charAt(0) != '0' && Integer.parseInt(segment) <= 255)) {
                    path.add(segment);
                    backtrack(s, start + i, path, result);
                    path.remove(path.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(restoreIpAddresses("25525511135"));
        System.out.println(restoreIpAddresses("0000"));
        System.out.println(restoreIpAddresses("101023"));
    }
}

