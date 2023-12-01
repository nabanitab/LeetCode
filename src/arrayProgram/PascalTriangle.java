package arrayProgram;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        // First row
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            // First element of each row is always 1
            row.add(1);

            // Calculate the values for the rest of the elements in the row
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // Last element of each row is always 1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);

        // Print the result
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}

