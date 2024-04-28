package ExceptionHandlingInJava.CustomExceptionHandling;

public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}