package forLoopExample;

public class IndexValCount {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 3, 2, 2, 7, 9,3};
        System.out.println(getIndexNo(arr));
    }
    public static int getIndexNo(int arr []){

        for (int i = 0; i<arr.length; i++){
            return arr.length;
        }
        return -1;
    }
}
