
// Jorge Villarreal Soules

import java.util.Scanner;

public class TestAvgAndGrade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input test scores
        System.out.println("Enter Test Score 1:");
        double testScore1 = scanner.nextDouble();

        System.out.println("Enter Test Score 2:");
        double testScore2 = scanner.nextDouble();

        System.out.println("Enter Test Score 3:");
        double testScore3 = scanner.nextDouble();

        System.out.println("Enter Test Score 4:");
        double testScore4 = scanner.nextDouble();

        System.out.println("Enter Test Score 5:");
        double testScore5 = scanner.nextDouble();
        
        // Display grades for each test score
        System.out.println("Test Score 1: " + determineGrade(testScore1));
        System.out.println("Test Score 2: " + determineGrade(testScore2));
        System.out.println("Test Score 3: " + determineGrade(testScore3));
        System.out.println("Test Score 4: " + determineGrade(testScore4));
        System.out.println("Test Score 5: " + determineGrade(testScore5));

        // Calculate and display average score
        double avg = calcAverage(testScore1, testScore2, testScore3, testScore4, testScore5);
        System.out.println("Your Average Score Is: " + avg);

        scanner.close();
    }

    // Method to determine grade based on score
    public static String determineGrade(double score) {

        String grade;

        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score <= 89) {
            grade = "B";
        } else if (score >= 70 && score <= 79) {
            grade = "C";
        } else if (score >= 60 && score <= 69) {
            grade = "D";
        } else {
            grade = "F";
        }
        return grade;
    }
    
    // Method to calculate average score
    public static double calcAverage(double testScore1, double testScore2, double testScore3, double testScore4, double testScore5){

        return (testScore1 + testScore2 + testScore3 + testScore4 + testScore5) / 5;

    }
}
