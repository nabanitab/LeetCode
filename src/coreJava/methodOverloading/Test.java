package coreJava.methodOverloading;

public class Test {

    public void test(Integer obj){
        System.out.println("with Integer reference");
    }
    public void test(String obj){
        System.out.println("with string reference");
    }

    public static void main(String[] args) {
        Test t = new Test();

        //to spacially print null we need to specify typecste
        t.test((String)null);
    }
}
