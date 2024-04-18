public class HigestElementReplace {
    public static void main(String[] args) {
        int arr [] = {16,17,4,3,5,2};
        System.out.println(getHighestreplaceNumber(arr));
    }

    private static int getHighestreplaceNumber(int arr[]){

        int higestElemnt = arr.length;

        for(int i = 1; i<arr.length; i++){
            if(arr[i]<higestElemnt){
                return higestElemnt;
            }
        }
        return -1;
    }
}
