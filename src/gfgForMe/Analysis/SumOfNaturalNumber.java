package gfgForMe.Analysis;

//o/p : 1+2+3 = 6
public class SumOfNaturalNumber {

    public static void main(String[] args) {

        int n = 3;

        System.out.println(getNaturalNumber(n));
    }

    public static int getNaturalNumber(int n){
        int sum = 0;

        for(int i =1;i<=n; i++){

            sum = sum +i;
        }

       return sum;
    }
}
