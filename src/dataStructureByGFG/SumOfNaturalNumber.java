package dataStructureByGFG;
public class SumOfNaturalNumber {

    public static void main(String[] args) {
        int n = 10;
        long sum = calculateSum(n);

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }

    private static long calculateSum(int n) {
        return (long) n * (n + 1) / 2;
    }
    }


