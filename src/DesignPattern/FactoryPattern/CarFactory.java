package DesignPattern.FactoryPattern;

public class CarFactory {
    public static Car createCar(String carType) {
        if (carType.equalsIgnoreCase("sedan")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("suv")) {
            return new SUV();
        } else if (carType.equalsIgnoreCase("genesis")) {
      return new Genesis();
        } else {
            throw new IllegalArgumentException("Invalid car type.");
        }
    }

    public static void main(String[] args) {
        Car sedan = CarFactory.createCar("sedan");
        sedan.assemble(4,"Blue",3);
        sedan.installEngine();

        Car suv = CarFactory.createCar("suv");
        suv.assemble(6,"Black",4);
        suv.installEngine();

        Car genesis = CarFactory.createCar("genesis");
        genesis.assemble(5,"White",4);
        genesis.installEngine();
    }
}
