package CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Consider a group of objects as a single object,
 * It creates a class which contains its own object group.
 * For example,the list in this class.Using composite can
 * easily shows the object group's tree structure.
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name,String dept,int sal){
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e){
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
