package forLoopExample;

public class ForLoopDemo {
    public static void main(String[] args) {
        int arr [] = {2,3,5,8,9,10,11};
        int x = 10;

        System.out.println(getForLoopDemo(arr,x));
    }

    public static int getForLoopDemo(int [] arr,int x) {

        for (int i = 0; i < arr.length; i++)

            if (x == arr[i]) {
                return i;
            }
            return -1;

    }
}
