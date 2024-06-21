// Jorge Villarreal Soules

import java.util.Random;

public class CoinTossForDollar {

    // Constants for the target balance and coin values
    static final double PLAY_TO = 1.00;
    static final double TWENTY_FIVE_CENTS = 0.25;
    static final double TEN_CENTS = 0.10;
    static final double FIVE_CENTS = 0.05;

    public static void main(String args[]) {

        // Create instances of Coin representing quarter, dime, and nickel
        Coin quarter = new Coin();
        Coin dime = new Coin();
        Coin nickel = new Coin();

        // Initialize balance to 0
        double balance = 0;

        // Display the start of the game
        System.out.println("Ready? Set? Go!");

        // Play the game until the balance reaches or exceeds PLAY_TO
        while (balance <= PLAY_TO) {

            // Toss each coin
            quarter.toss();
            dime.toss();
            nickel.toss();

            // Add the value of each coin if heads is facing up
            if (isHeadsUp(quarter)) {
                balance += TWENTY_FIVE_CENTS;
            }

            if (isHeadsUp(dime)) {
                balance += TEN_CENTS;
            }

            if (isHeadsUp(nickel)) {
                balance += FIVE_CENTS;
            }
        }

        // Display the final balance
        System.out.printf("Balance: $%,1.2f\n", balance);

        // Display the game result
        if (balance == PLAY_TO) {
            System.out.println("You win!");
        } else {
            System.out.println("You did not win.");
        }
    }

    // Method to check if a coin is showing heads
    public static boolean isHeadsUp(Coin coin) {
        return coin.getSideUp().equals("heads");
    }

    // Coin class representing a single coin
    static class Coin {
        private String sideUp;

        // Default constructor that tosses the coin
        public Coin() {
            toss();
        }

        // Method to simulate tossing the coin
        public void toss() {
            Random rand = new Random();
            int value = rand.nextInt(2);
            sideUp = (value == 0) ? "heads" : "tails";
        }

        // Accessor method to get the side facing up
        public String getSideUp() {
            return sideUp;
        }
    }
}
