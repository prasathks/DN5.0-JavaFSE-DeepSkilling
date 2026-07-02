// Simulating Constructor and Setter Injection
class Employee {
    private String name;
    private String department;
    
    // Constructor Injection
    public Employee(String name) {
        this.name = name;
        System.out.println("Constructor Injection: Name set to " + name);
    }
    
    // Setter Injection
    public void setDepartment(String department) {
        this.department = department;
        System.out.println("Setter Injection: Department set to " + department);
    }
    
    public void showDetails() {
        System.out.println("Employee: " + name + ", Dept: " + department);
    }
}

public class InjectionTest {
    public static void main(String[] args) {
        // Simulate Spring's Dependency Injection
        Employee emp = new Employee("Prasath K S"); // Constructor injection
        emp.setDepartment("Java FSE"); // Setter injection
        emp.showDetails();
    }
}
