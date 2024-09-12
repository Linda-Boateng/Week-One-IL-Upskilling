package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.CompositePattern;

public class CompositeDemo {


    public static void main(String args[]) {
        Employee emp1=new Cashier(101,"Omari Emmanuel", 20000.0);
        Employee emp2=new Cashier(102,"Linda Pomaa", 25000.0);
        Employee emp3=new Accountant(103,"Selma Opoku", 30000.0);
        Employee manager1=new BankManager(100,"Pat Akos", 100000.0);
        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.print();

    }
}
