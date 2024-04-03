package interviews;

public class PrimeCheck {

    public static void main(String[] args) {

        int n = 2;
        System.out.println(getPrime(n));
    }

    public static  boolean getPrime(int n){
        if(n<=1){
            return false;
        }

        for (int i = 2;  i<n; i++){
            if (n % i == 0)
            return true;
        }

        return false;
    }
}
