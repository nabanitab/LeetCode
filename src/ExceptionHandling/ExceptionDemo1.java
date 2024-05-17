package ExceptionHandling;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            badMethod();
        }catch (Exception ex){
            //It is not print bcz catch is only for  exception,but here it throw error .
            System.out.println("C");

        }finally {
            System.out.println("D");
        }
    }

    public static void badMethod(){
        throw new Error();
    }
}
