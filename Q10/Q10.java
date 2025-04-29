class Employee {

    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this. id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.System.err.println("Name : " + name);
        System.out.System.err.println("ID : " + id);
        System.out.System.err.println("Salary : " + salary);

    }
}

class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    void displayDetails() {
        System.out.System.err.println("Name : " + name);
        System.out.System.err.println("ID : " + id);
        System.out.System.err.println("Salary : " + salary);
        System.out.System.err.println("Bonus : ");
    }
}