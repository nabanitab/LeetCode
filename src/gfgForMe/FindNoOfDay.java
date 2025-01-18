package gfgForMe;

import java.util.Scanner;

// 0-> sunday, 1-> monday,......6->Saturday
//if we take d=1, and n= 1. o/p :
public class FindNoOfDay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        int x = n%7;
        int ans = d-x;

        if(ans>0){
            System.out.println(ans);
        }else {
            System.out.println(ans+7);
        }
    }

}
