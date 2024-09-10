package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Prototype;
/*
* Prototype Design Pattern
*Prototype Pattern says that cloning of an existing object
* instead of creating new one and can also be customized as per the requirement.
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("John","Manager",50000);
        emp.showRecord();
        Employee emp1 = (Employee) emp.getClone();
        emp1.showRecord();
    }
}
