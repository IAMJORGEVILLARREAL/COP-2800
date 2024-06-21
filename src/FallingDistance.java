public class FallingDistance {

    // Method to calculate the distance fallen by an object in free fall
    // Takes the time in seconds as input and returns the distance in meters
    public static double fallingDistance(double time) {
        final double GRAVITY = 9.8; // acceleration due to gravity in m/s^2
        return 0.5 * GRAVITY * time * time; // d = 1/2 * g * t^2
    }

    public static void main(String[] args) {
        // Loop from 1 to 10 to calculate and display distance fallen for each second
        for (int i = 1; i <= 10; i++) {
            double distance = fallingDistance(i); // Calculate distance for time i
            // Print the time and distance with 2 decimal places
            System.out.printf("Time: %d seconds, Distance: %.2f meters%n", i, distance);
        }
    }
}
