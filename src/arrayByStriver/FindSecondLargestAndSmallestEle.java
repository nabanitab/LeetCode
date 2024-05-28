package arrayByStriver;
//letcode
public class FindSecondLargestAndSmallestEle {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 8, 9};

        int secondLargest = getSecondHighest(arr);
        int secondSmallest = getSecondSmallest(arr);

        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static int getSecondHighest(int[] arr) {
        if (arr.length < 2) {
            return -1; // Not enough elements
        }

        int firstEle = Integer.MIN_VALUE;
        int secondEle = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstEle) {
                secondEle = firstEle;
                firstEle = arr[i];
            } else if (arr[i] > secondEle && arr[i] < firstEle) {
                secondEle = arr[i];
            }
        }

        return (secondEle == Integer.MIN_VALUE) ? -1 : secondEle;
    }

    public static int getSecondSmallest(int[] arr) {
        if (arr.length < 2) {
            return -1; // Not enough elements
        }

        int firstEle = Integer.MAX_VALUE;
        int secondEle = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < firstEle) {
                secondEle = firstEle;
                firstEle = arr[i];
            } else if (arr[i] < secondEle && arr[i] > firstEle) {
                secondEle = arr[i];
            }
        }

        return (secondEle == Integer.MAX_VALUE) ? -1 : secondEle;
    }
}
