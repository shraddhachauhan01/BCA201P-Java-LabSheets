class Employee {
    int empId;
    double salary;
    static String companyName = "ABC Company";

    Employee(int empId, double salary) {
        this.empId = empId;
        this.salary = salary;
    }

    void display() {
        String details = "Employee ID: " + empId + ", Salary: " + salary;
        System.out.println(details);
        System.out.println("Company: " + companyName);
    }
}

public class Q04 {
    public static void main(String[] args) {
        Employee e = new Employee(101, 35000);
        e.display();
    }
}
