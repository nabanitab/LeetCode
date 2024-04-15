package coreJava.string;

public class StringBufferDemo2 {
    public static void main(String[] args) {


        StringBuffer sb1 = new StringBuffer("Durga");

        StringBuffer sb2 = new StringBuffer("Durga");

        System.out.println(sb1==sb2);

        //In stringbuffer .euals method is not over ridden,instead of this object class .equals method is overridden,
        //and it is meant for refference comparision,i.e we will get false as o/p.
        System.out.println(sb1.equals(sb2));

    }

}
