package forLoopExample;

public class PrintStar {

    public static void main(String[] args) {
        printStar();
    }

    public static void printStar() {
        for (int i = 1; i <= 5; i++) { // Outer loop controls the number of rows
            for (int j = 1; j <= i; j++) { // Inner loop controls the number of asterisks in each row
                System.out.print("* "); // Print asterisk followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
