package arrayProgram;

public class AddDigits {
    public int addDigits(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);
        }
        return num;
    }


    private int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        AddDigits solution = new AddDigits();

        // Example 1
        int num1 = 38;
        System.out.println("Output 1: " + solution.addDigits(num1)); // Output: 2

        // Example 2
        int num2 = 0;
        System.out.println("Output 2: " + solution.addDigits(num2)); // Output: 0
    }
}

