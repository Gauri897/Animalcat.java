class Person {
    String getFirstName() {
        return "Gauri";
    }

    String getLastName() {
        return "Thakre";
    }
}

class Employee extends Person {
    String jobTitle = "Software Developer";

    String getEmployeeId() {
        return "EMP2025";
    }


    String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class Main7 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}
