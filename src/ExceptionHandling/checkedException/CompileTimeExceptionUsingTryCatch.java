package ExceptionHandling.checkedException;

public class CompileTimeExceptionUsingTryCatch {
    public static void main(String[] args)  {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}
