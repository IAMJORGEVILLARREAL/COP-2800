import java.util.Scanner;

public class TestScoresAndGrade {

    public static void main(String[] args) {

        // Declare variables to store test scores and average
        double score1, score2, score3;
        double average;

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter Test Score 1
        System.out.println("Enter Test Score 1: ");
        score1 = scanner.nextDouble();

        // Prompt the user to enter Test Score 2
        System.out.println("Enter Test Score 2: ");
        score2 = scanner.nextDouble();

        // Prompt the user to enter Test Score 3
        System.out.println("Enter Test Score 3: ");
        score3 = scanner.nextDouble();

        // Calculate the average of the three test scores
        average = (score1 + score2 + score3) / 3.0;

        // Display the average score
        System.out.println("Average Score: " + average);

        // Determine the grade based on the average score
        if (average >= 90 && average <= 100) {
            System.out.println("Grade: A");
        } else if (average >= 80 && average <= 89) {
            System.out.println("Grade: B");
        } else if (average >= 70 && average <= 79) {
            System.out.println("Grade: C");
        } else if (average >= 60 && average <= 69) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();
    }
}
