
// Jorge Villarreal Soules

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {
        // ArrayList to store responses
        ArrayList<String> responses = new ArrayList<>();

        // Read responses from file into the ArrayList
        try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/jvill/Downloads/Source Code.zip/Chapter 07/8_ball_responses.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                responses.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        // Random object to generate random index
        Random random = new Random();

        // Main loop for asking questions
        while (true) {
            System.out.println("Ask a yes or no question (or type 'quit' to exit):");
            String question = scanner.nextLine();

            if (question.equalsIgnoreCase("quit")) {
                break;
            }

            // Generate a random index to select a response from the list
            int index = random.nextInt(responses.size());
            String response = responses.get(index);

            System.out.println("Magic 8 Ball says: " + response);
        }

        scanner.close();
    }
}
