class Employee {
    void work() {
        System.out.println("Employee works");
    }

    double getSalary() {
        return 25000;
    }
}

class HRManager extends Employee {
   
    void work() {
        System.out.println("HR manages hiring process");
    }

    void addEmployee() {
        System.out.println("New employee added to system");
    }
}

public class Main4 {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        hr.addEmployee();
        System.out.println("Salary: ₹" + hr.getSalary());
    }
}
