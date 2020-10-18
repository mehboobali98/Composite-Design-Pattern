package compositePattern;

import java.util.ArrayList;

public abstract class Employee {
    String name;
    double salary;
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    abstract void printInfo();
}

class Developer extends Employee{

    Developer(String name, double salary)
    {
        super(name,salary);
    }

    public void printInfo()
    {
        System.out.println("name: " + this.name + "salary: " + this.salary);
    }
}

class Manager extends Employee{
    ArrayList<Employee> e_list;
    Manager(String name, double salary) {
        super(name, salary);
        this.e_list = new ArrayList<>();
    }

    public void addEmployee(Employee e)
    {
        this.e_list.add(e);
    }

    public ArrayList<Employee> getE_list() {
        return e_list;
    }

    public void printInfo()
    {
        for(Employee e : e_list)
        {
            e.printInfo();
        }
    }

}