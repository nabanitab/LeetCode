package testInterview;

import java.util.TreeSet;

public class SecondHighest {

        public static void main(String[] args) {
            int arr[] = {2, 3, 5, 22, 31, 6, 55, 89, 90, 91, 1001, 1000};
            System.out.println(getSecondLargest(arr));
        }

        public static int getSecondLargest(int[] arr) {
            TreeSet<Integer> treeSet = new TreeSet<>();

            // Add all elements to the TreeSet
            for (int num : arr) {
                treeSet.add(num);
            }

            // Remove the largest element
            treeSet.pollLast();

            // Return the new largest element, which is the second largest in the original array
            return treeSet.last();
        }
    }

