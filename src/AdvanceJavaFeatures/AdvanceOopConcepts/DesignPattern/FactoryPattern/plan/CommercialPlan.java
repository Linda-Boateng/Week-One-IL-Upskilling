package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.FactoryPattern.plan;

public class CommercialPlan implements Plan {
    public void getRate() {
        System.out.println("Commercial Plan Rate: 7.50");
    }

    public void calculateBill(int units) {
        System.out.println("Commercial Plan Bill: "+(units*7.50));
    }
}
