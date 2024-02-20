package ExceptionHandling;

public class CustomClassForException  extends Exception{


    public CustomClassForException (String massage){
        super("vhhjgjh");
    }

    public static void main(String[] args) {

        int x = 10;

        try {
            if (x <= 18) {
                throw new CustomClassForException("eligeble");
            }
            System.out.println("vgvhvh");

        }catch (CustomClassForException ex){
            ex.printStackTrace();

        }
    }
}
