package ExceptionHandling;

public class CustomClassForException  extends RuntimeException{

    public CustomClassForException (String massage){
        super(massage);
    }

    public static void main(String[] args) {

        int x = 20;

        try {
            if (x < 18) {
                throw new CustomClassForException("Not eligible for voting. Minimum age required is 18.");

            }
            else {
                System.out.println("Eligible for voting.");
            }
        }catch (CustomClassForException ex){
            ex.printStackTrace();

        }
    }
}
