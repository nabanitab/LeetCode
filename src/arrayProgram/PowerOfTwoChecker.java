package arrayProgram;

public class PowerOfTwoChecker {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwoChecker checker = new PowerOfTwoChecker();

        // Example 1
        int n1 = 1;
        System.out.println("Output 1: " + checker.isPowerOfTwo(n1));

        // Example 2
        int n2 = 16;
        System.out.println("Output 2: " + checker.isPowerOfTwo(n2));

        // Example 3
        int n3 = 3;
        System.out.println("Output 3: " + checker.isPowerOfTwo(n3));
    }
}

