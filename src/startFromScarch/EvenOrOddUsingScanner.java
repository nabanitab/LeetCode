package startFromScarch;

import java.util.Scanner;

public class EvenOrOddUsingScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (input % 2 == 0){
            System.out.println("Number is even: "+input);
        }else {
            System.out.println("Number is odd: "+input);
        }

        sc.close();
    }
}
