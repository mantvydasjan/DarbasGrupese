package exceptions.example5;

public class FailedToSendInvoiceException extends Exception {

    public FailedToSendInvoiceException(String message) {
        super(message);
    }
}
