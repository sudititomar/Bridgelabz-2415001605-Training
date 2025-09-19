import java.util.ArrayList;

class Subject {
    String name;
    int marks;

    Subject(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    int id;
    ArrayList<Subject> subjects;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
        subjects = new ArrayList<>();
    }

    void addSubject(Subject subject) {
        subjects.add(subject);
    }
}

class GradeCalculator {
    String calculateGrade(Student student) {
        int total = 0;
        for (Subject s : student.subjects) {
            total += s.marks;
        }
        int average = total / student.subjects.size();
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }
}

public class Main {
    public static void main(String[] args) {
        Student john = new Student("John", 101);
        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science", 85));

        GradeCalculator calculator = new GradeCalculator();
        String grade = calculator.calculateGrade(john);

        System.out.println(john.name + " has grade: " + grade);
    }
}
