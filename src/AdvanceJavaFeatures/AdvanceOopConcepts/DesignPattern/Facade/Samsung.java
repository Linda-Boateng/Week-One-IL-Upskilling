package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Facade;

public class Samsung implements Phones{
    @Override
    public void modelNo() {
        System.out.println("Samsung Galaxy S21");
    }

    @Override
    public void price() {
        System.out.println("Price: 500$");
    }
}
