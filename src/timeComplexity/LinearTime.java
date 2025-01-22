package timeComplexity;

/*      Big-O        Name	              Example
        O(1)	    Constant	         Accessing an array element
        O(log n)	Logarithmic	         Binary Search
        O(n)	     Linear	             Single loop iteration
        O(n log n)	Linearithmic	     Merge Sort
        O(n²)	     Quadratic	         Bubble Sort, Nested loops
        O(2ⁿ)	     Exponential	     Recursive Fibonacci
        O(n!)	      Factorial        	Generating all permutations*/
public class LinearTime {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int num : arr) {
            System.out.println(num); // O(n)
        }
    }
}


