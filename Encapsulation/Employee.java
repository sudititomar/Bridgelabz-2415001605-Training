abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public abstract double calculateSalary();
    public void displayDetails() {
        System.out.println(employeeId + " " + name + " " + calculateSalary());
    }
}

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    public double calculateSalary() { return getBaseSalary(); }
    public void assignDepartment(String dept) { department = dept; }
    public String getDepartmentDetails() { return department; }
}

class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private String department;
    public PartTimeEmployee(int id, String name, double salary, int workHours) {
        super(id, name, salary);
        this.workHours = workHours;
    }
    public double calculateSalary() { return workHours * 500; }
    public void assignDepartment(String dept) { department = dept; }
    public String getDepartmentDetails() { return department; }
}
