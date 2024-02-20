package arrayProgram;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;

        long output = getFactorial(n);
        System.out.println(output);
    }

    public static int getFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial can't less than 0");

        }

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
