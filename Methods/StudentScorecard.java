package java_method;
import java.util.*;

public class StudentScorecard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);

        displayScorecard(scores, results);
    }

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + (int)(Math.random() * 61);
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return results;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nSNo\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t");
            System.out.print((int)results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t");
            System.out.println(getGrade(results[i][2]));
        }
    }
}
