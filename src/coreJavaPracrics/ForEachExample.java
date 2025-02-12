package coreJavaPracrics;

public class ForEachExample {
    
    public static void main(String[] args){
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;  // Stops the loop at 5
            }
            System.out.println(i);
        }
    }
}
