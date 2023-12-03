package string;

public class StringReverser2 {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        for (int i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, n - 1);
            reverse(charArray, left, right);
        }

        return new String(charArray);
    }

    private void reverse(char[] charArray, int left, int right) {
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        StringReverser2 stringReverser = new StringReverser2();

        // Example 1
        String s1 = "abcdefg";
        int k1 = 2;
        System.out.println("Output 1: " + stringReverser.reverseStr(s1, k1));

        // Example 2
        String s2 = "abcd";
        int k2 = 2;
        System.out.println("Output 2: " + stringReverser.reverseStr(s2, k2));
    }
}

