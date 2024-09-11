package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Adapter.CreditCard;

/*
    * This is the Target Interface :
    * This is what the client expects to work with.
    * It is the adapter's target interface.
 */
public interface CreditCard {
    void giveBankDetails();
    String getCreditCard();
}
