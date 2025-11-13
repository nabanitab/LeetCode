package arrayProgram.practics;

public class ArrayProgram {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        //find element as per index
        System.out.println("ele on 0 index: " + arr[0]);
        System.out.println("ele on 3 index: " + arr[3]);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int num : arr) {
            System.out.println(num);
        }

        //Max number find
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max num:" + max);

        //sum of all element
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

        }
        System.out.println("Sum: " + sum);

        int odd = 0;
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);

        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("\nReversed array: ");
        for (int n : arr) System.out.print(n + " ");

    }
}

