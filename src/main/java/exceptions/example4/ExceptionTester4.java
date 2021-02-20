package exceptions.example4;

public class ExceptionTester4 {
    public static void main(String[] args) {

        int[] skaiciai = new int[10];
        try {
            int rezultatas = skaiciai[11] / 5;
            System.out.println(rezultatas);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Netinkamas masyvo elementas. Exception");
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Negalima dalinti is 0 arba NULLPointeris.");
        } catch (Exception e) {
            System.out.println("Bendrine klaide, nezinau kokio tipo.");
        }

    }
}
