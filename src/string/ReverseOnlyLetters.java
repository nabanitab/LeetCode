package string;

class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseOnlyLetters reverser = new ReverseOnlyLetters();

        // Test cases
        String s1 = "ab-cd";
        System.out.println(reverser.reverseOnlyLetters(s1)); // Output: "dc-ba"

        String s2 = "a-bC-dEf-ghIj";
        System.out.println(reverser.reverseOnlyLetters(s2)); // Output: "j-Ih-gfE-dCba"

        String s3 = "Test1ng-Leet=code-Q!";
        System.out.println(reverser.reverseOnlyLetters(s3)); // Output: "Qedo1ct-eeLg=ntse-T!"
    }
}

