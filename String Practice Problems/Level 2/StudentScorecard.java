import java.util.Random;

public class StudentScorecard {

    public static int[][] generateRandomScores(int students) {
        int[][] scores = new int[students][3];
        Random rand = new Random();
        for (int i = 0; i < students; i++) {
            scores[i][0] = rand.nextInt(91) + 10; // Physics: 10 to 100
            scores[i][1] = rand.nextInt(91) + 10; // Chemistry: 10 to 100
            scores[i][2] = rand.nextInt(91) + 10; // Maths: 10 to 100
        }
        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; // total, average, percentage
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100.0;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) grades[i] = "A+";
            else if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B+";
            else if (percentage >= 60) grades[i] = "B";
            else if (percentage >= 50) grades[i] = "C";
            else if (percentage >= 35) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\t\t%s\n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        int students = 10; 
        int[][] scores = generateRandomScores(students);
        double[][] results = calculateTotalAveragePercentage(scores);
        String[] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }
}
