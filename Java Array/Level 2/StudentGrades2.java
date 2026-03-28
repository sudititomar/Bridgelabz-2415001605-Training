import java.util.Scanner;

public class StudentGrades2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                int mark = sc.nextInt();
                if (mark < 0) {
                    j--; 
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            percentages[i] = (total / 300.0) * 100;

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(marks[i][0] + " " + marks[i][1] + " " + marks[i][2] + " ");
            System.out.print(percentages[i] + " " + grades[i]);
            System.out.println();
        }

    }
}
