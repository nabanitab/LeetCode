package string;

public class ExcelSheetColumnTitleSolution {

    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust to 0-based index
            char currentChar = (char) ('A' + columnNumber % 26);
            result.insert(0, currentChar);
            columnNumber /= 26;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitleSolution solution = new ExcelSheetColumnTitleSolution();

        // Example usage
        int columnNumber1 = 1;
        System.out.println(solution.convertToTitle(columnNumber1)); // Output: "A"

        int columnNumber2 = 28;
        System.out.println(solution.convertToTitle(columnNumber2)); // Output: "AB"

        int columnNumber3 = 701;
        System.out.println(solution.convertToTitle(columnNumber3)); // Output: "ZY"
    }
}
