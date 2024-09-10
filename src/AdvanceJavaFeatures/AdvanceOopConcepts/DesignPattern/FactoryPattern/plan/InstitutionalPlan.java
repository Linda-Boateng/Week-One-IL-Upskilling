package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.FactoryPattern.plan;

public class InstitutionalPlan implements Plan {
    public void getRate() {
        System.out.println("Institutional Plan Rate: 5.50");
    }

    public void calculateBill(int units) {
        System.out.println("Institutional Plan Bill: "+(units*5.50));
    }
}
