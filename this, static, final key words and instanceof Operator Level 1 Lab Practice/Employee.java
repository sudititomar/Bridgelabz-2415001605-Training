public class Employee {
    private static String companyName = "Your Company Name";
    private static int totalEmployees = 0;
    private final String id;  // final variable for employee ID
    private String name;
    private String designation;

    // Constructor using 'this' to initialize variables
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }

    // Method to display employee details with instanceof check
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID (final): " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Not an Employee instance");
        }
    }

    // Getters and setters (no setter for id since it's final)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getId() {
        return id;
    }
}
