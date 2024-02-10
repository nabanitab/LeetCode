package numbersCheck;

class PrimeCounter {
    public int countPrimes(int n) {

        if (n <= 2) {
            return 0;
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        PrimeCounter primeCounter = new PrimeCounter();

        // Example Test Cases
        int test1 = 10;
        System.out.println("Number of primes less than " + test1 + ": " + primeCounter.countPrimes(test1));  // Output: 4

        int test2 = 0;
        System.out.println("Number of primes less than " + test2 + ": " + primeCounter.countPrimes(test2));  // Output: 0

        int test3 = 1;
        System.out.println("Number of primes less than " + test3 + ": " + primeCounter.countPrimes(test3));  // Output: 0
    }
}

