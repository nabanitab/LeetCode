package string;
//You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
//Given the string command, return the Goal Parser's interpretation of command.
//Example 1:Input: command = "G()(al)"
//Output: "Goal"
//Explanation: The Goal Parser interprets the command as follows:
//G -> G
//() -> o
//(al) -> al
//The final concatenated result is "Goal".
public class GoalParserInterpretation {
    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < command.length(); i++) {
            char currentChar = command.charAt(i);
            if (currentChar == 'G') {
                result.append("G");
            } else if (currentChar == '(' && command.charAt(i + 1) == ')') {
                result.append("o");
                i++; // Increment i to skip ')' in next iteration
            } else if (currentChar == '(' && command.charAt(i + 1) == 'a') {
                result.append("al");
                i += 3; // Increment i to skip "al)" in next iteration
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String command = "G()(al)";
        String interpretation = interpret(command);
        System.out.println(interpretation); // Output: "Goal"
    }
}
