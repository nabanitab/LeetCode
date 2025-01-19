package gfgForMe.ifElse;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no : ");

        int n = sc.nextInt();

        if(n>0){
            System.out.println("positive number");
        }else {
            System.out.println("negative number");
        }
    }
}
