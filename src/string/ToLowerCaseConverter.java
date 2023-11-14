package string;

public class ToLowerCaseConverter {
    public static String toLowerCase(String s) {
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {

        String input1 = "Hello";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + toLowerCase(input1));  // Output: "hello"
        System.out.println();

        String input2 = "here";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + toLowerCase(input2));  // Output: "here"
        System.out.println();

        String input3 = "LOVELY";
        System.out.println("Input: " + input3);
        System.out.println("Output: " + toLowerCase(input3));  // Output: "lovely"
    }
}

