import java.util.ArrayList;

class UniversityCourse {
    String courseName;
    Professor professor;
    ArrayList<Student> students;

    UniversityCourse(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    void assignProfessor(Professor prof) {
        professor = prof;
        System.out.println(prof.name + " assigned to teach " + courseName);
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null)
            System.out.println("Professor: " + professor.name);
        System.out.println("Enrolled students:");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<UniversityCourse> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    void enrollCourse(UniversityCourse course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.courseName);
    }

    void showCourses() {
        System.out.println(name + "'s courses:");
        for (UniversityCourse c : courses) {
            System.out.println(c.courseName);
        }
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Dr. Smith");

        UniversityCourse c1 = new UniversityCourse("Data Structures");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        c1.assignProfessor(prof1);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);

        c1.showCourseDetails();

        s1.showCourses();
        s2.showCourses();
    }
}
