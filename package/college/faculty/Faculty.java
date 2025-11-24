package college.faculty;
public class Faculty {
    private String name, subject;
    public Faculty(String name, String subject) {
        this.name = name; this.subject = subject;
    }
    public void display() {
        System.out.println("Faculty: " + name + ", Subject: " + subject);
    }
}
