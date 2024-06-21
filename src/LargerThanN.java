
//Jorge Villarreal Soules

public class LargerThanN {

    /**
     * Displays numbers in the given array that are greater than a specified number.
     *
     * @param array The array containing integers.
     * @param n     The number to compare against.
     */
    public static void displayNumbersGreaterThanN(int[] array, int n) {
        System.out.println("Numbers greater than " + n + ":");
        for (int num : array) {
            if (num > n) {
                System.out.println(num);
            }
        }
    }

    /**
     * Main method to demonstrate the displayNumbersGreaterThanN method.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int n = 25;
        displayNumbersGreaterThanN(numbers, n);
    }
}
