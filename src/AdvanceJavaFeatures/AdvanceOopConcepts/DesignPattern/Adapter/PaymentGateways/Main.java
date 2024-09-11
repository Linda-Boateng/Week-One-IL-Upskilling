package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Adapter.PaymentGateways;
/*
 OBJECT ADAPTER(Uses Composition)
 Flexible
 */
public class Main {
  public static void main(String[] args) {
    PaymentProcessor paymentProcessor = new PayPalAdapter(new PayPalPayment());
    paymentProcessor.pay(100);
  }
}
