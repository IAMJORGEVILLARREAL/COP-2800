// Jorge Villarreal Soules

import javax.swing.JOptionPane;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        // Get user's choice and computer's choice, then determine the winner
        int userChoice = getValidUserChoice();
        String computerChoice = generateComputerChoice();
        JOptionPane.showMessageDialog(null, "Computer chose: " + computerChoice);

        String result = determineWinner(userChoice, computerChoice);
        JOptionPane.showMessageDialog(null, result);
    }

    // Method to get a valid choice from the user
    public static int getValidUserChoice() {
        String[] options = { "Rock", "Paper", "Scissors" };
        // Display menu and get user's choice
        int choice = JOptionPane.showOptionDialog(null, "Choose your move:", "Rock Paper Scissors",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        // Validate user's choice
        if (choice >= 0 && choice < 3) {
            return choice; // Return valid choice
        } else {
            // If choice is invalid, display error message and ask again
            JOptionPane.showMessageDialog(null, "Invalid Choice. Please select one of the three options.");
            return getValidUserChoice(); // Recursive call to get a valid choice
        }
    }

    // Method to generate a random choice for the computer
    public static String generateComputerChoice() {
        Random random = new Random();
        int choice = random.nextInt(3);

        // Map random integer to Rock, Paper, or Scissors
        switch (choice) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return "Error";
        }
    }

    // Method to determine the winner based on user's choice and computer's choice
    public static String determineWinner(int userChoice, String computerChoice) {
        // Convert user's choice index to the actual move
        String[] options = { "Rock", "Paper", "Scissors" };
        String userMove = options[userChoice];

        // Determine the winner based on the rules
        if (userMove.equals(computerChoice)) {
            return "It's a tie!";
        } else if ((userMove.equals("Rock") && computerChoice.equals("Scissors"))
                || (userMove.equals("Paper") && computerChoice.equals("Rock"))
                || (userMove.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}
