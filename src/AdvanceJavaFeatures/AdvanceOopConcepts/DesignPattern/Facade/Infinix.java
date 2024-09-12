package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Facade;

public class Infinix implements Phones{
    @Override
    public void modelNo() {
        System.out.println("Infinix Hot 10");
    }

    @Override
    public void price() {
        System.out.println("Price: 150$");
    }
}
