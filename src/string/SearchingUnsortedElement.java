package string;

public class SearchingUnsortedElement {
    public static void main(String[] args) {
        int arr [] = {2,6,9,5,3,1};
        System.out.println(searchingElement(arr));
    }

    public static int searchingElement(int[] arr){
        int missingElement = 1;
        for (int i = 0 ; i<arr.length; i++)
            if (arr[i] == missingElement){
                return i;
            }
        return -1;
    }
}
