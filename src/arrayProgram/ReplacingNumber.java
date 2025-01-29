package arrayProgram;

public class ReplacingNumber {

    public static void main(String args[]) {
        int a = 2;
        int b = 5;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        getReverseNo(a, b);
    }

    public static void getReverseNo(int a, int b) {
        int temp = b;
        b = a;
        a = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}




