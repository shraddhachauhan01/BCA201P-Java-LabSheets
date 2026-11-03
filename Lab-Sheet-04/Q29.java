class Employee {
    String name;
    double salary;
    static String organization = "ABC Ltd";

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void compareSalary(Employee other) {
        System.out.println("Organization: " + organization);
        if (salary > other.salary) {
            System.out.println(name + " has a higher salary");
        } else if (salary < other.salary) {
            System.out.println(other.name + " has a higher salary");
        } else {
            System.out.println("Both employees have equal salaries");
        }
    }
}

public class Q29 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aman", 40000);
        Employee e2 = new Employee("Riya", 45000);
        e1.compareSalary(e2);
    }
}
