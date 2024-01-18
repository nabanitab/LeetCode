package dataStructureByGFG;

public class TailRecursiveProgram {
    public static int tailRecursive(int n, int accumulator){

        //base case
        if(n==0){
            return accumulator;
        }
        // Recursive call is the last operation
        return tailRecursive(n-1,addition(n,accumulator));
    }

    // Additional method
    public static int addition(int x, int y){
        return x+y;
    }

    public static void main(String[] args) {
        int result = tailRecursive(5,0);
        System.out.printf("output :"+(result));
    }
}
