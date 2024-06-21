// Jorge Villarreal Soules

import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Input Score 1-3
        System.out.println("Enter Test Score 1: ");
        double score1 = scanner.nextDouble();

        System.out.println("Enter Test Score 2: ");
        double score2 = scanner.nextDouble();

        System.out.println("Enter test 3: ");
        double score3 = scanner.nextDouble();

        // Calculate the average of the three scores
        double average = (score1 + score2 + score3) /3.0;

        // Displays each test score and the average
        System.out.println("Score 1: " + score1);
        System.out.println("Score 1: " + score2);
        System.out.println("Score 1: " + score3);
        System.out.println("Average Score: " + average);

        scanner.close();
    }
}
