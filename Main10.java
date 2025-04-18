class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String name, String address, String jobTitle, double salary) {
        this.name = name;
        this.address = address;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void calculateBonus() {
        System.out.println("Bonus: ₹" + (salary * 0.10));
    }

    void performanceReport() {
        System.out.println("Performance: Good");
    }
}

class Manager extends Employee {
    Manager(String name, String address, double salary) {
        super(name, address, "Manager", salary);
    }

    void manageProject() {
        System.out.println(name + " is managing a new project.");
    }
}

class Developer extends Employee {
    Developer(String name, String address, double salary) {
        super(name, address, "Developer", salary);
    }

    void manageProject() {
        System.out.println(name + " is developing a new app.");
    }
}

class Programmer extends Employee {
    Programmer(String name, String address, double salary) {
        super(name, address, "Programmer", salary);
    }

    void manageProject() {
        System.out.println(name + " is writing clean code.");
    }
}

public class Main10 {
    public static void main(String[] args) {
        Manager m = new Manager("Gauri", "Nagpur", 70000);
        m.calculateBonus();
        m.performanceReport();
        m.manageProject();
    }
}
