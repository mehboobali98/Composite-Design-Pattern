package compositePattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Manager manager = new Manager("Mehboob", 40000);

        Employee d1 = new Developer("Sajjad",20000);
        Employee d2 = new Developer("Shayan", 400000);
        Employee manager1 = new Manager("Usama", 20000);

        manager.addEmployee(d1);
        manager.addEmployee(d2);

        manager.addEmployee(manager1);
        manager.printInfo();
    }
}
