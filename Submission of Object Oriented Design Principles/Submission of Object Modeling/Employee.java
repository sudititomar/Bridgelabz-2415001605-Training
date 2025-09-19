import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    ArrayList<Employee> employees;

    Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    void addEmployee(Employee emp) {
        employees.add(emp);
    }

    void showEmployees() {
        System.out.println("Employees in " + deptName + ":");
        for (Employee emp : employees) {
            System.out.println(emp.name);
        }
    }
}

class Company {
    String companyName;
    ArrayList<Department> departments;

    Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            System.out.println("Department: " + dept.deptName);
            dept.showEmployees();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department dev = new Department("Development");
        dev.addEmployee(new Employee("Alice"));
        dev.addEmployee(new Employee("Bob"));

        Department hr = new Department("HR");
        hr.addEmployee(new Employee("Carol"));

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showCompanyStructure();

        // Composition: if comp is deleted, dev and hr and their employees are also deleted
        comp = null;
    }
}

