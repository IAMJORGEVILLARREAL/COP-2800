import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generates a random number between 0 and 100
        int randomNumber = random.nextInt(101); 
        int guess = -1;
        int tries = 1;
        // Statement that tells user they're playing number guessing game
        System.out.println("Welcome to the Number Guessing Game!");

        // While loop with nested if statement that tells the user to guess number and outputs wether their guess is too low or too high
        while (guess != randomNumber) {

            System.out.print("Guess the number (between 0 and 100): ");
            guess = scanner.nextInt();

            // If statement that tells whether users guess is too low or too high
            if (guess < randomNumber) {

                System.out.println("Too low, try again.");
                tries += 1;

            } else if (guess > randomNumber) {

                System.out.println("Too high, try again.");
                tries += 1;

            }
        }

        // If User guesses right, the system will output the statement along with the number of tries
        System.out.println("Congratulations! You guessed the correct number. ");

        System.out.println("It took you " + tries + " guesses.");

        scanner.close();
    }
}
