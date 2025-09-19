import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    Department(String deptName) {
        this.deptName = deptName;
    }
    void showDepartment() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    String universityName;
    ArrayList<Department> departments;  // composition: owned by University
    ArrayList<Faculty> faculties;       // aggregation: independent existence

    University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    void showStructure() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department dept : departments)
            dept.showDepartment();

        System.out.println("Faculty members:");
        for (Faculty faculty : faculties)
            System.out.println(faculty.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Jones");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mathematics");

        University uni = new University("Global University");
        uni.addFaculty(f1);
        uni.addFaculty(f2);
        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.showStructure();

        // Composition: deleting uni deletes departments automatically
        uni = null;

        // Faculties can exist independently
        System.out.println("Faculty " + f1.name + " exists independently.");
    }
}

