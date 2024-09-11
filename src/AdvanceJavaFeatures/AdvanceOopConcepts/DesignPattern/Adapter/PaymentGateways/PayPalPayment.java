package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Adapter.PaymentGateways;

public class PayPalPayment {
    public void makePayment(double amount) {
        System.out.println(STR."Payment of $\{amount} made using PayPal.");
    }
}
