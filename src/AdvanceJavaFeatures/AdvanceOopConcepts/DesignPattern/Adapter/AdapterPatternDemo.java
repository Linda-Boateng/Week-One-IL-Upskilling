package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Adapter;

/*
    * Adapter pattern works as a bridge between two incompatible interfaces.
    * This type of design pattern comes under structural pattern
    * as this pattern combines the capability of two independent interfaces.
    * This class serves as the client.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
