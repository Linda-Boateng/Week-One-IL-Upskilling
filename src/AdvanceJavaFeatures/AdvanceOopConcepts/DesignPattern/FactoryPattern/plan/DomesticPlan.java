package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.FactoryPattern.plan;

public class DomesticPlan implements Plan {
    public void getRate() {
        System.out.println("Domestic Plan Rate: 3.50");
    }

    public void calculateBill(int units) {
        System.out.println("Domestic Plan Bill: "+(units*3.50));
    }
}
