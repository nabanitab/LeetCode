package arrayProgram;

    public class SecondLargestElement {
        public static void main(String[] args) {
            int[] array = {5, 2, 8, 9, 1, 7, 3};

            int secondLargest = findSecondLargest(array);

            System.out.println("Second Largest Element: " + secondLargest);
        }

        private static int findSecondLargest(int[] nums) {
            if (nums.length < 2) {
                System.out.println("Array should have at least two elements");
                return -1;
            }

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : nums) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("There is no second largest element.");
                return -1;
            }

            return secondLargest;
        }
    }

