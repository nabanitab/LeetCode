package arrayProgram;


public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 20;

        System.out.println("Fibonacci numbers from 0 to " + n + ":");
        for (int i = 0; i <= n; i++) {
            System.out.println("Fibonacci[" + i + "] = " + fibonacciNumber(i));
        }
    }

    public static int fibonacciNumber(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int firstHold = 0;
        int lastHold = 1;
        int placeHolder = 0;  // Initialize placeHolder to 0

        for (int i = 2; i <= n; i++) {
            placeHolder = firstHold + lastHold;
            firstHold = lastHold;
            lastHold = placeHolder;
        }

        return placeHolder;
    }
}

