import java.util.Scanner;

public class Population {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get starting number of organisms
        int startingNumber;
        do {
            System.out.print("Enter the starting number of organisms (at least 1): ");
            startingNumber = scanner.nextInt();
            if (startingNumber < 1) {
                System.out.println("Please enter a number greater than or equal to 1.");
            }
        } while (startingNumber < 1);

        // Get average daily population increase percentage
        double dailyIncreasePercentage;
        do {
            System.out.print("Enter the average daily population increase percentage: ");
            dailyIncreasePercentage = scanner.nextDouble();
            if (dailyIncreasePercentage <= 0) {
                System.out.println("Please enter a number greater than 0.");
            }
        } while (dailyIncreasePercentage <= 0);

        // Get number of days
        int numberOfDays;
        do {
            System.out.print("Enter the number of days the organisms will multiply for: ");
            numberOfDays = scanner.nextInt();
            if (numberOfDays < 1) {
                System.out.println("Please enter a number greater than or equal to 1.");
            }
        } while (numberOfDays < 1);

        // Predict the population size for each day
        double population = startingNumber;
        for (int i = 1; i <= numberOfDays; i++) {
            population *= (1 + (dailyIncreasePercentage / 100));
            System.out.println("Day " + i + ": Population = " + population);
        }

        scanner.close();
    }
}
