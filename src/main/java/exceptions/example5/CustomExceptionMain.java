package exceptions.example5;

public class CustomExceptionMain {
    public static void main(String[] args) {

        try {
            siuskSaskaitaIbanka();
        } catch (FailedToSendInvoiceException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void siuskSaskaitaIbanka() throws FailedToSendInvoiceException {
        System.out.println("Siunciu saskaita...");
        boolean kazkasBlogo = true;
        if (kazkasBlogo) {
            throw new FailedToSendInvoiceException("Saskaita neissiusta");
        }
    }

}
