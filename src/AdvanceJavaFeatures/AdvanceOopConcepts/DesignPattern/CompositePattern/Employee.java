package AdvanceJavaFeatures.AdvanceOopConcepts.DesignPattern.CompositePattern;

public interface Employee {
    int getId();
    String getName();
    double getSalary();
    void print();
    void add(Employee employee);
    void remove(Employee employee);
    Employee getChild(int i);
}
