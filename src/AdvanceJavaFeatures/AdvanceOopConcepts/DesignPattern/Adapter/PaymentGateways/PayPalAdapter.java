package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Adapter.PaymentGateways;

public class PayPalAdapter implements PaymentProcessor{
    private PayPalPayment payPalPayment;
   public PayPalAdapter(PayPalPayment payPalPayment){
       this.payPalPayment = payPalPayment;
   }
    @Override
    public void pay(int amount) {
        payPalPayment.makePayment(amount);
    }
}
