package ExceptionHandling;

public class CustomExceptionForPractics extends RuntimeException {

    public CustomExceptionForPractics(String message) {
        super(message);
    }

    public static void main(String[] args) {

        int age = 10;

        try {
            if (age < 18) {
                throw new CustomExceptionForPractics("Not eligible");
            }
            System.out.println("Eligible");

        } catch (CustomExceptionForPractics ex) {
            ex.printStackTrace();
        }

    }
}

