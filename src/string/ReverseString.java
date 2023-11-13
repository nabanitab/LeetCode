package string;

import java.util.Arrays;

class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap characters at the left and right pointers
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        ReverseString stringReverser = new ReverseString();

        char[] test1 = {'h', 'e', 'l', 'l', 'o'};
        stringReverser.reverseString(test1);
        System.out.println(Arrays.toString(test1));  // Output: ["o","l","l","e","h"]

        char[] test2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        stringReverser.reverseString(test2);
        System.out.println(Arrays.toString(test2));  // Output: ["h","a","n","n","a","H"]
    }
}
