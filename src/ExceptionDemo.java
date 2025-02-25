import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        
        // Prompt user enter numbers
        Scanner input = new Scanner(System.in); 

        int a, b;

        try {

            System.out.print("Enter two integers: ");
            a = input.nextInt();
            b = input.nextInt();

            System.out.println(a + " + " + b + " = " + (a+b));
            System.out.println(a + " - " + b + " = " + (a-b));
            System.out.println(a + " * " + b + " = " + (a*b));
            System.out.println(a + " / " + b + " = " + (a/b));
            System.out.println(a + " % " + b + " = " + (a%b));
        }

        // Search: Java Exception Hierarchy in Google to verify order
        catch (InputMismatchException ime) {// You can have as many catches as you want, but order matters! (Most specific first, then most general exception must be last)! 
            System.out.println("ERROR: Input value must be an integer. ");
        }
        
        catch (ArithmeticException ae) {
            System.out.println("ERROR: Cannot be divided by zero. ");
        }
        
        catch (Exception e) { // Pro: Exception will catch every type of exception Con: It doesn't tell you what exception error happened 
            System.out.println("ERROR: An unknown error occured. "); // Basic way to display a message
            // System.out.println(e.getMessage()); // getMessage() gives the crash message in a simple string method (stacktrace)
            // e.getStackTrace(); // Gives a list of all the functions that happened 
        }
    }
}