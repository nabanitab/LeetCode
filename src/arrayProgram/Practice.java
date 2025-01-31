package arrayProgram;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6};
        int temp = 2;

        getTheNumber(arr, temp);
    }

    private static void getTheNumber(int[] arr, int temp) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp) {
                System.out.println("Number found at index: " + i);
                return;
            }
        }
        System.out.println("Number not found");
    }
}



