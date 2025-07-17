package Program8;
class Person {
    String firstName = "krish";
    String lastName = "yadav";

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    String jobTitle = " Developer";
    String employeeId = "8775545";

    String getLastName() {
        return lastName + " (" + jobTitle + ")";
    }

    String getEmployeeId() {
        return employeeId;
    }
}

public class Comapny {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
    }
}
