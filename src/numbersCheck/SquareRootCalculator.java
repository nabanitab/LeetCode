package numbersCheck;

//leetcode :69
class SquareRootCalculator {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long left = 0;
        long right = x;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == x) {
                return (int) mid;
            } else if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Return the floor value of the square root
        return (int) right;
    }

    public static void main(String[] args) {
        SquareRootCalculator calculator = new SquareRootCalculator();

        // Example Test Cases
        int test1 = 4;
        System.out.println("Square root of " + test1 + ": " + calculator.mySqrt(test1));  // Output: 2

        int test2 = 8;
        System.out.println("Square root of " + test2 + ": " + calculator.mySqrt(test2));  // Output: 2
    }
}
