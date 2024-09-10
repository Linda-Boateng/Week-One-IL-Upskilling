package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Prototype;
/*
* Prototype Design Pattern
*
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("John","Manager",50000);
        emp.showRecord();
        Employee emp1 = (Employee) emp.getClone();
        emp1.showRecord();
    }
}
