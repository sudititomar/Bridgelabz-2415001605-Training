import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        double r = Math.random();
        if (r < 1.0 / 3.0) return "rock";
        else if (r < 2.0 / 3.0) return "paper";
        return "scissors";
    }

    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Tie";
        switch (user) {
            case "rock" -> {
                if (computer.equals("scissors")) return "User";
                else return "Computer";
            }
            case "paper" -> {
                if (computer.equals("rock")) return "User";
                else return "Computer";
            }
            default -> {
                // user == scissors
                if (computer.equals("paper")) return "User";
                else return "Computer";
            }
        }
    }

    public static String[][] findStats(String[] results) {
        int userWins = 0, computerWins = 0, ties = 0;
        for (String res : results) {
                switch (res) {
                    case "User" -> userWins++;
                    case "Computer" -> computerWins++;
                    default -> ties++;
                }
        }
        int total = results.length;
        double userPercent = (userWins * 100.0) / total;
        double computerPercent = (computerWins * 100.0) / total;

        String[][] stats = new String[4][2];
        stats[0][0] = "Total Games";
        stats[0][1] = String.valueOf(total);
        stats[1][0] = "User Wins";
        stats[1][1] = String.valueOf(userWins);
        stats[2][0] = "Computer Wins";
        stats[2][1] = String.valueOf(computerWins);
        stats[3][0] = "Percentage Wins (User / Computer)";
        stats[3][1] = String.format("%.2f%% / %.2f%%", userPercent, computerPercent);
        return stats;
    }

    public static void displayResults(String[] userChoices, String[] computerChoices, String[] results, String[][] stats) {
        System.out.println("Game\tUser Choice\tComputer Choice\tWinner");
        for (int i = 0; i < userChoices.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\n", i + 1, userChoices[i], computerChoices[i], results[i]);
        }
        System.out.println();
        for (String[] stat : stats) {
            System.out.printf("%-35s : %s\n", stat[0], stat[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int n = sc.nextInt();

        String[] userChoices = new String[n];
        String[] computerChoices = new String[n];
        String[] results = new String[n];

        Scanner scString = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice for game " + (i + 1) + " (rock/paper/scissors): ");
            String userChoice = scString.nextLine().toLowerCase();
            while (!(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors"))) {
                System.out.print("Invalid input. Please enter rock, paper, or scissors: ");
                userChoice = scString.nextLine().toLowerCase();
            }
            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            userChoices[i] = userChoice;
            computerChoices[i] = compChoice;
            results[i] = winner;
        }

                String[][] stats = findStats(results);
                displayResults(userChoices, computerChoices, results, stats);
            }
        }
