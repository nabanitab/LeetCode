package coreJava.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("Durga");
        String s2 = new String("Durga");

        System.out.println(s1==s2);//reference comparison
        System.out.println(s1.equals(s2));//content comparison
    }
}
