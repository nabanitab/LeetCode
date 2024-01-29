package dataStructureByGFG;

public class SumOfNthNUmber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(getNthSum(n));
    }

        public static int getNthSum( int n){

            if(n== 0){
                return 0;

            }


            return n + getNthSum(n-1);
        }
}
