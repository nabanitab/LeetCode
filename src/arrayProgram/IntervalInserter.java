package arrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetCode :57
public class IntervalInserter {

        public int[][] insert(int[][] intervals, int[] newInterval) {

            List<int[]> result = new ArrayList<>();
            int i = 0;

            // Add intervals before newInterval
            while (i < intervals.length && intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
                i++;
            }

            // Merge overlapping intervals with newInterval
            while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                i++;
            }

            result.add(newInterval);

            // Add remaining intervals after newInterval
            while (i < intervals.length) {
                result.add(intervals[i]);
                i++;
            }

            return result.toArray(new int[result.size()][]);
        }

        public static void main(String[] args) {
            IntervalInserter inserter = new IntervalInserter();

            // Example Test Cases
            int[][] test1 = {{1, 3}, {6, 9}};
            int[] newInterval1 = {2, 5};
            System.out.println(Arrays.deepToString(inserter.insert(test1, newInterval1)));
            // Output: [[1,5],[6,9]]

            int[][] test2 = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
            int[] newInterval2 = {4, 8};
            System.out.println(Arrays.deepToString(inserter.insert(test2, newInterval2)));
            // Output: [[1,2],[3,10],[12,16]]
        }
    }


