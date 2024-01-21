package dataStructureByGFG;

public class SearchingUnsortedElement {
    public static void main(String[] args) {
        int arr [] = { 1,4,8,3,9,5};
        System.out.println(missingElement(arr));
    }

    public static int missingElement(int[] arr){
        int x = 8;
        for(int i = 0; i<arr.length; i++)
            if (arr[i]==x){
               return i;

            }
        return -1;
    }
}
