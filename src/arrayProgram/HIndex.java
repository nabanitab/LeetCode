package arrayProgram;

public class HIndex {
    public static class Solution {
        public int hIndex(int[] citations) {
            int n = citations.length;
            int[] buckets = new int[n + 1];

            // Fill the buckets with the count of papers for each citation count
            for (int citation : citations) {
                if (citation >= n) {
                    buckets[n]++;
                } else {
                    buckets[citation]++;
                }
            }

            int sum = 0;

            // Traverse the buckets to find the h-index
            for (int i = n; i >= 0; i--) {
                sum += buckets[i];
                if (sum >= i) {
                    return i;
                }
            }

            return 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        int[] citations1 = {3, 0, 6, 1, 5};
        System.out.println("H-Index for citations1: " + solution.hIndex(citations1));

        int[] citations2 = {1, 3, 1};
        System.out.println("H-Index for citations2: " + solution.hIndex(citations2));
    }
}
