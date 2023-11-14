package string;

public class AddString {

        public String addStrings(String num1, String num2) {
            StringBuilder result = new StringBuilder();
            int carry = 0;

            int i = num1.length() - 1;
            int j = num2.length() - 1;

            while (i >= 0 || j >= 0 || carry > 0) {
                int x = (i >= 0) ? num1.charAt(i) - '0' : 0;
                int y = (j >= 0) ? num2.charAt(j) - '0' : 0;

                int sum = x + y + carry;
                result.insert(0, sum % 10);
                carry = sum / 10;

                i--;
                j--;
            }

            return result.toString();
        }

        public static void main(String[] args) {
            AddString solution = new AddString();

            // Test cases
            String test1Num1 = "11";
            String test1Num2 = "123";
            System.out.println(solution.addStrings(test1Num1, test1Num2));  // Output: "134"

            String test2Num1 = "456";
            String test2Num2 = "77";
            System.out.println(solution.addStrings(test2Num1, test2Num2));  // Output: "533"

            String test3Num1 = "0";
            String test3Num2 = "0";
            System.out.println(solution.addStrings(test3Num1, test3Num2));  // Output: "0"
        }
    }


