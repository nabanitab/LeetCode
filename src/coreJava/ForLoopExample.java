package coreJava;

public class ForLoopExample {
    public static void main(String[] args) {
        int arr [] = {2,5,9,0,6,4};

      int x = 4;

        int result = getTheElement(arr,x);

        if(x == result) {
            System.out.println("element present : "+result);
        }else {
            System.out.println("element not present");
        }
    }

    public static int getTheElement(int [] arr,int x){

        for (int i = 0; i<arr.length; i++){
           if (x == arr[i]){
             return x;
           }
        }
        return -1;
    }
}
