package ExceptionHandling;

public class CustomException extends RuntimeException{

    public CustomException (String massage){
        super("not eligible for voting");
    }

    public static void main(String[] args) {
        int x = 0;
        try{
            if(x<=18){
                throw new CustomException("eligible for voting ");
            }
            System.out.println("not eligible for voting");
        }catch (CustomException ex){
            ex.printStackTrace();
        }
    }

}
