package gfgForMe.ifElse;

import java.util.Scanner;

public class OldFat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>18 && n<100){
            System.out.println("fat and old");
        }else {
            System.out.println("not fat & old");
        }
    }
}
