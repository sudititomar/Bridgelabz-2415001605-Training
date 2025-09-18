public class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private final String patientID;  // final unique identifier
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to initialize variables
    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get total number of patients admitted
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details with instanceof check
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID (final): " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Not a Patient instance");
        }
    }

    // Getters and setters (no setter for patientID since it's final)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public String getPatientID() {
        return patientID;
    }
}
