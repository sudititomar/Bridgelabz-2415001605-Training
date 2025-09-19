import java.util.ArrayList;

class Course {
    String name;
    ArrayList<Student> enrolledStudents;

    Course(String name) {
        this.name = name;
        enrolledStudents = new ArrayList<>();
    }

    void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    void showStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student s : enrolledStudents) {
            System.out.println(s.name);
        }
    }
}

class Student {
    String name;
    ArrayList<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    void enrollInCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void showCourses() {
        System.out.println(name + "'s courses:");
        for (Course c : courses) {
            System.out.println(c.name);
        }
    }
}

class School {
    String schoolName;
    ArrayList<Student> students;

    School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println(s.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        School school = new School("Greenwood High");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        school.addStudent(s1);
        school.addStudent(s2);

        Course math = new Course("Math");
        Course science = new Course("Science");

        s1.enrollInCourse(math);
        s1.enrollInCourse(science);

        s2.enrollInCourse(math);

        school.showStudents();

        s1.showCourses();
        s2.showCourses();

        math.showStudents();
        science.showStudents();
    }
}

