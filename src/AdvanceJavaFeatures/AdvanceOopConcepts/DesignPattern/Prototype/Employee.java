package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.Prototype;

public class Employee implements Prototype {

    private final String name;
    private final String designation;
    private final int salary;

    public Employee(String name, String designation, int salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public void showRecord(){
        System.out.println(STR."\{name}\t\{designation}\t\{salary}");
    }

    @Override
    public Prototype getClone() {
        return new Employee(name,designation,salary);
    }
}
