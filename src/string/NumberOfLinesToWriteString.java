package string;

import java.util.Arrays;

public class NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int currentWidth = 0;

        for (char ch : s.toCharArray()) {
            int width = widths[ch - 'a'];

            if (currentWidth + width > 100) {
                lines++;
                currentWidth = width;
            } else {
                currentWidth += width;
            }
        }

        return new int[]{lines, currentWidth};
    }

    public static void main(String[] args) {
        NumberOfLinesToWriteString solution = new NumberOfLinesToWriteString();

        // Example 1
        int[] widths1 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        int[] result1 = solution.numberOfLines(widths1, s1);
        System.out.println(Arrays.toString(result1)); // Output: [3, 60]

        // Example 2
        int[] widths2 = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s2 = "bbbcccdddaaa";
        int[] result2 = solution.numberOfLines(widths2, s2);
        System.out.println(Arrays.toString(result2)); // Output: [2, 4]
    }
}
