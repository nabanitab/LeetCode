package arrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeautifulArray {

        public int[] beautifulArray(int n) {
            List<Integer> result = new ArrayList<>();
            result.add(1);

            while (result.size() < n) {
                List<Integer> temp = new ArrayList<>();

                // Add odd numbers
                for (int num : result) {
                    if (num * 2 - 1 <= n) {
                        temp.add(num * 2 - 1);
                    }
                }

                // Add even numbers
                for (int num : result) {
                    if (num * 2 <= n) {
                        temp.add(num * 2);
                    }
                }

                result = temp;
            }

            int[] beautifulArray = new int[n];
            for (int i = 0; i < n; i++) {
                beautifulArray[i] = result.get(i);
            }

            return beautifulArray;
        }

        public static void main(String[] args) {
            BeautifulArray solution = new BeautifulArray();

            // Test cases
            int[] result1 = solution.beautifulArray(4);
            System.out.println(Arrays.toString(result1));  // Output: [2,1,4,3]

            int[] result2 = solution.beautifulArray(5);
            System.out.println(Arrays.toString(result2));  // Output: [3,1,2,5,4]
        }
    }


