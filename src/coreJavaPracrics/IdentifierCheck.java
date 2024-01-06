package coreJavaPracrics;

public class IdentifierCheck {
    public static void main (String[] args){
        int i = 10;
        // 1. int 123hdjh = 12; false
        // 2. int tom& = 12; false
        // 3. int tom123 = 12;  int tom_1 = 12;  int tom$hfd = 12; true
        int j= 20;
        int sum = i + j;
        System.out.println(sum);
    }
}
