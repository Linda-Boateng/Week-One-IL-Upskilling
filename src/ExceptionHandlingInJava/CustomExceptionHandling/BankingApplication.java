package ExceptionHandlingInJava.CustomExceptionHandling;

public class BankingApplication {

    private static final double MINIMUM_BALANCE = 1000.0;

    public static double withdraw(double amount) throws InsufficientBalanceException {
        double currentBalance = getAccountBalance(); // Get the current account balance

        if (currentBalance - amount < MINIMUM_BALANCE) {
            throw new InsufficientBalanceException("Insufficient balance to perform the withdrawal.");
        }
      return currentBalance - amount;
    }

    public static double getAccountBalance() {
        return 2000.0; // Example balance for demonstration purposes
    }

    public static void main(String[] args) {
        try {
           System.out.println("Money Withdrawn. Remaining balance is: "+withdraw(1500.0));
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
