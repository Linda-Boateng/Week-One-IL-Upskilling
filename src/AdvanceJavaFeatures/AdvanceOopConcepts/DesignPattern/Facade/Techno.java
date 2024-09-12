package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Facade;

public class Techno implements Phones{
    @Override
    public void modelNo() {
        System.out.println("Techno Camon 16");
    }

    @Override
    public void price() {
        System.out.println("Price: 200$");
    }
}
