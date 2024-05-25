package interview;

public class SecondHighestElement {
    public static int findSecondLargest(int[] arr) {

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = number;
            } else if (number > secondLargest && number != firstLargest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array must contain at least two unique elements.");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99, 30};
        try {
            int secondLargest = findSecondLargest(arr);
            System.out.println("The second largest number is: " + secondLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}