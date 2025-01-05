package gfgForMe;

//n = 9
//Proper Divisors of 9 are 1 and 3.
//Sum = 1+3 = 4 ≠ 9
//⇒ 9 is not a perfect number.

//Example 2:

//n = 6
//Proper Divisors of 6 are 1, 2 and 3.
//Sum = 1+2+3 = 6 = 6
//⇒ 6 is a perfect number

public class PerfectNumber {

    // Returns true if n is perfect
    static boolean isPerfect(int n)
    {
        // 1 is not a perfect number
        if (n == 1)
            return false;

        // sum will store the sum of proper divisors
        // As 1 is a proper divisor for all numbers
        // initialised sum with 1
        int sum = 1;

        // Looping through the numbers to check if they are
        // divisors or not
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }

        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == n)
            return true;

        return false;
    }

    // Driver program
    public static void main(String[] args)
    {
        int n = 6;

        // Call isPerfect function to
        // check if the number is perfect or not.
        if (isPerfect(n))
            System.out.println(n + " is a perfect number");
        else
            System.out.println(
                    n + " is not a perfect number");
    }
}
