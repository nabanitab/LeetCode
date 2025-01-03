package gfgForMe;

// Java Program to Display Numbers
// from 1 to N Using For Loop and
// sum of First N Natural Number
public class SumOfNno {

    // main function
    public static void main(String[] args) {
        int N = 10;
        int sum = 0;
        System.out.println("Finding Sum of " + N + " numbers using for loop");

        // we initialize the value of the variable i
        // with 1 and increment each time with 1
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + N
                + " Natural Number = " + sum);
    }
}

