public class Student {
    private static String universityName = "GLA University";
    private static int totalStudents = 0;
    private final String rollNumber;  // final variable, unique for each student
    private String name;
    private char grade;

    // Constructor using 'this' to initialize variables
    public Student(String name, String rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display total students enrolled
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    // Method to display student details with instanceof check
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number (final): " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Not a Student instance");
        }
    }

    // Getter and setter for grade (rollNumber has no setter since final)
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    
    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }
}
