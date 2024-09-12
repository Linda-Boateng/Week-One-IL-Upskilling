package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class BankManager implements Employee{
    private int id;
    private String name;
    private double salary;

    public BankManager(int id,String name,double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("==========================");
        System.out.println(STR."Id =\{getId()}");
        System.out.println(STR."Name =\{getName()}");
        System.out.println(STR."Salary =\{getSalary()}");
        System.out.println("==========================");

        for (Employee employee : employeeList) {
            employee.print();
        }
    }

    @Override
    public void add(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void remove(Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public Employee getChild(int i) {
        return employeeList.get(i);
    }
}
