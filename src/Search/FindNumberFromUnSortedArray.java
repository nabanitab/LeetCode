package Search;

//This is called linear search,used for unsorted small sort of data
//Time complexity :0(n)
public class FindNumberFromUnSortedArray {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        System.out.println(search(arr, 8)); // Output: 2
    }
}


