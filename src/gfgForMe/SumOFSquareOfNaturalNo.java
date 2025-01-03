package gfgForMe;

import java.io.IOException;

public class SumOFSquareOfNaturalNo {
    // Return the sum of square of first n natural numbers
    static int squaresum(int n)
    {
        // Iterate i from 1 and n
        // finding square of i and add to sum.
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (i * i);
        return sum;
    }

    // Driven Program
    public static void main(String args[]) throws IOException
    {
        int n = 4;
        System.out.println(squaresum(n));
    }
}

