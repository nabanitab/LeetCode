package arrayProgram;

public class ReplacingNumber {

public static void main(String[] args){

   int a=10;
   int b=20;

    System.out.println("Replace element of number,a = : "+ a +", b = "+ b);

      getReplaceNumber(a,b);
}

//a=10, b=20, g=0
    // g=10, a=0 =
private static void getReplaceNumber(int a,int b){
    int g= a;
    a=b;
    b = g;

System.out.println("after replacing element of number,a = : "+ a +", b = "+ b);

}

}





