class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    Manager(String name, double salary) {
        super(name, salary);
    }

    void showRole() {
        System.out.println("Role: Manager");
    }
}

class Developer extends Employee {
    Developer(String name, double salary) {
        super(name, salary);
    }

    void showRole() {
        System.out.println("Role: Developer");
    }
}

class Main {
    public static void main(String[] args) {
        Manager mgr1 = new Manager("Bob", 70000);
        mgr1.display();
        mgr1.showRole();
        System.out.println();

        Developer dev1 = new Developer("Charlie", 60000);
        dev1.display();
        dev1.showRole();
    }
}
