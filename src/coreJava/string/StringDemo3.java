package coreJava.string;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = new String("Durga");
        s1.concat("soft");
        String s2 = s1.concat("soln");
        s1 = s1.concat("soft");
        System.out.println(s1);
        System.out.println(s2);
    }
}
