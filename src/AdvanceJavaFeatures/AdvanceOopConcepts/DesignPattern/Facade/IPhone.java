package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Facade;

public class IPhone implements Phones{
    @Override
    public void modelNo() {
        System.out.println("IPhone 12");
    }

    @Override
    public void price() {
        System.out.println("Price: 1000$");
    }
}
