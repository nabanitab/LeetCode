package dataStructureByGFG;

public class InsertElement {
    public static void main(String[] args) {
        int arr[] = {5, 10, 20,8};
        int n = 3; // Initial size of the array
        int x = 7; // Element to be inserted
        int cap = 10; // Capacity of the array (assuming some initial capacity)
        int pos = 2; // Position at which the element should be inserted

        n = insertElementToArray(arr, n, x, cap, pos);

        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //driver method
    public static int insertElementToArray(int arr[], int n, int x, int cap, int pos) {
        if (n == cap) {
            System.out.println("Array is full. Cannot insert more elements.");
            return n;
        }

        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }
        arr[idx] = x;

        return (n + 1);
    }
}
