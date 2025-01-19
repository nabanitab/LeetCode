package gfgForMe;

import java.util.Scanner;

public class FindConsecutiveRatioNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(getRatio(a,r,n));

    }

    public static int getRatio(int a, int r, int n){
        int ans = a*(int)(Math.pow(r,n-1));
        return ans;
    }
}
