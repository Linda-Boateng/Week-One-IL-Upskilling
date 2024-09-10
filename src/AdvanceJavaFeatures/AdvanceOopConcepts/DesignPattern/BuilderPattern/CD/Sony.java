package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.BuilderPattern.CD;

public class Sony extends Company {
    @Override
    public int price() {
        return 24;
    }

    @Override
    public String pack() {
        return "Sony CD";
    }
}
