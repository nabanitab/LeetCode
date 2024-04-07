package coreJava;

public class EqualsAndDoubleEqualMethod {
    public static void main(String args[]){
        String s1 = new String("durga");
        String s2 = new String("durga");

        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
    }
}
