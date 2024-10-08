package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.FactoryPattern.car;

public class SUV implements Car {
    private int seats;
    private String color;
    private int doors;
    @Override
    public void assemble(int seats,String color, int doors) {
        this.seats = seats;
        this.color = color;
        this.doors = doors;
        System.out.println("SUV Body Assembled with "+seats+ " seats and coloured "+color+ " and "+doors+ " doors.");
    }

    @Override
    public void installEngine() {
        System.out.println("SUV Engine Installed....");
    }
}
