package gfgForMe.ifElse;

import java.util.Scanner;


//check:
//1.positive Even,odd
//2.Negative Even,odd
//3. Zero
public class NestedFuntionUsingIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int n = sc.nextInt();

        if(n>0){
            System.out.println("positive Number.");
            if (n%2 == 0){
                System.out.println("Positive even");
            }else {
                System.out.println("positive odd");
            }
        } else if (n<0) {
            System.out.println("Negative number");
            if (n%2 == 0){
                System.out.println("Negative even");
            }else{
                System.out.println("Negative odd");
            }
        }else {
            System.out.println("Zero");
        }

    }
}
