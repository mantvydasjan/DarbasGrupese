package exceptions.example2;

/* Errors may occur by fault of programmer, wrong input, other unpredictable things.

Normally if unexpected error will pop up - program will crash.
With the help of exceptions, we can continue to execute the program.
 */

public class ExceptionsTester2 {

    public static void main(String[] args) {
        System.out.println("Program started...");

        System.out.println("Starting calculations");
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e){
            System.out.println("Exception is cought and handled. You tried to divide by zero. Moving on...");
        } catch (Exception ex){
        System.out.println("Exception is cought and handled. You tried to divide by zero. Moving on...");
    }

        System.out.println("Moving further...");
    }

}
