package sortingByGFG;


import java.util.Arrays;
import java.util.Comparator;

class MyCmp implements Comparator<Integer>

    {
        // Sorts the Integers
        public int compare(Integer a, Integer b)
        {
            return a%2 - b%2;
        }
    }

    // Main class
    class Test
    {
        public static void main(String[] args)
        {
            // Integer array
            Integer[] arr = {5, 20, 10, 3, 12};

            // Sorting arrays by passing
            // arr and MyCmp object
            Arrays.sort(arr, new MyCmp());

            // Displaying the sorted array
            System.out.println(Arrays.toString(arr));
        }
    }


