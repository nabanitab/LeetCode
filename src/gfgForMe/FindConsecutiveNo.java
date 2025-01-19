package gfgForMe;

import java.util.Scanner;

//1,2,3,4,5,6 : 1 o/p
public class FindConsecutiveNo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(nthConsicutive(a,d,n));
    }

    public static int nthConsicutive(int a, int d, int n){
        int ans = a+(n-1)*d;

        return ans;
    }
}
